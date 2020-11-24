package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFreeBusyGroup extends js.Object {
  
  /**
    * List of calendars&#39; identifiers within a group.
    */
  var calendars: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional error(s) (if computation for the group failed).
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.native
}
object SchemaFreeBusyGroup {
  
  @scala.inline
  def apply(): SchemaFreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyGroup]
  }
  
  @scala.inline
  implicit class SchemaFreeBusyGroupOps[Self <: SchemaFreeBusyGroup] (val x: Self) extends AnyVal {
    
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
    def setCalendarsVarargs(value: String*): Self = this.set("calendars", js.Array(value :_*))
    
    @scala.inline
    def setCalendars(value: js.Array[String]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
