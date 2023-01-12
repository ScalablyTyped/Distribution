package typings.gm.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInfo extends StObject {
  
  var `Background Color`: String
  
  var `Border Color`: String
  
  var `Channel Depths`: ChannelInfo[String]
  
  var `Channel Statistics`: ChannelInfo[ColorStatistics]
  
  var Class: String
  
  var Compose: String
  
  var Compression: String
  
  var Depth: String
  
  var Dispose: String
  
  var Filesize: String
  
  var Format: String
  
  var Geometry: String
  
  var Interlace: String
  
  var Iterations: String
  
  var `JPEG-Colorspace`: js.UndefOr[String] = js.undefined
  
  var `JPEG-Colorspace-Name`: js.UndefOr[String] = js.undefined
  
  var `JPEG-Quality`: js.UndefOr[String] = js.undefined
  
  var `JPEG-Sampling-factors`: js.UndefOr[String] = js.undefined
  
  var `Matte Color`: String
  
  var Orientation: String
  
  var `Page geometry`: String
  
  var `Profile-EXIF`: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var `Profile-XMP`: js.UndefOr[String] = js.undefined
  
  var `Profile-color`: js.UndefOr[String] = js.undefined
  
  var `Profile-iptc`: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Resolution: js.UndefOr[String] = js.undefined
  
  var Signature: String
  
  var Software: String
  
  var Tainted: String
  
  var Type: String
  
  var color: Double
  
  var depth: Double
  
  var format: String
  
  var path: String
  
  var size: Dimensions
}
object ImageInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ImageInfo] (val x: Self) extends AnyVal {
    
    inline def `setBackground Color`(value: String): Self = StObject.set(x, "Background Color", value.asInstanceOf[js.Any])
    
    inline def `setBorder Color`(value: String): Self = StObject.set(x, "Border Color", value.asInstanceOf[js.Any])
    
    inline def `setChannel Depths`(value: ChannelInfo[String]): Self = StObject.set(x, "Channel Depths", value.asInstanceOf[js.Any])
    
    inline def `setChannel Statistics`(value: ChannelInfo[ColorStatistics]): Self = StObject.set(x, "Channel Statistics", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCompose(value: String): Self = StObject.set(x, "Compose", value.asInstanceOf[js.Any])
    
    inline def setCompression(value: String): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: String): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: String): Self = StObject.set(x, "Dispose", value.asInstanceOf[js.Any])
    
    inline def setFilesize(value: String): Self = StObject.set(x, "Filesize", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: String): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setInterlace(value: String): Self = StObject.set(x, "Interlace", value.asInstanceOf[js.Any])
    
    inline def setIterations(value: String): Self = StObject.set(x, "Iterations", value.asInstanceOf[js.Any])
    
    inline def `setJPEG-Colorspace`(value: String): Self = StObject.set(x, "JPEG-Colorspace", value.asInstanceOf[js.Any])
    
    inline def `setJPEG-Colorspace-Name`(value: String): Self = StObject.set(x, "JPEG-Colorspace-Name", value.asInstanceOf[js.Any])
    
    inline def `setJPEG-Colorspace-NameUndefined`: Self = StObject.set(x, "JPEG-Colorspace-Name", js.undefined)
    
    inline def `setJPEG-ColorspaceUndefined`: Self = StObject.set(x, "JPEG-Colorspace", js.undefined)
    
    inline def `setJPEG-Quality`(value: String): Self = StObject.set(x, "JPEG-Quality", value.asInstanceOf[js.Any])
    
    inline def `setJPEG-QualityUndefined`: Self = StObject.set(x, "JPEG-Quality", js.undefined)
    
    inline def `setJPEG-Sampling-factors`(value: String): Self = StObject.set(x, "JPEG-Sampling-factors", value.asInstanceOf[js.Any])
    
    inline def `setJPEG-Sampling-factorsUndefined`: Self = StObject.set(x, "JPEG-Sampling-factors", js.undefined)
    
    inline def `setMatte Color`(value: String): Self = StObject.set(x, "Matte Color", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: String): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def `setPage geometry`(value: String): Self = StObject.set(x, "Page geometry", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def `setProfile-EXIF`(value: StringDictionary[String]): Self = StObject.set(x, "Profile-EXIF", value.asInstanceOf[js.Any])
    
    inline def `setProfile-EXIFUndefined`: Self = StObject.set(x, "Profile-EXIF", js.undefined)
    
    inline def `setProfile-XMP`(value: String): Self = StObject.set(x, "Profile-XMP", value.asInstanceOf[js.Any])
    
    inline def `setProfile-XMPUndefined`: Self = StObject.set(x, "Profile-XMP", js.undefined)
    
    inline def `setProfile-color`(value: String): Self = StObject.set(x, "Profile-color", value.asInstanceOf[js.Any])
    
    inline def `setProfile-colorUndefined`: Self = StObject.set(x, "Profile-color", js.undefined)
    
    inline def `setProfile-iptc`(value: StringDictionary[String]): Self = StObject.set(x, "Profile-iptc", value.asInstanceOf[js.Any])
    
    inline def `setProfile-iptcUndefined`: Self = StObject.set(x, "Profile-iptc", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Dimensions): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSoftware(value: String): Self = StObject.set(x, "Software", value.asInstanceOf[js.Any])
    
    inline def setTainted(value: String): Self = StObject.set(x, "Tainted", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
