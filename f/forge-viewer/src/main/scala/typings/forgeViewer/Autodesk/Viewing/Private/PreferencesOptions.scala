package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferencesOptions extends StObject {
  
  var localStorage: js.UndefOr[Boolean] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
}
object PreferencesOptions {
  
  inline def apply(): PreferencesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreferencesOptions]
  }
  
  extension [Self <: PreferencesOptions](x: Self) {
    
    inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
