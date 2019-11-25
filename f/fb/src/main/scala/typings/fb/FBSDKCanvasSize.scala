package typings.fb

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBSDKCanvasSize extends js.Object {
  var height: js.UndefOr[Number] = js.undefined
  var width: js.UndefOr[Number] = js.undefined
}

object FBSDKCanvasSize {
  @scala.inline
  def apply(height: Number = null, width: Number = null): FBSDKCanvasSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FBSDKCanvasSize]
  }
}

