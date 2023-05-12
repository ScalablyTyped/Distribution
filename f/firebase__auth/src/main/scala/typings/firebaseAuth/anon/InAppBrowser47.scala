package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowser47 extends StObject {
  
  var InAppBrowser: `47`
  
  var plugins: Browsertab
}
object InAppBrowser47 {
  
  inline def apply(InAppBrowser: `47`, plugins: Browsertab): InAppBrowser47 = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppBrowser47]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppBrowser47] (val x: Self) extends AnyVal {
    
    inline def setInAppBrowser(value: `47`): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Browsertab): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
