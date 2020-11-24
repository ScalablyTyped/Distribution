package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ContextMenu event.
  */
@js.native
trait ASPxClientTreeListContextMenuEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets whether to invoke the browser's context menu.
    */
  var cancel: Boolean = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  
  /**
    * Gets a value that identifies the right-clicked object.
    */
  var objectKey: js.Any = js.native
  
  /**
    * Identifies which tree list element has been right-clicked.
    */
  var objectType: String = js.native
}
object ASPxClientTreeListContextMenuEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, objectKey: js.Any, objectType: String): ASPxClientTreeListContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListContextMenuEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListContextMenuEventArgsOps[Self <: ASPxClientTreeListContextMenuEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = this.set("htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectKey(value: js.Any): Self = this.set("objectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
  }
}
