package typings.gestalt.mod

import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.userPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * =========================================================
  * ================= UTILITY API INTERFACES ================
  * =========================================================
  */
trait ColorSchemeProviderProps extends StObject {
  
  var children: Node
  
  var colorScheme: light | dark | userPreference
  
  var id: js.UndefOr[String] = js.undefined
}
object ColorSchemeProviderProps {
  
  inline def apply(colorScheme: light | dark | userPreference): ColorSchemeProviderProps = {
    val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemeProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSchemeProviderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColorScheme(value: light | dark | userPreference): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
