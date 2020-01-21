package typings.fineUploader.coreMod

import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeInfo extends js.Object {
  /**
    * The original `File` or `Blob` object, if available.
    */
  var blob: js.UndefOr[File | Blob] = js.undefined
  /**
    * Desired height of the image after the resize operation.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The original HTMLImageElement object, if available.
    */
  var image: js.UndefOr[HTMLImageElement] = js.undefined
  /**
    * `HTMLCanvasElement` element containing the original image data (not resized).
    */
  var sourceCanvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * `HTMLCanvasElement` element containing the `HTMLCanvasElement` that should contain the resized image.
    */
  var targetCanvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * Desired width of the image after the resize operation.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ResizeInfo {
  @scala.inline
  def apply(
    blob: File | Blob = null,
    height: Int | Double = null,
    image: HTMLImageElement = null,
    sourceCanvas: HTMLCanvasElement = null,
    targetCanvas: HTMLCanvasElement = null,
    width: Int | Double = null
  ): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (sourceCanvas != null) __obj.updateDynamic("sourceCanvas")(sourceCanvas.asInstanceOf[js.Any])
    if (targetCanvas != null) __obj.updateDynamic("targetCanvas")(targetCanvas.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeInfo]
  }
}

