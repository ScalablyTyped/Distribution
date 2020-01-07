package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Expresses a mathematical pricing formula. For Example:-  `usage_unit: GBy`
  * `tiered_rates:`    `[start_usage_amount: 20, unit_price: $10]`
  * `[start_usage_amount: 100, unit_price: $5]`  The above expresses a pricing
  * formula where the first 20GB is free, the next 80GB is priced at $10 per GB
  * followed by $5 per GB for additional usage.
  */
@js.native
trait Schema$PricingExpression extends js.Object {
  /**
    * The base unit for the SKU which is the unit used in usage exports.
    * Example: &quot;By&quot;
    */
  var baseUnit: js.UndefOr[String] = js.native
  /**
    * Conversion factor for converting from price per usage_unit to price per
    * base_unit, and start_usage_amount to start_usage_amount in base_unit.
    * unit_price / base_unit_conversion_factor = price per base_unit.
    * start_usage_amount * base_unit_conversion_factor = start_usage_amount in
    * base_unit.
    */
  var baseUnitConversionFactor: js.UndefOr[Double] = js.native
  /**
    * The base unit in human readable form. Example: &quot;byte&quot;.
    */
  var baseUnitDescription: js.UndefOr[String] = js.native
  /**
    * The recommended quantity of units for displaying pricing info. When
    * displaying pricing info it is recommended to display: (unit_price *
    * display_quantity) per display_quantity usage_unit. This field does not
    * affect the pricing formula and is for display purposes only. Example: If
    * the unit_price is &quot;0.0001 USD&quot;, the usage_unit is
    * &quot;GB&quot; and the display_quantity is &quot;1000&quot; then the
    * recommended way of displaying the pricing info is &quot;0.10 USD per 1000
    * GB&quot;
    */
  var displayQuantity: js.UndefOr[Double] = js.native
  /**
    * The list of tiered rates for this pricing. The total cost is computed by
    * applying each of the tiered rates on usage. This repeated list is sorted
    * by ascending order of start_usage_amount.
    */
  var tieredRates: js.UndefOr[js.Array[Schema$TierRate]] = js.native
  /**
    * The short hand for unit of usage this pricing is specified in. Example:
    * usage_unit of &quot;GiBy&quot; means that usage is specified in
    * &quot;Gibi Byte&quot;.
    */
  var usageUnit: js.UndefOr[String] = js.native
  /**
    * The unit of usage in human readable form. Example: &quot;gibi byte&quot;.
    */
  var usageUnitDescription: js.UndefOr[String] = js.native
}

object Schema$PricingExpression {
  @scala.inline
  def apply(
    baseUnit: String = null,
    baseUnitConversionFactor: Int | Double = null,
    baseUnitDescription: String = null,
    displayQuantity: Int | Double = null,
    tieredRates: js.Array[Schema$TierRate] = null,
    usageUnit: String = null,
    usageUnitDescription: String = null
  ): Schema$PricingExpression = {
    val __obj = js.Dynamic.literal()
    if (baseUnit != null) __obj.updateDynamic("baseUnit")(baseUnit.asInstanceOf[js.Any])
    if (baseUnitConversionFactor != null) __obj.updateDynamic("baseUnitConversionFactor")(baseUnitConversionFactor.asInstanceOf[js.Any])
    if (baseUnitDescription != null) __obj.updateDynamic("baseUnitDescription")(baseUnitDescription.asInstanceOf[js.Any])
    if (displayQuantity != null) __obj.updateDynamic("displayQuantity")(displayQuantity.asInstanceOf[js.Any])
    if (tieredRates != null) __obj.updateDynamic("tieredRates")(tieredRates.asInstanceOf[js.Any])
    if (usageUnit != null) __obj.updateDynamic("usageUnit")(usageUnit.asInstanceOf[js.Any])
    if (usageUnitDescription != null) __obj.updateDynamic("usageUnitDescription")(usageUnitDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PricingExpression]
  }
}

