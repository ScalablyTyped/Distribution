package typings.fineDashUploader.libCoreMod

import typings.std.HTMLCanvasElement
import typings.std.MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasWrapper extends js.Object {
  /**
    * the `<canvas>` to be converted to a file & then uploaded
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * the name to assign to the created file
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * `1`-`100` value indicating the desired quality of the converted file (only for `image/jpeg`)
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * MIME type of the file to create from this `<canvas>`
    */
  var `type`: js.UndefOr[MimeType] = js.undefined
}

object CanvasWrapper {
  @scala.inline
  def apply(
    canvas: HTMLCanvasElement = null,
    name: String = null,
    quality: Int | Double = null,
    `type`: MimeType = null
  ): CanvasWrapper = {
    val __obj = js.Dynamic.literal()
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (name != null) __obj.updateDynamic("name")(name)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CanvasWrapper]
  }
}

