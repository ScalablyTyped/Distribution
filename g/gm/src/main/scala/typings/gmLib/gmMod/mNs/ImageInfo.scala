package typings
package gmLib.gmMod.mNs

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

