package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintOptions extends StObject {
  
  var footer: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
}
object PrintOptions {
  
  inline def apply(): PrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOptions]
  }
  
  extension [Self <: PrintOptions](x: Self) {
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
