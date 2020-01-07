package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductUnitPricingBaseMeasure extends js.Object {
  /**
    * The unit of the denominator.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The denominator of the unit price.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$ProductUnitPricingBaseMeasure {
  @scala.inline
  def apply(unit: String = null, value: String = null): Schema$ProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductUnitPricingBaseMeasure]
  }
}

