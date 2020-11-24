package typings.devexpressWeb

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
  implicit class ASPxClientTreeListStartDragNodeEventArgsOps[Self <: ASPxClientTreeListStartDragNodeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setTargetsVarargs(value: js.Any*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[_]): Self = this.set("targets", value.asInstanceOf[js.Any])
  }
}
