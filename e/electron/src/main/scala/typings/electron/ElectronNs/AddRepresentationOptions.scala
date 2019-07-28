package typings.electron.ElectronNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRepresentationOptions extends js.Object {
  /**
    * The buffer containing the raw image data.
    */
  var buffer: js.UndefOr[Buffer] = js.undefined
  /**
    * The data URL containing either a base 64 encoded PNG or JPEG image.
    */
  var dataURL: js.UndefOr[String] = js.undefined
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as buffer.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The scale factor to add the image representation for.
    */
  var scaleFactor: Double
  /**
    * Defaults to 0. Required if a bitmap buffer is specified as buffer.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AddRepresentationOptions {
  @scala.inline
  def apply(
    scaleFactor: Double,
    buffer: Buffer = null,
    dataURL: String = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): AddRepresentationOptions = {
    val __obj = js.Dynamic.literal(scaleFactor = scaleFactor)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (dataURL != null) __obj.updateDynamic("dataURL")(dataURL)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRepresentationOptions]
  }
}

