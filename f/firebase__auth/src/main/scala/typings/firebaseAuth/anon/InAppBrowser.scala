package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowser extends StObject {
  
  var InAppBrowser: Open
  
  var plugins: Browsertab
}
object InAppBrowser {
  
  inline def apply(InAppBrowser: Open, plugins: Browsertab): InAppBrowser = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppBrowser]
  }
  
  extension [Self <: InAppBrowser](x: Self) {
    
    inline def setInAppBrowser(value: Open): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Browsertab): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
