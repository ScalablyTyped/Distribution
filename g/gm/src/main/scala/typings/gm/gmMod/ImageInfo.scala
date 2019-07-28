package typings.gm.gmMod

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
    val __obj = js.Dynamic.literal(Class = Class, Compose = Compose, Compression = Compression, Depth = Depth, Dispose = Dispose, Filesize = Filesize, Format = Format, Geometry = Geometry, Interlace = Interlace, Iterations = Iterations, Orientation = Orientation, Signature = Signature, Software = Software, Tainted = Tainted, Type = Type, color = color, depth = depth, format = format, path = path, size = size)
    __obj.updateDynamic("Background Color")(`Background Color`)
    __obj.updateDynamic("Border Color")(`Border Color`)
    __obj.updateDynamic("Channel Depths")(`Channel Depths`)
    __obj.updateDynamic("Channel Statistics")(`Channel Statistics`)
    __obj.updateDynamic("Matte Color")(`Matte Color`)
    __obj.updateDynamic("Page geometry")(`Page geometry`)
    if (`JPEG-Colorspace` != null) __obj.updateDynamic("JPEG-Colorspace")(`JPEG-Colorspace`)
    if (`JPEG-Colorspace-Name` != null) __obj.updateDynamic("JPEG-Colorspace-Name")(`JPEG-Colorspace-Name`)
    if (`JPEG-Quality` != null) __obj.updateDynamic("JPEG-Quality")(`JPEG-Quality`)
    if (`JPEG-Sampling-factors` != null) __obj.updateDynamic("JPEG-Sampling-factors")(`JPEG-Sampling-factors`)
    if (`Profile-EXIF` != null) __obj.updateDynamic("Profile-EXIF")(`Profile-EXIF`)
    if (`Profile-XMP` != null) __obj.updateDynamic("Profile-XMP")(`Profile-XMP`)
    if (`Profile-color` != null) __obj.updateDynamic("Profile-color")(`Profile-color`)
    if (`Profile-iptc` != null) __obj.updateDynamic("Profile-iptc")(`Profile-iptc`)
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution)
    __obj.asInstanceOf[ImageInfo]
  }
}

