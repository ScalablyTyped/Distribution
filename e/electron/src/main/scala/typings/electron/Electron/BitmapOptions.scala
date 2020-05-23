package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapOptions extends js.Object {
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}

object BitmapOptions {
  @scala.inline
  def apply(scaleFactor: js.UndefOr[Double] = js.undefined): BitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scaleFactor)) __obj.updateDynamic("scaleFactor")(scaleFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapOptions]
  }
}

