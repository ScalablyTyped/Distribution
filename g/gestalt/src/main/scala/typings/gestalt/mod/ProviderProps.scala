package typings.gestalt.mod

import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.userPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderProps extends StObject {
  
  var colorScheme: js.UndefOr[light | dark | userPreference] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object ProviderProps {
  
  inline def apply(): ProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderProps]
  }
  
  extension [Self <: ProviderProps](x: Self) {
    
    inline def setColorScheme(value: light | dark | userPreference): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
