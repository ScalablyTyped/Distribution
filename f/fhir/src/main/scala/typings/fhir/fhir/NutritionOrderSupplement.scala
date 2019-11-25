package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supplement components
  */
trait NutritionOrderSupplement extends BackboneElement {
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'productName'.
    */
  var _productName: js.UndefOr[Element] = js.undefined
  /**
    * Instructions or additional information about the oral supplement
    */
  var instruction: js.UndefOr[String] = js.undefined
  /**
    * Product or brand name of the nutritional supplement
    */
  var productName: js.UndefOr[String] = js.undefined
  /**
    * Amount of the nutritional supplement
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Scheduled frequency of supplement
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.undefined
  /**
    * Type of supplement product requested
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object NutritionOrderSupplement {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _instruction: Element = null,
    _productName: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    instruction: String = null,
    modifierExtension: js.Array[Extension] = null,
    productName: String = null,
    quantity: Quantity = null,
    schedule: js.Array[Timing] = null,
    `type`: CodeableConcept = null
  ): NutritionOrderSupplement = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_instruction != null) __obj.updateDynamic("_instruction")(_instruction.asInstanceOf[js.Any])
    if (_productName != null) __obj.updateDynamic("_productName")(_productName.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instruction != null) __obj.updateDynamic("instruction")(instruction.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionOrderSupplement]
  }
}

