package typings.gm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
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
    size: Dimensions,
    `JPEG-Colorspace`: String = null,
    `JPEG-Colorspace-Name`: String = null,
    `JPEG-Quality`: String = null,
    `JPEG-Sampling-factors`: String = null,
    `Profile-EXIF`: StringDictionary[String] = null,
    `Profile-XMP`: String = null,
    `Profile-color`: String = null,
    `Profile-iptc`: StringDictionary[String] = null,
    Resolution: String = null
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(Class = Class.asInstanceOf[js.Any], Compose = Compose.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Depth = Depth.asInstanceOf[js.Any], Dispose = Dispose.asInstanceOf[js.Any], Filesize = Filesize.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any], Interlace = Interlace.asInstanceOf[js.Any], Iterations = Iterations.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], Software = Software.asInstanceOf[js.Any], Tainted = Tainted.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("Background Color")(`Background Color`.asInstanceOf[js.Any])
    __obj.updateDynamic("Border Color")(`Border Color`.asInstanceOf[js.Any])
    __obj.updateDynamic("Channel Depths")(`Channel Depths`.asInstanceOf[js.Any])
    __obj.updateDynamic("Channel Statistics")(`Channel Statistics`.asInstanceOf[js.Any])
    __obj.updateDynamic("Matte Color")(`Matte Color`.asInstanceOf[js.Any])
    __obj.updateDynamic("Page geometry")(`Page geometry`.asInstanceOf[js.Any])
    if (`JPEG-Colorspace` != null) __obj.updateDynamic("JPEG-Colorspace")(`JPEG-Colorspace`.asInstanceOf[js.Any])
    if (`JPEG-Colorspace-Name` != null) __obj.updateDynamic("JPEG-Colorspace-Name")(`JPEG-Colorspace-Name`.asInstanceOf[js.Any])
    if (`JPEG-Quality` != null) __obj.updateDynamic("JPEG-Quality")(`JPEG-Quality`.asInstanceOf[js.Any])
    if (`JPEG-Sampling-factors` != null) __obj.updateDynamic("JPEG-Sampling-factors")(`JPEG-Sampling-factors`.asInstanceOf[js.Any])
    if (`Profile-EXIF` != null) __obj.updateDynamic("Profile-EXIF")(`Profile-EXIF`.asInstanceOf[js.Any])
    if (`Profile-XMP` != null) __obj.updateDynamic("Profile-XMP")(`Profile-XMP`.asInstanceOf[js.Any])
    if (`Profile-color` != null) __obj.updateDynamic("Profile-color")(`Profile-color`.asInstanceOf[js.Any])
    if (`Profile-iptc` != null) __obj.updateDynamic("Profile-iptc")(`Profile-iptc`.asInstanceOf[js.Any])
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
}

