package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of resources composed into a single coherent clinical statement with clinical attestation
  */
trait Composition extends DomainResource {
  /**
    * Contains extended information for property 'confidentiality'.
    */
  var _confidentiality: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Attests to accuracy of composition
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.undefined
  /**
    * Who and/or what authored the composition
    */
  var author: js.Array[Reference]
  /**
    * Categorization of Composition
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * As defined by affinity domain
    */
  var confidentiality: js.UndefOr[code] = js.undefined
  /**
    * Organization which maintains the composition
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  /**
    * Composition editing time
    */
  var date: dateTime
  /**
    * Context of the Composition
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
    * The clinical service(s) being documented
    */
  var event: js.UndefOr[js.Array[CompositionEvent]] = js.undefined
  /**
    * Logical identifier of composition (version-independent)
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Relationships to other compositions/documents
    */
  var relatesTo: js.UndefOr[js.Array[CompositionRelatesTo]] = js.undefined
  /**
    * Composition is broken into sections
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  /**
    * preliminary | final | amended | entered-in-error
    */
  var status: code
  /**
    * Who and/or what the composition is about
    */
  var subject: Reference
  /**
    * Human Readable name/title
    */
  var title: java.lang.String
  /**
    * Kind of composition (LOINC if possible)
    */
  var `type`: CodeableConcept
}

