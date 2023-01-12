package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxIframeSettings extends StObject {
  
  /**
    * Iframe tag attributes
    */
  var attr: js.UndefOr[FancyBoxPlainObject] = js.undefined
  
  /**
    * Custom CSS styling for iframe wrapping element
    * You can use this to set custom iframe dimensions
    */
  var css: js.UndefOr[FancyBoxPlainObject] = js.undefined
  
  /**
    * Preload iframe before displaying it
    * This allows to calculate iframe content width and height
    * (note: Due to "Same Origin Policy", you can't get cross domain data).
    */
  var preload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Iframe template
    */
  var tpl: js.UndefOr[String] = js.undefined
}
object FancyBoxIframeSettings {
  
  inline def apply(): FancyBoxIframeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxIframeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FancyBoxIframeSettings] (val x: Self) extends AnyVal {
    
    inline def setAttr(value: FancyBoxPlainObject): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setCss(value: FancyBoxPlainObject): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setTpl(value: String): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
