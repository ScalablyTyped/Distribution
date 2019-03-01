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

object PictureOptions {
  @scala.inline
  def apply(
    base64: js.UndefOr[scala.Boolean] = js.undefined,
    exif: js.UndefOr[scala.Boolean] = js.undefined,
    onPictureSaved: js.Function1[/* data */ PictureResponse, scala.Unit] = null,
    quality: scala.Int | scala.Double = null
  ): PictureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64)
    if (!js.isUndefined(exif)) __obj.updateDynamic("exif")(exif)
    if (onPictureSaved != null) __obj.updateDynamic("onPictureSaved")(onPictureSaved)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureOptions]
  }
}

