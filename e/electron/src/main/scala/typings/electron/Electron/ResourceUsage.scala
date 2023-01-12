package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUsage extends StObject {
  
  var cssStyleSheets: MemoryUsageDetails
  
  var fonts: MemoryUsageDetails
  
  var images: MemoryUsageDetails
  
  var other: MemoryUsageDetails
  
  var scripts: MemoryUsageDetails
  
  var xslStyleSheets: MemoryUsageDetails
}
object ResourceUsage {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ResourceUsage] (val x: Self) extends AnyVal {
    
    inline def setCssStyleSheets(value: MemoryUsageDetails): Self = StObject.set(x, "cssStyleSheets", value.asInstanceOf[js.Any])
    
    inline def setFonts(value: MemoryUsageDetails): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setImages(value: MemoryUsageDetails): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setOther(value: MemoryUsageDetails): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: MemoryUsageDetails): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setXslStyleSheets(value: MemoryUsageDetails): Self = StObject.set(x, "xslStyleSheets", value.asInstanceOf[js.Any])
  }
}
