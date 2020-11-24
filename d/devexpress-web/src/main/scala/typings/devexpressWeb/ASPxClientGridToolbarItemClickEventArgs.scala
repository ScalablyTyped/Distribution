package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridBase.ToolbarItemClick event.
  */
@js.native
trait ASPxClientGridToolbarItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Specifies whether the toolbar item click is handled manually, so no default processing is required.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets the clicked menu item
    */
  var item: ASPxClientMenuItem = js.native
  
  /**
    * Gets the toolbar index.
    */
  var toolbarIndex: Double = js.native
  
  /**
    * Gets the toolbar name.
    */
  var toolbarName: String = js.native
  
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean = js.native
}
object ASPxClientGridToolbarItemClickEventArgs {
  
  @scala.inline
  def apply(
    handled: Boolean,
    item: ASPxClientMenuItem,
    processOnServer: Boolean,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): ASPxClientGridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridToolbarItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridToolbarItemClickEventArgsOps[Self <: ASPxClientGridToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientMenuItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarIndex(value: Double): Self = this.set("toolbarIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarName(value: String): Self = this.set("toolbarName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePostBack(value: Boolean): Self = this.set("usePostBack", value.asInstanceOf[js.Any])
  }
}
