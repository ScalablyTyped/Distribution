package typings.gm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageInfo extends js.Object {
  
  var `Background Color`: String = js.native
  
  var `Border Color`: String = js.native
  
  var `Channel Depths`: ChannelInfo[String] = js.native
  
  var `Channel Statistics`: ChannelInfo[ColorStatistics] = js.native
  
  var Class: String = js.native
  
  var Compose: String = js.native
  
  var Compression: String = js.native
  
  var Depth: String = js.native
  
  var Dispose: String = js.native
  
  var Filesize: String = js.native
  
  var Format: String = js.native
  
  var Geometry: String = js.native
  
  var Interlace: String = js.native
  
  var Iterations: String = js.native
  
  var `JPEG-Colorspace`: js.UndefOr[String] = js.native
  
  var `JPEG-Colorspace-Name`: js.UndefOr[String] = js.native
  
  var `JPEG-Quality`: js.UndefOr[String] = js.native
  
  var `JPEG-Sampling-factors`: js.UndefOr[String] = js.native
  
  var `Matte Color`: String = js.native
  
  var Orientation: String = js.native
  
  var `Page geometry`: String = js.native
  
  var `Profile-EXIF`: js.UndefOr[StringDictionary[String]] = js.native
  
  var `Profile-XMP`: js.UndefOr[String] = js.native
  
  var `Profile-color`: js.UndefOr[String] = js.native
  
  var `Profile-iptc`: js.UndefOr[StringDictionary[String]] = js.native
  
  var Resolution: js.UndefOr[String] = js.native
  
  var Signature: String = js.native
  
  var Software: String = js.native
  
  var Tainted: String = js.native
  
  var Type: String = js.native
  
  var color: Double = js.native
  
  var depth: Double = js.native
  
  var format: String = js.native
  
  var path: String = js.native
  
  var size: Dimensions = js.native
}
object ImageInfo {
  
  @scala.inline
  def apply(
    `Background Color`: String,
    `Border Color`: String,
    `Channel Depths`: ChannelInfo[String],
    `Channel Statistics`: ChannelInfo[ColorStatistics],
    Class: String,
    Compose: String,
    Compression: String,
    Depth: String,
    Dispose: String,
    Filesize: String,
    Format: String,
    Geometry: String,
    Interlace: String,
    Iterations: String,
    `Matte Color`: String,
    Orientation: String,
    `Page geometry`: String,
    Signature: String,
    Software: String,
    Tainted: String,
    Type: String,
    color: Double,
    depth: Double,
    format: String,
    path: String,
    size: Dimensions
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(Class = Class.asInstanceOf[js.Any], Compose = Compose.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Depth = Depth.asInstanceOf[js.Any], Dispose = Dispose.asInstanceOf[js.Any], Filesize = Filesize.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any], Interlace = Interlace.asInstanceOf[js.Any], Iterations = Iterations.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], Software = Software.asInstanceOf[js.Any], Tainted = Tainted.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("Background Color")((`Background Color`).asInstanceOf[js.Any])
    __obj.updateDynamic("Border Color")((`Border Color`).asInstanceOf[js.Any])
    __obj.updateDynamic("Channel Depths")((`Channel Depths`).asInstanceOf[js.Any])
    __obj.updateDynamic("Channel Statistics")((`Channel Statistics`).asInstanceOf[js.Any])
    __obj.updateDynamic("Matte Color")((`Matte Color`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page geometry")((`Page geometry`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  
  @scala.inline
  implicit class ImageInfoOps[Self <: ImageInfo] (val x: Self) extends AnyVal {
    
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
    def `setBackground Color`(value: String): Self = this.set("Background Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder Color`(value: String): Self = this.set("Border Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setChannel Depths`(value: ChannelInfo[String]): Self = this.set("Channel Depths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setChannel Statistics`(value: ChannelInfo[ColorStatistics]): Self = this.set("Channel Statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: String): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompose(value: String): Self = this.set("Compose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: String): Self = this.set("Compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: String): Self = this.set("Depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: String): Self = this.set("Dispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesize(value: String): Self = this.set("Filesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: String): Self = this.set("Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlace(value: String): Self = this.set("Interlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: String): Self = this.set("Iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMatte Color`(value: String): Self = this.set("Matte Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage geometry`(value: String): Self = this.set("Page geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftware(value: String): Self = this.set("Software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTainted(value: String): Self = this.set("Tainted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Dimensions): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJPEG-Colorspace`(value: String): Self = this.set("JPEG-Colorspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJPEG-Colorspace`: Self = this.set("JPEG-Colorspace", js.undefined)
    
    @scala.inline
    def `setJPEG-Colorspace-Name`(value: String): Self = this.set("JPEG-Colorspace-Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJPEG-Colorspace-Name`: Self = this.set("JPEG-Colorspace-Name", js.undefined)
    
    @scala.inline
    def `setJPEG-Quality`(value: String): Self = this.set("JPEG-Quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJPEG-Quality`: Self = this.set("JPEG-Quality", js.undefined)
    
    @scala.inline
    def `setJPEG-Sampling-factors`(value: String): Self = this.set("JPEG-Sampling-factors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJPEG-Sampling-factors`: Self = this.set("JPEG-Sampling-factors", js.undefined)
    
    @scala.inline
    def `setProfile-EXIF`(value: StringDictionary[String]): Self = this.set("Profile-EXIF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteProfile-EXIF`: Self = this.set("Profile-EXIF", js.undefined)
    
    @scala.inline
    def `setProfile-XMP`(value: String): Self = this.set("Profile-XMP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteProfile-XMP`: Self = this.set("Profile-XMP", js.undefined)
    
    @scala.inline
    def `setProfile-color`(value: String): Self = this.set("Profile-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteProfile-color`: Self = this.set("Profile-color", js.undefined)
    
    @scala.inline
    def `setProfile-iptc`(value: StringDictionary[String]): Self = this.set("Profile-iptc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteProfile-iptc`: Self = this.set("Profile-iptc", js.undefined)
    
    @scala.inline
    def setResolution(value: String): Self = this.set("Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("Resolution", js.undefined)
  }
}
