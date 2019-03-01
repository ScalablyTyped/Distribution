package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeInfo extends js.Object {
  /**
    * The original `File` or `Blob` object, if available.
    */
  var blob: js.UndefOr[stdLib.File | stdLib.Blob] = js.undefined
  /**
    * Desired height of the image after the resize operation.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The original HTMLImageElement object, if available.
    */
  var image: js.UndefOr[stdLib.HTMLImageElement] = js.undefined
  /**
    * `HTMLCanvasElement` element containing the original image data (not resized).
    */
  var sourceCanvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * `HTMLCanvasElement` element containing the `HTMLCanvasElement` that should contain the resized image.
    */
  var targetCanvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * Desired width of the image after the resize operation.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ResizeInfo {
  @scala.inline
  def apply(
    blob: stdLib.File | stdLib.Blob = null,
    height: scala.Int | scala.Double = null,
    image: stdLib.HTMLImageElement = null,
    sourceCanvas: stdLib.HTMLCanvasElement = null,
    targetCanvas: stdLib.HTMLCanvasElement = null,
    width: scala.Int | scala.Double = null
  ): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (sourceCanvas != null) __obj.updateDynamic("sourceCanvas")(sourceCanvas)
    if (targetCanvas != null) __obj.updateDynamic("targetCanvas")(targetCanvas)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeInfo]
  }
}

