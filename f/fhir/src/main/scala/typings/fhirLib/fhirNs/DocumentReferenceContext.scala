package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Clinical context of document
     */

trait DocumentReferenceContext extends BackboneElement {
  /**
           * Context of the document  content
           */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
           * Main clinical acts documented
           */
  var event: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Kind of facility where patient was seen
           */
  var facilityType: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Time of service that is being documented
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Additional details about where the content was created (e.g. clinical specialty)
           */
  var practiceSetting: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Related identifiers or resources
           */
  var related: js.UndefOr[js.Array[DocumentReferenceContextRelated]] = js.undefined
  /**
           * Patient demographics from source
           */
  var sourcePatientInfo: js.UndefOr[Reference] = js.undefined
}

