package typings.domChromiumInstallationEvents

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventMap extends StObject {
  
  var appinstalled: Event
  
  var beforeinstallprompt: BeforeInstallPromptEvent
}
object WindowEventMap {
  
  inline def apply(appinstalled: Event, beforeinstallprompt: BeforeInstallPromptEvent): WindowEventMap = {
    val __obj = js.Dynamic.literal(appinstalled = appinstalled.asInstanceOf[js.Any], beforeinstallprompt = beforeinstallprompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    
    inline def setAppinstalled(value: Event): Self = StObject.set(x, "appinstalled", value.asInstanceOf[js.Any])
    
    inline def setBeforeinstallprompt(value: BeforeInstallPromptEvent): Self = StObject.set(x, "beforeinstallprompt", value.asInstanceOf[js.Any])
  }
}
