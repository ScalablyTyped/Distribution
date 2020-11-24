package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUsage extends js.Object {
  
  var cssStyleSheets: MemoryUsageDetails = js.native
  
  var fonts: MemoryUsageDetails = js.native
  
  var images: MemoryUsageDetails = js.native
  
  var other: MemoryUsageDetails = js.native
  
  var scripts: MemoryUsageDetails = js.native
  
  var xslStyleSheets: MemoryUsageDetails = js.native
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
  
  @scala.inline
  implicit class ResourceUsageOps[Self <: ResourceUsage] (val x: Self) extends AnyVal {
    
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
    def setCssStyleSheets(value: MemoryUsageDetails): Self = this.set("cssStyleSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFonts(value: MemoryUsageDetails): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: MemoryUsageDetails): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: MemoryUsageDetails): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripts(value: MemoryUsageDetails): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXslStyleSheets(value: MemoryUsageDetails): Self = this.set("xslStyleSheets", value.asInstanceOf[js.Any])
  }
}
