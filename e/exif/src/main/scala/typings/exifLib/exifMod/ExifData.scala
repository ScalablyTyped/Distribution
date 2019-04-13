package typings
package exifLib.exifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExifData extends js.Object {
  var exif: exifLib.Anon_ApertureValue
  var gps: exifLib.Anon_GPSAltitude
  var image: exifLib.Anon_Copyright
  var interoperability: exifLib.Anon_InteropIndex
  var makernote: exifLib.Anon_AutoBracketing
  var thumbnail: exifLib.Anon_Compression
}

object ExifData {
  @scala.inline
  def apply(
    exif: exifLib.Anon_ApertureValue,
    gps: exifLib.Anon_GPSAltitude,
    image: exifLib.Anon_Copyright,
    interoperability: exifLib.Anon_InteropIndex,
    makernote: exifLib.Anon_AutoBracketing,
    thumbnail: exifLib.Anon_Compression
  ): ExifData = {
    val __obj = js.Dynamic.literal(exif = exif, gps = gps, image = image, interoperability = interoperability, makernote = makernote, thumbnail = thumbnail)
  
    __obj.asInstanceOf[ExifData]
  }
}

