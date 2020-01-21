package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingExpression extends js.Object {
  /**
    * The base unit for the SKU which is the unit used in usage exports.
    * Example: "By"
    */
  var baseUnit: js.UndefOr[String] = js.undefined
  /**
    * Conversion factor for converting from price per usage_unit to price per
    * base_unit, and start_usage_amount to start_usage_amount in base_unit.
    * unit_price / base_unit_conversion_factor = price per base_unit.
    * start_usage_amount &#42; base_unit_conversion_factor = start_usage_amount in
    * base_unit.
    */
  var baseUnitConversionFactor: js.UndefOr[Double] = js.undefined
  /**
    * The base unit in human readable form.
    * Example: "byte".
    */
  var baseUnitDescription: js.UndefOr[String] = js.undefined
  /**
    * The recommended quantity of units for displaying pricing info. When
    * displaying pricing info it is recommended to display:
    * (unit_price &#42; display_quantity) per display_quantity usage_unit.
    * This field does not affect the pricing formula and is for display purposes
    * only.
    * Example: If the unit_price is "0.0001 USD", the usage_unit is "GB" and
    * the display_quantity is "1000" then the recommended way of displaying the
    * pricing info is "0.10 USD per 1000 GB"
    */
  var displayQuantity: js.UndefOr[Double] = js.undefined
  /**
    * The list of tiered rates for this pricing. The total cost is computed by
    * applying each of the tiered rates on usage. This repeated list is sorted
    * by ascending order of start_usage_amount.
    */
  var tieredRates: js.UndefOr[js.Array[TierRate]] = js.undefined
  /**
    * The short hand for unit of usage this pricing is specified in.
    * Example: usage_unit of "GiBy" means that usage is specified in "Gibi Byte".
    */
  var usageUnit: js.UndefOr[String] = js.undefined
  /**
    * The unit of usage in human readable form.
    * Example: "gibi byte".
    */
  var usageUnitDescription: js.UndefOr[String] = js.undefined
}

object PricingExpression {
  @scala.inline
  def apply(
    baseUnit: String = null,
    baseUnitConversionFactor: Int | Double = null,
    baseUnitDescription: String = null,
    displayQuantity: Int | Double = null,
    tieredRates: js.Array[TierRate] = null,
    usageUnit: String = null,
    usageUnitDescription: String = null
  ): PricingExpression = {
    val __obj = js.Dynamic.literal()
    if (baseUnit != null) __obj.updateDynamic("baseUnit")(baseUnit.asInstanceOf[js.Any])
    if (baseUnitConversionFactor != null) __obj.updateDynamic("baseUnitConversionFactor")(baseUnitConversionFactor.asInstanceOf[js.Any])
    if (baseUnitDescription != null) __obj.updateDynamic("baseUnitDescription")(baseUnitDescription.asInstanceOf[js.Any])
    if (displayQuantity != null) __obj.updateDynamic("displayQuantity")(displayQuantity.asInstanceOf[js.Any])
    if (tieredRates != null) __obj.updateDynamic("tieredRates")(tieredRates.asInstanceOf[js.Any])
    if (usageUnit != null) __obj.updateDynamic("usageUnit")(usageUnit.asInstanceOf[js.Any])
    if (usageUnitDescription != null) __obj.updateDynamic("usageUnitDescription")(usageUnitDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingExpression]
  }
}

