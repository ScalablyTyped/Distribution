package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  /**
    * The size of the icon. The returned icon will be square with dimensions size * size pixels. The default size
    * for the icon is 32x32 pixels.
    */
  var size: js.UndefOr[Double] = js.undefined
}

object AnonSize {
  @scala.inline
  def apply(size: Int | Double = null): AnonSize = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

