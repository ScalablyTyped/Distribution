package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a document
  */
trait DocumentReference extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'docStatus'.
    */
  var _docStatus: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'indexed'.
    */
  var _indexed: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Who/what authenticated the document
    */
  var authenticator: js.UndefOr[Reference] = js.undefined
  /**
    * Who and/or what authored the document
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Categorization of document
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Document referenced
    */
  var content: js.Array[DocumentReferenceContent]
  /**
    * Clinical context of document
    */
  var context: js.UndefOr[DocumentReferenceContext] = js.undefined
  /**
    * Document creation time
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Organization which maintains the document
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * preliminary | final | appended | amended | entered-in-error
    */
  var docStatus: js.UndefOr[code] = js.undefined
  /**
    * Other identifiers for the document
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * When this document reference was created
    */
  var indexed: instant
  /**
    * Master Version Specific Identifier
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Relationships to other documents
    */
  var relatesTo: js.UndefOr[js.Array[DocumentReferenceRelatesTo]] = js.undefined
  /**
    * Document security-tags
    */
  var securityLabel: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * current | superseded | entered-in-error
    */
  var status: code
  /**
    * Who/what is the subject of the document
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Kind of document (LOINC if possible)
    */
  var `type`: CodeableConcept
}

