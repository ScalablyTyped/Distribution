package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Editor
trait EditorSettings extends StObject {
  
  var changed: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  //Events
  var changing: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object EditorSettings {
  
  @scala.inline
  def apply(): EditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSettings]
  }
  
  @scala.inline
  implicit class EditorSettingsMutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "changed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    @scala.inline
    def setChanging(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "changing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangingUndefined: Self = StObject.set(x, "changing", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
