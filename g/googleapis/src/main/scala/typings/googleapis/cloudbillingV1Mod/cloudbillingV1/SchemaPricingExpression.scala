package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

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
trait SchemaPricingExpression extends js.Object {
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
  var tieredRates: js.UndefOr[js.Array[SchemaTierRate]] = js.native
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

object SchemaPricingExpression {
  @scala.inline
  def apply(): SchemaPricingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingExpression]
  }
  @scala.inline
  implicit class SchemaPricingExpressionOps[Self <: SchemaPricingExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseUnit(value: String): Self = this.set("baseUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUnit: Self = this.set("baseUnit", js.undefined)
    @scala.inline
    def setBaseUnitConversionFactor(value: Double): Self = this.set("baseUnitConversionFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUnitConversionFactor: Self = this.set("baseUnitConversionFactor", js.undefined)
    @scala.inline
    def setBaseUnitDescription(value: String): Self = this.set("baseUnitDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUnitDescription: Self = this.set("baseUnitDescription", js.undefined)
    @scala.inline
    def setDisplayQuantity(value: Double): Self = this.set("displayQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayQuantity: Self = this.set("displayQuantity", js.undefined)
    @scala.inline
    def setTieredRatesVarargs(value: SchemaTierRate*): Self = this.set("tieredRates", js.Array(value :_*))
    @scala.inline
    def setTieredRates(value: js.Array[SchemaTierRate]): Self = this.set("tieredRates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTieredRates: Self = this.set("tieredRates", js.undefined)
    @scala.inline
    def setUsageUnit(value: String): Self = this.set("usageUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageUnit: Self = this.set("usageUnit", js.undefined)
    @scala.inline
    def setUsageUnitDescription(value: String): Self = this.set("usageUnitDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageUnitDescription: Self = this.set("usageUnitDescription", js.undefined)
  }
  
}

