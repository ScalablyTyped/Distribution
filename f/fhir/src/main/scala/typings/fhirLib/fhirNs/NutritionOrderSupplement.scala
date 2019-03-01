package typings
package fhirLib.fhirNs

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
  var instruction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Product or brand name of the nutritional supplement
    */
  var productName: js.UndefOr[java.lang.String] = js.undefined
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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    instruction: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    productName: java.lang.String = null,
    quantity: Quantity = null,
    schedule: js.Array[Timing] = null,
    `type`: CodeableConcept = null
  ): NutritionOrderSupplement = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_instruction != null) __obj.updateDynamic("_instruction")(_instruction)
    if (_productName != null) __obj.updateDynamic("_productName")(_productName)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (instruction != null) __obj.updateDynamic("instruction")(instruction)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NutritionOrderSupplement]
  }
}

