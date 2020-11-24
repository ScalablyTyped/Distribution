package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.ContextMenu event.
  */
@js.native
trait ASPxClientGridViewContextMenuEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.ContextMenu event.
    */
  var htmlEvent: js.Any = js.native
  
  /**
    * Identifies the grid element being right clicked by the user.
    */
  var index: Double = js.native
  
  /**
    * Gets the currently processed menu object.
    */
  var menu: js.Any = js.native
  
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String = js.native
  
  /**
    * Specifies whether a browser context menu should be displayed.
    */
  var showBrowserMenu: Boolean = js.native
}
object ASPxClientGridViewContextMenuEventArgs {
  
  @scala.inline
  def apply(htmlEvent: js.Any, index: Double, menu: js.Any, objectType: String, showBrowserMenu: Boolean): ASPxClientGridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewContextMenuEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewContextMenuEventArgsOps[Self <: ASPxClientGridViewContextMenuEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHtmlEvent(value: js.Any): Self = this.set("htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: js.Any): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBrowserMenu(value: Boolean): Self = this.set("showBrowserMenu", value.asInstanceOf[js.Any])
  }
}
