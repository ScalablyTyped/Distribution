package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeChangeEventArgs extends js.Object {
  
  /** parameter to cancel the size change
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** parameter returns the direction of the node is resized
    */
  var direction: js.UndefOr[String] = js.native
  
  /** parameter returns node that was resized
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the new width, height, offsetX and offsetY values of the element that is being resized
    */
  var newValue: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the difference between new and old value
    */
  var offset: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the previous width,height,offsetX and offsetY values of the element that is being resized
    */
  var oldValue: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the state of resizing(starting,resizing,completed)
    */
  var resizeState: js.UndefOr[String] = js.native
}
object SizeChangeEventArgs {
  
  @scala.inline
  def apply(): SizeChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeChangeEventArgs]
  }
  
  @scala.inline
  implicit class SizeChangeEventArgsOps[Self <: SizeChangeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    
    @scala.inline
    def setResizeState(value: String): Self = this.set("resizeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeState: Self = this.set("resizeState", js.undefined)
  }
}
