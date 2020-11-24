package typings.exif.mod

import typings.exif.anon.ApertureValue
import typings.exif.anon.AutoBracketing
import typings.exif.anon.Compression
import typings.exif.anon.Copyright
import typings.exif.anon.GPSAltitude
import typings.exif.anon.InteropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExifData extends js.Object {
  
  var exif: ApertureValue = js.native
  
  /**
    * Entire GPS Tags from https://exiftool.org/TagNames/GPS.html are listed.
    * And their types are determined from http://www.exif.org/Exif2-2.PDF.
    */
  var gps: GPSAltitude = js.native
  
  var image: Copyright = js.native
  
  var interoperability: InteropIndex = js.native
  
  var makernote: AutoBracketing = js.native
  
  var thumbnail: Compression = js.native
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
  
  @scala.inline
  implicit class ExifDataOps[Self <: ExifData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExif(value: ApertureValue): Self = this.set("exif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGps(value: GPSAltitude): Self = this.set("gps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Copyright): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteroperability(value: InteropIndex): Self = this.set("interoperability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakernote(value: AutoBracketing): Self = this.set("makernote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Compression): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
