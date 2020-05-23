package typings.exif.mod

import typings.exif.anon.ApertureValue
import typings.exif.anon.AutoBracketing
import typings.exif.anon.Compression
import typings.exif.anon.Copyright
import typings.exif.anon.GPSAltitude
import typings.exif.anon.InteropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifData extends js.Object {
  var exif: ApertureValue
  var gps: GPSAltitude
  var image: Copyright
  var interoperability: InteropIndex
  var makernote: AutoBracketing
  var thumbnail: Compression
}

object ExifData {
  @scala.inline
  def apply(
    exif: ApertureValue,
    gps: GPSAltitude,
    image: Copyright,
    interoperability: InteropIndex,
    makernote: AutoBracketing,
    thumbnail: Compression
  ): ExifData = {
    val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], gps = gps.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], interoperability = interoperability.asInstanceOf[js.Any], makernote = makernote.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExifData]
  }
}

