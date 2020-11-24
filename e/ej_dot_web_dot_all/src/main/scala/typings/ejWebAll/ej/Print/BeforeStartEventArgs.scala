package typings.ejWebAll.ej.Print

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeStartEventArgs extends js.Object {
  
  /** Set this option as true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the printed element
    */
  var content: js.UndefOr[js.Any] = js.native
  
  /** Returns the Print model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the name of an event
    */
  var `type`: js.UndefOr[String] = js.native
}
object BeforeStartEventArgs {
  
  @scala.inline
  def apply(): BeforeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeStartEventArgs]
  }
  
  @scala.inline
  implicit class BeforeStartEventArgsOps[Self <: BeforeStartEventArgs] (val x: Self) extends AnyVal {
    
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
