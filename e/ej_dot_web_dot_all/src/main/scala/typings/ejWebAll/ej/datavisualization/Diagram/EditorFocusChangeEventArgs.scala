package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorFocusChangeEventArgs extends js.Object {
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** parameter returns the editor element
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** Returns the diagram model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object EditorFocusChangeEventArgs {
  
  @scala.inline
  def apply(): EditorFocusChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFocusChangeEventArgs]
  }
  
  @scala.inline
  implicit class EditorFocusChangeEventArgsOps[Self <: EditorFocusChangeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
