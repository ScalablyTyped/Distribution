package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowser24 extends StObject {
  
  var InAppBrowser: `24`
  
  var plugins: Browsertab
}
object InAppBrowser24 {
  
  inline def apply(InAppBrowser: `24`, plugins: Browsertab): InAppBrowser24 = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppBrowser24]
  }
  
  extension [Self <: InAppBrowser24](x: Self) {
    
    inline def setInAppBrowser(value: `24`): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Browsertab): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
