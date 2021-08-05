package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Checkbox
trait CheckboxSettings extends StObject {
  
  //Events
  var change: js.UndefOr[js.Function2[/* e */ js.Any, /* state */ String, js.Any]] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
}
object CheckboxSettings {
  
  inline def apply(): CheckboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxSettings]
  }
  
  extension [Self <: CheckboxSettings](x: Self) {
    
    inline def setChange(value: (/* e */ js.Any, /* state */ String) => js.Any): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    inline def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
  }
}
