package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[js.Array[_]] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: js.Array[_] = null, value: String | Double = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

