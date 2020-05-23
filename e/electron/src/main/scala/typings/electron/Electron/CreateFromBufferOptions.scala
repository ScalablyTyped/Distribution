package typings.electron.Electron

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
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    scaleFactor: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): CreateFromBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleFactor)) __obj.updateDynamic("scaleFactor")(scaleFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFromBufferOptions]
  }
}

