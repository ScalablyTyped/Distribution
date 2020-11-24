package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeDragStopEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the current dragged TreeView node
    */
  var draggedElement: js.UndefOr[js.Any] = js.native
  
  /** returns the current dragged TreeView node details
    */
  var draggedElementData: js.UndefOr[js.Any] = js.native
  
  /** returns the original drop target
    */
  var dropTarget: js.UndefOr[js.Any] = js.native
  
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the drop position such as before, after or over
    */
  var position: js.UndefOr[String] = js.native
  
  /** if it is true, the parent node will be prevented from auto expanding; otherwise, it work's usually
    */
  var preventTargetExpand: js.UndefOr[Boolean] = js.native
  
  /** returns the current parent element of the dragged node
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** returns the given parent node details
    */
  var targetElementData: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object NodeDragStopEventArgs {
  
  @scala.inline
  def apply(): NodeDragStopEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDragStopEventArgs]
  }
  
  @scala.inline
  implicit class NodeDragStopEventArgsOps[Self <: NodeDragStopEventArgs] (val x: Self) extends AnyVal {
    
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
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setDraggedElement(value: js.Any): Self = this.set("draggedElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedElement: Self = this.set("draggedElement", js.undefined)
    
    @scala.inline
    def setDraggedElementData(value: js.Any): Self = this.set("draggedElementData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggedElementData: Self = this.set("draggedElementData", js.undefined)
    
    @scala.inline
    def setDropTarget(value: js.Any): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPreventTargetExpand(value: Boolean): Self = this.set("preventTargetExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventTargetExpand: Self = this.set("preventTargetExpand", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetElementData(value: js.Any): Self = this.set("targetElementData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetElementData: Self = this.set("targetElementData", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
