package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterProperties extends js.Object {
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var members: js.UndefOr[js.Array[FilterItem]] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var `type`: String
}

object FilterProperties {
  @scala.inline
  def apply(
    `type`: String,
    measure: MeasureObject = null,
    members: js.Array[FilterItem] = null,
    quantity: Int | Double = null
  ): FilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProperties]
  }
}

