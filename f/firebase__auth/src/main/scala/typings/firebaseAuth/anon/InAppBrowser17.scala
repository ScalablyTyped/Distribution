package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowser17 extends StObject {
  
  var InAppBrowser: `17`
  
  var plugins: Browsertab
}
object InAppBrowser17 {
  
  inline def apply(InAppBrowser: `17`, plugins: Browsertab): InAppBrowser17 = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppBrowser17]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppBrowser17] (val x: Self) extends AnyVal {
    
    inline def setInAppBrowser(value: `17`): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Browsertab): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
