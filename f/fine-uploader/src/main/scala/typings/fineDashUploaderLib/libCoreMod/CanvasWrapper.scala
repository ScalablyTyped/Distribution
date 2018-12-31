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

