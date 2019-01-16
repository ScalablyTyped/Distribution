package typings
package exifLib.exifMod.ExifNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifOptions extends js.Object {
  var agfaMaxEntries: js.UndefOr[scala.Double] = js.undefined
  var epsonMaxEntries: js.UndefOr[scala.Double] = js.undefined
  /** node-exif corrects the thumbnail offset in order to have an offset from the start of the buffer/file. */
  var fixThumbnailOffset: js.UndefOr[scala.Boolean] = js.undefined
  var fujifilmMaxEntries: js.UndefOr[scala.Double] = js.undefined
  var ifd0MaxEntries: js.UndefOr[scala.Double] = js.undefined
  var ifd1MaxEntries: js.UndefOr[scala.Double] = js.undefined
  /**
    * The image to get Exif data from can be either a filesystem path or a Buffer.
    *
    * If `image` is not specified, the developer must call `loadImage()` to parse the image.
    */
  var image: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /** Specifies the maximum entries to be parsed */
  var maxEntries: js.UndefOr[scala.Double] = js.undefined
  var maxGpsEntries: js.UndefOr[scala.Double] = js.undefined
  var maxInteroperabilityEntries: js.UndefOr[scala.Double] = js.undefined
  var noPadding: js.UndefOr[scala.Boolean] = js.undefined
  var olympusMaxEntries: js.UndefOr[scala.Double] = js.undefined
  var panasonicMaxEntries: js.UndefOr[scala.Double] = js.undefined
  var sanyoMaxEntries: js.UndefOr[scala.Double] = js.undefined
  /** An object named "offsets" is added to exifData and contains lot of offsets needed to get thumbnail and other things. */
  var tiffOffsets: js.UndefOr[scala.Double] = js.undefined
}

