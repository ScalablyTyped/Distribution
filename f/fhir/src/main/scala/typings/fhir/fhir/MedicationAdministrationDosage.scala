package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of how medication was taken
  */
trait MedicationAdministrationDosage extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Amount of medication per dose
    */
  var dose: js.UndefOr[Quantity] = js.undefined
  /**
    * How drug was administered
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Dose quantity per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Dose quantity per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Path of substance into body
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Body site administered to
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.undefined
}

object MedicationAdministrationDosage {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _text: Element = null,
    dose: Quantity = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    method: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    rateQuantity: Quantity = null,
    rateRatio: Ratio = null,
    route: CodeableConcept = null,
    site: CodeableConcept = null,
    text: String = null
  ): MedicationAdministrationDosage = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (dose != null) __obj.updateDynamic("dose")(dose)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (method != null) __obj.updateDynamic("method")(method)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (rateQuantity != null) __obj.updateDynamic("rateQuantity")(rateQuantity)
    if (rateRatio != null) __obj.updateDynamic("rateRatio")(rateRatio)
    if (route != null) __obj.updateDynamic("route")(route)
    if (site != null) __obj.updateDynamic("site")(site)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MedicationAdministrationDosage]
  }
}

