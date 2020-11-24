package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarTab extends js.Object {
  
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
  implicit class ToolbarTabOps[Self <: ToolbarTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAndroid(value: Boolean): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerFunction0(value: () => Unit): Self = this.set("handler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandler(value: js.Function0[Unit] | String): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(value: Boolean): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuVarargs(value: ToolbarTab*): Self = this.set("menu", js.Array(value :_*))
    
    @scala.inline
    def setMenu(value: js.Array[ToolbarTab]): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
