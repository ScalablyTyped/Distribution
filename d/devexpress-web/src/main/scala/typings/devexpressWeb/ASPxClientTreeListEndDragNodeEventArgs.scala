package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.EndDragNode event.
  */
@js.native
trait ASPxClientTreeListEndDragNodeEventArgs extends ASPxClientTreeListNodeEventArgs {
  
  /**
    * Gets the target element.
    */
  var targetElement: js.Any = js.native
}
object ASPxClientTreeListEndDragNodeEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String, targetElement: js.Any): ASPxClientTreeListEndDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListEndDragNodeEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListEndDragNodeEventArgsMutableBuilder[Self <: ASPxClientTreeListEndDragNodeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetElement(value: js.Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
  }
}
