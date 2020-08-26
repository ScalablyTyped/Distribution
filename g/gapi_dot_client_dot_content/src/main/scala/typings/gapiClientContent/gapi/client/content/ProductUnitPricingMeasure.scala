package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductUnitPricingMeasure extends js.Object {
  /** The unit of the measure. */
  var unit: js.UndefOr[String] = js.native
  /** The measure of an item. */
  var value: js.UndefOr[Double] = js.native
}

object ProductUnitPricingMeasure {
  @scala.inline
  def apply(): ProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductUnitPricingMeasure]
  }
  @scala.inline
  implicit class ProductUnitPricingMeasureOps[Self <: ProductUnitPricingMeasure] (val x: Self) extends AnyVal {
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

