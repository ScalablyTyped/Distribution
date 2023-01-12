package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Editor
trait EditorSettings extends StObject {
  
  var changed: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  //Events
  var changing: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object EditorSettings {
  
  inline def apply(): EditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
    
    inline def setChanged(value: /* e */ Any => Any): Self = StObject.set(x, "changed", js.Any.fromFunction1(value))
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setChanging(value: /* e */ Any => Any): Self = StObject.set(x, "changing", js.Any.fromFunction1(value))
    
    inline def setChangingUndefined: Self = StObject.set(x, "changing", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    inline def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
