package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterProperties extends js.Object {
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var members: js.UndefOr[js.Array[FilterItem]] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
}

object FilterProperties {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    measure: MeasureObject = null,
    members: js.Array[FilterItem] = null,
    quantity: scala.Int | scala.Double = null
  ): FilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (members != null) __obj.updateDynamic("members")(members)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProperties]
  }
}

