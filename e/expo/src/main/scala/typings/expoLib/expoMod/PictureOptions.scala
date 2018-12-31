package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureOptions extends js.Object {
  var base64: js.UndefOr[scala.Boolean] = js.undefined
  var exif: js.UndefOr[scala.Boolean] = js.undefined
  var onPictureSaved: js.UndefOr[js.Function1[/* data */ PictureResponse, scala.Unit]] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
}

