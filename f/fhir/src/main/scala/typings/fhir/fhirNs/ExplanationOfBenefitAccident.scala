package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of an accident
  */
trait ExplanationOfBenefitAccident extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * When the accident occurred
    */
  var date: js.UndefOr[typings.fhir.fhirNs.date] = js.undefined
  /**
    * Accident Place
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  /**
    * Accident Place
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  /**
    * The nature of the accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ExplanationOfBenefitAccident {
  @scala.inline
  def apply(
    _date: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    date: date = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    locationAddress: Address = null,
    locationReference: Reference = null,
    modifierExtension: js.Array[Extension] = null,
    `type`: CodeableConcept = null
  ): ExplanationOfBenefitAccident = {
    val __obj = js.Dynamic.literal()
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (date != null) __obj.updateDynamic("date")(date)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (locationAddress != null) __obj.updateDynamic("locationAddress")(locationAddress)
    if (locationReference != null) __obj.updateDynamic("locationReference")(locationReference)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExplanationOfBenefitAccident]
  }
}

