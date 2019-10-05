package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medication supply authorization
  */
trait MedicationRequestDispenseRequest extends BackboneElement {
  /**
    * Contains extended information for property 'numberOfRepeatsAllowed'.
    */
  var _numberOfRepeatsAllowed: js.UndefOr[Element] = js.undefined
  /**
    * Number of days supply per dispense
    */
  var expectedSupplyDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Number of refills authorized
    */
  var numberOfRepeatsAllowed: js.UndefOr[positiveInt] = js.undefined
  /**
    * Intended dispenser
    */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
    * Amount of medication to supply per dispense
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Time period supply is authorized for
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}

object MedicationRequestDispenseRequest {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _numberOfRepeatsAllowed: Element = null,
    expectedSupplyDuration: Duration = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    numberOfRepeatsAllowed: Int | Double = null,
    performer: Reference = null,
    quantity: Quantity = null,
    validityPeriod: Period = null
  ): MedicationRequestDispenseRequest = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_numberOfRepeatsAllowed != null) __obj.updateDynamic("_numberOfRepeatsAllowed")(_numberOfRepeatsAllowed)
    if (expectedSupplyDuration != null) __obj.updateDynamic("expectedSupplyDuration")(expectedSupplyDuration)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (numberOfRepeatsAllowed != null) __obj.updateDynamic("numberOfRepeatsAllowed")(numberOfRepeatsAllowed.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (validityPeriod != null) __obj.updateDynamic("validityPeriod")(validityPeriod)
    __obj.asInstanceOf[MedicationRequestDispenseRequest]
  }
}

