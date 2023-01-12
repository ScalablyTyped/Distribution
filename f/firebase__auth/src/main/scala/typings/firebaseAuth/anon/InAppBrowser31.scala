package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowser31 extends StObject {
  
  var InAppBrowser: `31`
  
  var plugins: Browsertab
}
object InAppBrowser31 {
  
  inline def apply(InAppBrowser: `31`, plugins: Browsertab): InAppBrowser31 = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppBrowser31]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppBrowser31] (val x: Self) extends AnyVal {
    
    inline def setInAppBrowser(value: `31`): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Browsertab): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
