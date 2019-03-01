package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasWrapper extends js.Object {
  /**
    * the `<canvas>` to be converted to a file & then uploaded
    */
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * the name to assign to the created file
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `1`-`100` value indicating the desired quality of the converted file (only for `image/jpeg`)
    */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
    * MIME type of the file to create from this `<canvas>`
    */
  var `type`: js.UndefOr[stdLib.MimeType] = js.undefined
}

object CanvasWrapper {
  @scala.inline
  def apply(
    canvas: stdLib.HTMLCanvasElement = null,
    name: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    `type`: stdLib.MimeType = null
  ): CanvasWrapper = {
    val __obj = js.Dynamic.literal()
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (name != null) __obj.updateDynamic("name")(name)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CanvasWrapper]
  }
}

