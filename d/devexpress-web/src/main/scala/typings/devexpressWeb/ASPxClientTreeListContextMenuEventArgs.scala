package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
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
  implicit class ASPxClientTreeListContextMenuEventArgsMutableBuilder[Self <: ASPxClientTreeListContextMenuEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectKey(value: js.Any): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
