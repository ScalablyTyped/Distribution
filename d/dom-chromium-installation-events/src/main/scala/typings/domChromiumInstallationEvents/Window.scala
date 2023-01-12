package typings.domChromiumInstallationEvents

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var onappinstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
  
  var onbeforeinstallprompt: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ BeforeInstallPromptEvent, Any]) | Null
  ] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setOnappinstalled(value: js.ThisFunction1[Window, /* ev */ Event, Any]): Self = StObject.set(x, "onappinstalled", value.asInstanceOf[js.Any])
    
    inline def setOnappinstalledNull: Self = StObject.set(x, "onappinstalled", null)
    
    inline def setOnappinstalledUndefined: Self = StObject.set(x, "onappinstalled", js.undefined)
    
    inline def setOnbeforeinstallprompt(value: js.ThisFunction1[Window, /* ev */ BeforeInstallPromptEvent, Any]): Self = StObject.set(x, "onbeforeinstallprompt", value.asInstanceOf[js.Any])
    
    inline def setOnbeforeinstallpromptNull: Self = StObject.set(x, "onbeforeinstallprompt", null)
    
    inline def setOnbeforeinstallpromptUndefined: Self = StObject.set(x, "onbeforeinstallprompt", js.undefined)
  }
}
