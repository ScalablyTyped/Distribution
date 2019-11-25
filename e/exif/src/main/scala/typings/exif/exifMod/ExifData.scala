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
    val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], gps = gps.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], interoperability = interoperability.asInstanceOf[js.Any], makernote = makernote.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExifData]
  }
}

