package typings.ejWebAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InActivateEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns in active element
    */
  var inActiveHeader: js.UndefOr[js.Any] = js.native
  
  /** returns active index
    */
  var inActiveIndex: js.UndefOr[Double] = js.native
  
  /** returns true when the Accordion index activated by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.native
  
  /** returns the accordion model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object InActivateEventArgs {
  
  @scala.inline
  def apply(): InActivateEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InActivateEventArgs]
  }
  
  @scala.inline
  implicit class InActivateEventArgsOps[Self <: InActivateEventArgs] (val x: Self) extends AnyVal {
    
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
    def setInActiveHeader(value: js.Any): Self = this.set("inActiveHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInActiveHeader: Self = this.set("inActiveHeader", js.undefined)
    
    @scala.inline
    def setInActiveIndex(value: Double): Self = this.set("inActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInActiveIndex: Self = this.set("inActiveIndex", js.undefined)
    
    @scala.inline
    def setIsInteraction(value: Boolean): Self = this.set("isInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteraction: Self = this.set("isInteraction", js.undefined)
    
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
