package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the current date object.
    */
  var currentDate: js.UndefOr[js.Any] = js.native
  
  /** Returns the current view value.
    */
  var currentView: js.UndefOr[String] = js.native
  
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the previous date of the Schedule.
    */
  var previousDate: js.UndefOr[js.Any] = js.native
  
  /** Returns the previous view value.
    */
  var previousView: js.UndefOr[String] = js.native
  
  /** Returns the name of the Scheduler event.
    */
  var requestType: js.UndefOr[String] = js.native
  
  /** Returns the target of the action.
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object NavigationEventArgs {
  
  @scala.inline
  def apply(): NavigationEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventArgs]
  }
  
  @scala.inline
  implicit class NavigationEventArgsOps[Self <: NavigationEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCurrentDate(value: js.Any): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    
    @scala.inline
    def setCurrentView(value: String): Self = this.set("currentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentView: Self = this.set("currentView", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPreviousDate(value: js.Any): Self = this.set("previousDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousDate: Self = this.set("previousDate", js.undefined)
    
    @scala.inline
    def setPreviousView(value: String): Self = this.set("previousView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousView: Self = this.set("previousView", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
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
