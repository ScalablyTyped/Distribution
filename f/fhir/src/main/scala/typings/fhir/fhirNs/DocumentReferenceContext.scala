package typings.fhir.fhirNs

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

object DocumentReferenceContext {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    encounter: Reference = null,
    event: js.Array[CodeableConcept] = null,
    extension: js.Array[Extension] = null,
    facilityType: CodeableConcept = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    practiceSetting: CodeableConcept = null,
    related: js.Array[DocumentReferenceContextRelated] = null,
    sourcePatientInfo: Reference = null
  ): DocumentReferenceContext = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (encounter != null) __obj.updateDynamic("encounter")(encounter)
    if (event != null) __obj.updateDynamic("event")(event)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (facilityType != null) __obj.updateDynamic("facilityType")(facilityType)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (practiceSetting != null) __obj.updateDynamic("practiceSetting")(practiceSetting)
    if (related != null) __obj.updateDynamic("related")(related)
    if (sourcePatientInfo != null) __obj.updateDynamic("sourcePatientInfo")(sourcePatientInfo)
    __obj.asInstanceOf[DocumentReferenceContext]
  }
}

