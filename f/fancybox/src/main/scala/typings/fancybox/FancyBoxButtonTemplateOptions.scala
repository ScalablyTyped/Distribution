package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxButtonTemplateOptions extends StObject {
  
  var arrowLeft: js.UndefOr[String] = js.undefined
  
  var arrowRight: js.UndefOr[String] = js.undefined
  
  var close: js.UndefOr[String] = js.undefined
  
  var download: js.UndefOr[String] = js.undefined
  
  /**
    * This small close button will be appended to your html/inline/ajax content by default,
    * if "smallBtn" option is not set to false
    */
  var smallBtn: js.UndefOr[String] = js.undefined
  
  var zoom: js.UndefOr[String] = js.undefined
}
object FancyBoxButtonTemplateOptions {
  
  inline def apply(): FancyBoxButtonTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxButtonTemplateOptions]
  }
  
  extension [Self <: FancyBoxButtonTemplateOptions](x: Self) {
    
    inline def setArrowLeft(value: String): Self = StObject.set(x, "arrowLeft", value.asInstanceOf[js.Any])
    
    inline def setArrowLeftUndefined: Self = StObject.set(x, "arrowLeft", js.undefined)
    
    inline def setArrowRight(value: String): Self = StObject.set(x, "arrowRight", value.asInstanceOf[js.Any])
    
    inline def setArrowRightUndefined: Self = StObject.set(x, "arrowRight", js.undefined)
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setSmallBtn(value: String): Self = StObject.set(x, "smallBtn", value.asInstanceOf[js.Any])
    
    inline def setSmallBtnUndefined: Self = StObject.set(x, "smallBtn", js.undefined)
    
    inline def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
