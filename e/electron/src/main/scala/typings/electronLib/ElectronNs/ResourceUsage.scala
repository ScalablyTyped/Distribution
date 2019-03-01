package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUsage extends js.Object {
  var cssStyleSheets: MemoryUsageDetails
  var fonts: MemoryUsageDetails
  var images: MemoryUsageDetails
  var other: MemoryUsageDetails
  var scripts: MemoryUsageDetails
  var xslStyleSheets: MemoryUsageDetails
}

object ResourceUsage {
  @scala.inline
  def apply(
    cssStyleSheets: MemoryUsageDetails,
    fonts: MemoryUsageDetails,
    images: MemoryUsageDetails,
    other: MemoryUsageDetails,
    scripts: MemoryUsageDetails,
    xslStyleSheets: MemoryUsageDetails
  ): ResourceUsage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cssStyleSheets")(cssStyleSheets)
    __obj.updateDynamic("fonts")(fonts)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("other")(other)
    __obj.updateDynamic("scripts")(scripts)
    __obj.updateDynamic("xslStyleSheets")(xslStyleSheets)
    __obj.asInstanceOf[ResourceUsage]
  }
}

