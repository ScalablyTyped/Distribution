package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait External extends StObject {
  
  var external: js.UndefOr[String] = js.undefined
  
  var local: js.UndefOr[String] = js.undefined
  
  var ui: js.UndefOr[String] = js.undefined
}
object External {
  
  inline def apply(): External = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[External]
  }
  
  extension [Self <: External](x: Self) {
    
    inline def setExternal(value: String): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
