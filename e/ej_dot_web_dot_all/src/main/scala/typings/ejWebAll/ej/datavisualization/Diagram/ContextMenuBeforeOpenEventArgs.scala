package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuBeforeOpenEventArgs extends js.Object {
  
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** parameter returns the actual arguments from context menu
    */
  var contextmenu: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the diagram object
    */
  var diagram: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** parameter returns the actual click event arguments that explains which button is clicked
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the object that was clicked
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the type of the event triggered
    */
  var `type`: js.UndefOr[String] = js.native
}
object ContextMenuBeforeOpenEventArgs {
  
  @scala.inline
  def apply(): ContextMenuBeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuBeforeOpenEventArgs]
  }
  
  @scala.inline
  implicit class ContextMenuBeforeOpenEventArgsOps[Self <: ContextMenuBeforeOpenEventArgs] (val x: Self) extends AnyVal {
    
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
    def setContextmenu(value: js.Any): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    
    @scala.inline
    def setDiagram(value: js.Any): Self = this.set("diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagram: Self = this.set("diagram", js.undefined)
    
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
