package typings.exif.exifMod

import typings.exif.Anon_ApertureValue
import typings.exif.Anon_AutoBracketing
import typings.exif.Anon_Compression
import typings.exif.Anon_Copyright
import typings.exif.Anon_GPSAltitude
import typings.exif.Anon_InteropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifData extends js.Object {
  var exif: Anon_ApertureValue
  var gps: Anon_GPSAltitude
  var image: Anon_Copyright
  var interoperability: Anon_InteropIndex
  var makernote: Anon_AutoBracketing
  var thumbnail: Anon_Compression
}

object ExifData {
  @scala.inline
  def apply(
    exif: Anon_ApertureValue,
    gps: Anon_GPSAltitude,
    image: Anon_Copyright,
    interoperability: Anon_InteropIndex,
    makernote: Anon_AutoBracketing,
    thumbnail: Anon_Compression
  ): ExifData = {
    val __obj = js.Dynamic.literal(exif = exif, gps = gps, image = image, interoperability = interoperability, makernote = makernote, thumbnail = thumbnail)
  
    __obj.asInstanceOf[ExifData]
  }
}

