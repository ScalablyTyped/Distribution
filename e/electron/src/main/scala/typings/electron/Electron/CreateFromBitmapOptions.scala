package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFromBitmapOptions extends js.Object {
  var height: Double
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  var width: Double
}

object CreateFromBitmapOptions {
  @scala.inline
  def apply(height: Double, width: Double, scaleFactor: js.UndefOr[Double] = js.undefined): CreateFromBitmapOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleFactor)) __obj.updateDynamic("scaleFactor")(scaleFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFromBitmapOptions]
  }
}

