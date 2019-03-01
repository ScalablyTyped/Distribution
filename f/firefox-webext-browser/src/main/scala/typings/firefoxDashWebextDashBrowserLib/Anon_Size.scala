package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  /**
    * The size of the icon. The returned icon will be square with dimensions size * size pixels. The default size
    * for the icon is 32x32 pixels.
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Size {
  @scala.inline
  def apply(size: scala.Int | scala.Double = null): Anon_Size = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Size]
  }
}

