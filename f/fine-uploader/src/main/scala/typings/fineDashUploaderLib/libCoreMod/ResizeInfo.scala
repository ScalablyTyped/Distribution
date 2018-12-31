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

