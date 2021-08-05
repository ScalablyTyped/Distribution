package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxVideoOptions extends StObject {
  
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[String] = js.undefined
}
object FancyBoxVideoOptions {
  
  inline def apply(): FancyBoxVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxVideoOptions]
  }
  
  extension [Self <: FancyBoxVideoOptions](x: Self) {
    
    inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setTpl(value: String): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
