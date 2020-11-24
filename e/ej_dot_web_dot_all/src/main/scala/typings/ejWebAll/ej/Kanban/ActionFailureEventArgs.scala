package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionFailureEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns current filtering column field name.
    */
  var currentFilteringColumn: js.UndefOr[String] = js.native
  
  /** Returns the card object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns the error return by server.
    */
  var error: js.UndefOr[js.Any] = js.native
  
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.native
  
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns current action event type.
    */
  var originalEventType: js.UndefOr[String] = js.native
  
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[String] = js.native
  
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.native
  
  /** Returns Kanban element.
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ActionFailureEventArgs {
  
  @scala.inline
  def apply(): ActionFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionFailureEventArgs]
  }
  
  @scala.inline
  implicit class ActionFailureEventArgsOps[Self <: ActionFailureEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCurrentFilteringColumn(value: String): Self = this.set("currentFilteringColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentFilteringColumn: Self = this.set("currentFilteringColumn", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFilterCollection(value: js.Any): Self = this.set("filterCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterCollection: Self = this.set("filterCollection", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setOriginalEventType(value: String): Self = this.set("originalEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalEventType: Self = this.set("originalEventType", js.undefined)
    
    @scala.inline
    def setPrimaryKeyValue(value: String): Self = this.set("primaryKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKeyValue: Self = this.set("primaryKeyValue", js.undefined)
    
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
