package typings.devextreme

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var x: js.UndefOr[center | left | right] = js.undefined
  var y: js.UndefOr[bottom | center | top] = js.undefined
}

object AnonX {
  @scala.inline
  def apply(x: center | left | right = null, y: bottom | center | top = null): AnonX = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

