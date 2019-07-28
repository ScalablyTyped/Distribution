package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFromBufferOptions extends js.Object {
  /**
    * Required for bitmap buffers.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  /**
    * Required for bitmap buffers.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CreateFromBufferOptions {
  @scala.inline
  def apply(height: Int | Double = null, scaleFactor: Int | Double = null, width: Int | Double = null): CreateFromBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFromBufferOptions]
  }
}

