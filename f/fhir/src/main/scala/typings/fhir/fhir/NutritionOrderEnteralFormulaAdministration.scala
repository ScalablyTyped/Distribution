package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Formula feeding instruction as structured data
  */
trait NutritionOrderEnteralFormulaAdministration extends BackboneElement {
  /**
    * The volume of formula to provide
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Scheduled frequency of enteral feeding
    */
  var schedule: js.UndefOr[Timing] = js.undefined
}

object NutritionOrderEnteralFormulaAdministration {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    quantity: Quantity = null,
    rateQuantity: Quantity = null,
    rateRatio: Ratio = null,
    schedule: Timing = null
  ): NutritionOrderEnteralFormulaAdministration = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (rateQuantity != null) __obj.updateDynamic("rateQuantity")(rateQuantity.asInstanceOf[js.Any])
    if (rateRatio != null) __obj.updateDynamic("rateRatio")(rateRatio.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionOrderEnteralFormulaAdministration]
  }
}

