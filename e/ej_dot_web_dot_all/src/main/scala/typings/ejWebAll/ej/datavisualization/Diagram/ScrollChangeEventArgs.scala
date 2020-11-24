package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollChangeEventArgs extends js.Object {
  
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
    */
  var cause: js.UndefOr[String] = js.native
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
    */
  var newValues: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the previous zoom value, horizontal and vertical scroll offsets.
    */
  var oldValues: js.UndefOr[js.Any] = js.native
}
object ScrollChangeEventArgs {
  
  @scala.inline
  def apply(): ScrollChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollChangeEventArgs]
  }
  
  @scala.inline
  implicit class ScrollChangeEventArgsOps[Self <: ScrollChangeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    
    @scala.inline
    def setNewValues(value: js.Any): Self = this.set("newValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValues: Self = this.set("newValues", js.undefined)
    
    @scala.inline
    def setOldValues(value: js.Any): Self = this.set("oldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValues: Self = this.set("oldValues", js.undefined)
  }
}
