package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowser39 extends StObject {
  
  var InAppBrowser: `39`
  
  var plugins: Browsertab
}
object InAppBrowser39 {
  
  inline def apply(InAppBrowser: `39`, plugins: Browsertab): InAppBrowser39 = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppBrowser39]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppBrowser39] (val x: Self) extends AnyVal {
    
    inline def setInAppBrowser(value: `39`): Self = StObject.set(x, "InAppBrowser", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Browsertab): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
