package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var `Background Color`: java.lang.String
  var `Border Color`: java.lang.String
  var `Channel Depths`: ChannelInfo[java.lang.String]
  var `Channel Statistics`: ChannelInfo[ColorStatistics]
  var Class: java.lang.String
  var Compose: java.lang.String
  var Compression: java.lang.String
  var Depth: java.lang.String
  var Dispose: java.lang.String
  var Filesize: java.lang.String
  var Format: java.lang.String
  var Geometry: java.lang.String
  var Interlace: java.lang.String
  var Iterations: java.lang.String
  var `JPEG-Colorspace`: js.UndefOr[java.lang.String] = js.undefined
  var `JPEG-Colorspace-Name`: js.UndefOr[java.lang.String] = js.undefined
  var `JPEG-Quality`: js.UndefOr[java.lang.String] = js.undefined
  var `JPEG-Sampling-factors`: js.UndefOr[java.lang.String] = js.undefined
  var `Matte Color`: java.lang.String
  var Orientation: java.lang.String
  var `Page geometry`: java.lang.String
  var `Profile-EXIF`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var `Profile-XMP`: js.UndefOr[java.lang.String] = js.undefined
  var `Profile-color`: js.UndefOr[java.lang.String] = js.undefined
  var `Profile-iptc`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Resolution: js.UndefOr[java.lang.String] = js.undefined
  var Signature: java.lang.String
  var Software: java.lang.String
  var Tainted: java.lang.String
  var Type: java.lang.String
  var color: scala.Double
  var depth: scala.Double
  var format: java.lang.String
  var path: java.lang.String
  var size: Dimensions
}

object ImageInfo {
  @scala.inline
  def apply(
    `Background Color`: java.lang.String,
    `Border Color`: java.lang.String,
    `Channel Depths`: ChannelInfo[java.lang.String],
    `Channel Statistics`: ChannelInfo[ColorStatistics],
    Class: java.lang.String,
    Compose: java.lang.String,
    Compression: java.lang.String,
    Depth: java.lang.String,
    Dispose: java.lang.String,
    Filesize: java.lang.String,
    Format: java.lang.String,
    Geometry: java.lang.String,
    Interlace: java.lang.String,
    Iterations: java.lang.String,
    `Matte Color`: java.lang.String,
    Orientation: java.lang.String,
    `Page geometry`: java.lang.String,
    Signature: java.lang.String,
    Software: java.lang.String,
    Tainted: java.lang.String,
    Type: java.lang.String,
    color: scala.Double,
    depth: scala.Double,
    format: java.lang.String,
    path: java.lang.String,
    size: Dimensions,
    `JPEG-Colorspace`: java.lang.String = null,
    `JPEG-Colorspace-Name`: java.lang.String = null,
    `JPEG-Quality`: java.lang.String = null,
    `JPEG-Sampling-factors`: java.lang.String = null,
    `Profile-EXIF`: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    `Profile-XMP`: java.lang.String = null,
    `Profile-color`: java.lang.String = null,
    `Profile-iptc`: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    Resolution: java.lang.String = null
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

