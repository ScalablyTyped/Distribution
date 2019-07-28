package typings.exif.exifMod

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
    agfaMaxEntries: Int | Double = null,
    epsonMaxEntries: Int | Double = null,
    fixThumbnailOffset: js.UndefOr[Boolean] = js.undefined,
    fujifilmMaxEntries: Int | Double = null,
    ifd0MaxEntries: Int | Double = null,
    ifd1MaxEntries: Int | Double = null,
    image: String | Buffer = null,
    maxEntries: Int | Double = null,
    maxGpsEntries: Int | Double = null,
    maxInteroperabilityEntries: Int | Double = null,
    noPadding: js.UndefOr[Boolean] = js.undefined,
    olympusMaxEntries: Int | Double = null,
    panasonicMaxEntries: Int | Double = null,
    sanyoMaxEntries: Int | Double = null,
    tiffOffsets: Int | Double = null
  ): ExifOptions = {
    val __obj = js.Dynamic.literal()
    if (agfaMaxEntries != null) __obj.updateDynamic("agfaMaxEntries")(agfaMaxEntries.asInstanceOf[js.Any])
    if (epsonMaxEntries != null) __obj.updateDynamic("epsonMaxEntries")(epsonMaxEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(fixThumbnailOffset)) __obj.updateDynamic("fixThumbnailOffset")(fixThumbnailOffset)
    if (fujifilmMaxEntries != null) __obj.updateDynamic("fujifilmMaxEntries")(fujifilmMaxEntries.asInstanceOf[js.Any])
    if (ifd0MaxEntries != null) __obj.updateDynamic("ifd0MaxEntries")(ifd0MaxEntries.asInstanceOf[js.Any])
    if (ifd1MaxEntries != null) __obj.updateDynamic("ifd1MaxEntries")(ifd1MaxEntries.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    if (maxGpsEntries != null) __obj.updateDynamic("maxGpsEntries")(maxGpsEntries.asInstanceOf[js.Any])
    if (maxInteroperabilityEntries != null) __obj.updateDynamic("maxInteroperabilityEntries")(maxInteroperabilityEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(noPadding)) __obj.updateDynamic("noPadding")(noPadding)
    if (olympusMaxEntries != null) __obj.updateDynamic("olympusMaxEntries")(olympusMaxEntries.asInstanceOf[js.Any])
    if (panasonicMaxEntries != null) __obj.updateDynamic("panasonicMaxEntries")(panasonicMaxEntries.asInstanceOf[js.Any])
    if (sanyoMaxEntries != null) __obj.updateDynamic("sanyoMaxEntries")(sanyoMaxEntries.asInstanceOf[js.Any])
    if (tiffOffsets != null) __obj.updateDynamic("tiffOffsets")(tiffOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExifOptions]
  }
}

