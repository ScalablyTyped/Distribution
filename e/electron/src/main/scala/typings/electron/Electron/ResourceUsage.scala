package typings.electron.Electron

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
    val __obj = js.Dynamic.literal(cssStyleSheets = cssStyleSheets.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], xslStyleSheets = xslStyleSheets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceUsage]
  }
}

