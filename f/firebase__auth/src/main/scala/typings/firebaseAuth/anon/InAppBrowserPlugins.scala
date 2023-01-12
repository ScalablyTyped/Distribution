package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowserPlugins extends StObject {
  
  var InAppBrowser: `11`
  
  var plugins: Browsertab
}
object InAppBrowserPlugins {
  
  inline def apply(InAppBrowser: `11`, plugins: Browsertab): InAppBrowserPlugins = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppBrowserPlugins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppBrowserPlugins] (val x: Self) extends AnyVal {
    
    inline def setInAppBrowser(value: `11`): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Browsertab): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
