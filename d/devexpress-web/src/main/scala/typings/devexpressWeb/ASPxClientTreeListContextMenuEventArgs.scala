package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ContextMenu event.
  */
trait ASPxClientTreeListContextMenuEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets whether to invoke the browser's context menu.
    */
  var cancel: Boolean
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
  
  /**
    * Gets a value that identifies the right-clicked object.
    */
  var objectKey: Any
  
  /**
    * Identifies which tree list element has been right-clicked.
    */
  var objectType: String
}
object ASPxClientTreeListContextMenuEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: Any, objectKey: Any, objectType: String): ASPxClientTreeListContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListContextMenuEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientTreeListContextMenuEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setObjectKey(value: Any): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
