package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarTab extends StObject {
  
  var android: Boolean = js.native
  
  var args: js.Any = js.native
  
  var handler: js.Function0[Unit] | String = js.native
  
  var icon: String = js.native
  
  var id: String = js.native
  
  var ios: Boolean = js.native
  
  var menu: js.Array[ToolbarTab] = js.native
  
  var mobile: Boolean = js.native
  
  var title: String = js.native
}
object ToolbarTab {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ToolbarTabMutableBuilder[Self <: ToolbarTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: js.Function0[Unit] | String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerFunction0(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: js.Array[ToolbarTab]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuVarargs(value: ToolbarTab*): Self = StObject.set(x, "menu", js.Array(value :_*))
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
