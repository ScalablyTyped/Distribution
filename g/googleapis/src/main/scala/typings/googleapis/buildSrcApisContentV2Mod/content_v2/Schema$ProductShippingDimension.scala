package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductShippingDimension extends js.Object {
  /**
    * The unit of value.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The dimension of the product used to calculate the shipping cost of the
    * item.
    */
  var value: js.UndefOr[Double] = js.native
}

object Schema$ProductShippingDimension {
  @scala.inline
  def apply(unit: String = null, value: Int | Double = null): Schema$ProductShippingDimension = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductShippingDimension]
  }
}

