package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentChangeEventArgs extends js.Object {
  
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** parameter returns the state of editing (starting, dragging, completed)
    */
  var dragState: js.UndefOr[String] = js.native
  
  /** Parameter returns the connector that is being edited
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the current mouse position
    */
  var point: js.UndefOr[js.Any] = js.native
}
object SegmentChangeEventArgs {
  
  @scala.inline
  def apply(): SegmentChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentChangeEventArgs]
  }
  
  @scala.inline
  implicit class SegmentChangeEventArgsOps[Self <: SegmentChangeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    
    @scala.inline
    def setDragState(value: String): Self = this.set("dragState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragState: Self = this.set("dragState", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setPoint(value: js.Any): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
  }
}
