package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUsage extends StObject {
  
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
  implicit class ResourceUsageMutableBuilder[Self <: ResourceUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssStyleSheets(value: MemoryUsageDetails): Self = StObject.set(x, "cssStyleSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFonts(value: MemoryUsageDetails): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: MemoryUsageDetails): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: MemoryUsageDetails): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripts(value: MemoryUsageDetails): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXslStyleSheets(value: MemoryUsageDetails): Self = StObject.set(x, "xslStyleSheets", value.asInstanceOf[js.Any])
  }
}
