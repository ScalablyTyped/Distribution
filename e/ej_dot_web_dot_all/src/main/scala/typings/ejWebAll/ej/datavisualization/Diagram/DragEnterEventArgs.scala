package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEnterEventArgs extends js.Object {
  
  /** parameter returns whether to add or remove the symbol from diagram
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** parameter returns the node or connector that is dragged into diagram
    */
  var element: js.UndefOr[js.Any] = js.native
}
object DragEnterEventArgs {
  
  @scala.inline
  def apply(): DragEnterEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragEnterEventArgs]
  }
  
  @scala.inline
  implicit class DragEnterEventArgsOps[Self <: DragEnterEventArgs] (val x: Self) extends AnyVal {
    
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
}
