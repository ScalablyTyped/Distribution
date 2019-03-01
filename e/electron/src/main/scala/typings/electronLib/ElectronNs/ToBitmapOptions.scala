package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToBitmapOptions extends js.Object {
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[scala.Double] = js.undefined
}

object ToBitmapOptions {
  @scala.inline
  def apply(scaleFactor: scala.Int | scala.Double = null): ToBitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToBitmapOptions]
  }
}

