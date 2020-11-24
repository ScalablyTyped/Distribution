package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChangeEventArgs extends js.Object {
  
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** parameter returns the node that contains the text being edited
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /** parameter returns the keyCode of the key entered
    */
  var keyCode: js.UndefOr[String] = js.native
  
  /** parameter returns the new text
    */
  var value: js.UndefOr[String] = js.native
}
object TextChangeEventArgs {
  
  @scala.inline
  def apply(): TextChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextChangeEventArgs]
  }
  
  @scala.inline
  implicit class TextChangeEventArgsOps[Self <: TextChangeEventArgs] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setKeyCode(value: String): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
