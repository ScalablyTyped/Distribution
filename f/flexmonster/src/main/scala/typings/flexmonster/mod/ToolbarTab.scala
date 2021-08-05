package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarTab extends StObject {
  
  var android: Boolean
  
  var args: js.Any
  
  var handler: js.Function0[Unit] | String
  
  var icon: String
  
  var id: String
  
  var ios: Boolean
  
  var menu: js.Array[ToolbarTab]
  
  var mobile: Boolean
  
  var title: String
}
object ToolbarTab {
  
  inline def apply(
    android: Boolean,
    args: js.Any,
    handler: js.Function0[Unit] | String,
    icon: String,
    id: String,
    ios: Boolean,
    menu: js.Array[ToolbarTab],
    mobile: Boolean,
    title: String
  ): ToolbarTab = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarTab]
  }
  
  extension [Self <: ToolbarTab](x: Self) {
    
    inline def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: js.Function0[Unit] | String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerFunction0(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: js.Array[ToolbarTab]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuVarargs(value: ToolbarTab*): Self = StObject.set(x, "menu", js.Array(value :_*))
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
