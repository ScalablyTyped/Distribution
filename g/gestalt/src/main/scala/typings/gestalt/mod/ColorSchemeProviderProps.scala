package typings.gestalt.mod

import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.userPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSchemeProviderProps extends StObject {
  
  var colorScheme: light | dark | userPreference
  
  var id: js.UndefOr[String] = js.undefined
}
object ColorSchemeProviderProps {
  
  inline def apply(colorScheme: light | dark | userPreference): ColorSchemeProviderProps = {
    val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemeProviderProps]
  }
  
  extension [Self <: ColorSchemeProviderProps](x: Self) {
    
    inline def setColorScheme(value: light | dark | userPreference): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
