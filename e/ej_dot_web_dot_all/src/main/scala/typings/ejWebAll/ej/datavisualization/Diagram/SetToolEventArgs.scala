package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetToolEventArgs extends js.Object {
  
  /** Defines the tool to be activated.
    */
  var action: js.UndefOr[ActiveTool] = js.native
  
  /** Returns the port when mouse move over on it
    */
  var source: js.UndefOr[js.Any] = js.native
}
object SetToolEventArgs {
  
  @scala.inline
  def apply(): SetToolEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetToolEventArgs]
  }
  
  @scala.inline
  implicit class SetToolEventArgsOps[Self <: SetToolEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ActiveTool): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
