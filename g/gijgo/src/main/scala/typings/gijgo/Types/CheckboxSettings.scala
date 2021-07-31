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
  
  @scala.inline
  def apply(): CheckboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxSettings]
  }
  
  @scala.inline
  implicit class CheckboxSettingsMutableBuilder[Self <: CheckboxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (/* e */ js.Any, /* state */ String) => js.Any): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
  }
}
