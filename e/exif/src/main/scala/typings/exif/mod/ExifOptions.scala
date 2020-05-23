package typings.exif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifOptions extends js.Object {
  var agfaMaxEntries: js.UndefOr[Double] = js.undefined
  var epsonMaxEntries: js.UndefOr[Double] = js.undefined
  /** node-exif corrects the thumbnail offset in order to have an offset from the start of the buffer/file. */
  var fixThumbnailOffset: js.UndefOr[Boolean] = js.undefined
  var fujifilmMaxEntries: js.UndefOr[Double] = js.undefined
  var ifd0MaxEntries: js.UndefOr[Double] = js.undefined
  var ifd1MaxEntries: js.UndefOr[Double] = js.undefined
  /**
    * The image to get Exif data from can be either a filesystem path or a Buffer.
    *
    * If `image` is not specified, the developer must call `loadImage()` to parse the image.
    */
  var image: js.UndefOr[String | Buffer] = js.undefined
  /** Specifies the maximum entries to be parsed */
  var maxEntries: js.UndefOr[Double] = js.undefined
  var maxGpsEntries: js.UndefOr[Double] = js.undefined
  var maxInteroperabilityEntries: js.UndefOr[Double] = js.undefined
  var noPadding: js.UndefOr[Boolean] = js.undefined
  var olympusMaxEntries: js.UndefOr[Double] = js.undefined
  var panasonicMaxEntries: js.UndefOr[Double] = js.undefined
  var sanyoMaxEntries: js.UndefOr[Double] = js.undefined
  /** An object named "offsets" is added to exifData and contains lot of offsets needed to get thumbnail and other things. */
  var tiffOffsets: js.UndefOr[Double] = js.undefined
}

object ExifOptions {
  @scala.inline
  def apply(
    agfaMaxEntries: js.UndefOr[Double] = js.undefined,
    epsonMaxEntries: js.UndefOr[Double] = js.undefined,
    fixThumbnailOffset: js.UndefOr[Boolean] = js.undefined,
    fujifilmMaxEntries: js.UndefOr[Double] = js.undefined,
    ifd0MaxEntries: js.UndefOr[Double] = js.undefined,
    ifd1MaxEntries: js.UndefOr[Double] = js.undefined,
    image: String | Buffer = null,
    maxEntries: js.UndefOr[Double] = js.undefined,
    maxGpsEntries: js.UndefOr[Double] = js.undefined,
    maxInteroperabilityEntries: js.UndefOr[Double] = js.undefined,
    noPadding: js.UndefOr[Boolean] = js.undefined,
    olympusMaxEntries: js.UndefOr[Double] = js.undefined,
    panasonicMaxEntries: js.UndefOr[Double] = js.undefined,
    sanyoMaxEntries: js.UndefOr[Double] = js.undefined,
    tiffOffsets: js.UndefOr[Double] = js.undefined
  ): ExifOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agfaMaxEntries)) __obj.updateDynamic("agfaMaxEntries")(agfaMaxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(epsonMaxEntries)) __obj.updateDynamic("epsonMaxEntries")(epsonMaxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixThumbnailOffset)) __obj.updateDynamic("fixThumbnailOffset")(fixThumbnailOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fujifilmMaxEntries)) __obj.updateDynamic("fujifilmMaxEntries")(fujifilmMaxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ifd0MaxEntries)) __obj.updateDynamic("ifd0MaxEntries")(ifd0MaxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ifd1MaxEntries)) __obj.updateDynamic("ifd1MaxEntries")(ifd1MaxEntries.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEntries)) __obj.updateDynamic("maxEntries")(maxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxGpsEntries)) __obj.updateDynamic("maxGpsEntries")(maxGpsEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInteroperabilityEntries)) __obj.updateDynamic("maxInteroperabilityEntries")(maxInteroperabilityEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPadding)) __obj.updateDynamic("noPadding")(noPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(olympusMaxEntries)) __obj.updateDynamic("olympusMaxEntries")(olympusMaxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(panasonicMaxEntries)) __obj.updateDynamic("panasonicMaxEntries")(panasonicMaxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sanyoMaxEntries)) __obj.updateDynamic("sanyoMaxEntries")(sanyoMaxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tiffOffsets)) __obj.updateDynamic("tiffOffsets")(tiffOffsets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExifOptions]
  }
}

