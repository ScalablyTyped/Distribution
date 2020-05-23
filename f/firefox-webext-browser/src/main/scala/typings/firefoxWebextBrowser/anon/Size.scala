package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /**
    * The size of the icon. The returned icon will be square with dimensions size * size pixels. The default size
    * for the icon is 32x32 pixels.
    */
  var size: js.UndefOr[Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(size: js.UndefOr[Double] = js.undefined): Size = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

