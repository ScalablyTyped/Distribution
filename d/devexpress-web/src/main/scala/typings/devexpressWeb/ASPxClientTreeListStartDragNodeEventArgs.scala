package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.StartDragNode event.
  */
@js.native
trait ASPxClientTreeListStartDragNodeEventArgs extends ASPxClientTreeListNodeEventArgs {
  
  /**
    * Gets an array of targets where a node can be dragged.
    */
  var targets: js.Array[_] = js.native
}
object ASPxClientTreeListStartDragNodeEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, nodeKey: String, targets: js.Array[_]): ASPxClientTreeListStartDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListStartDragNodeEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListStartDragNodeEventArgsMutableBuilder[Self <: ASPxClientTreeListStartDragNodeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargets(value: js.Array[_]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: js.Any*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
