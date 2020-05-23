package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeOptions extends js.Object {
  /**
    * Defaults to the image's height.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The desired quality of the resize image. Possible values are `good`, `better`,
    * or `best`. The default is `best`. These values express a desired quality/speed
    * tradeoff. They are translated into an algorithm-specific method that depends on
    * the capabilities (CPU, GPU) of the underlying platform. It is possible for all
    * three methods to be mapped to the same algorithm on a given platform.
    */
  var quality: js.UndefOr[String] = js.undefined
  /**
    * Defaults to the image's width.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ResizeOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    quality: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeOptions]
  }
}

