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
  def apply(height: Double, width: Double, scaleFactor: Int | Double = null): CreateFromBitmapOptions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFromBitmapOptions]
  }
}

