package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToDataURLOptions extends js.Object {
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}

object ToDataURLOptions {
  @scala.inline
  def apply(scaleFactor: Int | Double = null): ToDataURLOptions = {
    val __obj = js.Dynamic.literal()
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToDataURLOptions]
  }
}

