package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWidth extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[AnonText]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonWidth {
  @scala.inline
  def apply(height: Int | Double = null, items: js.Array[AnonText] = null, width: Int | Double = null): AnonWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWidth]
  }
}

