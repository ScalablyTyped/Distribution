package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendars extends js.Object {
  
  var calendars: js.Array[String] = js.native
  
  var errors: js.UndefOr[js.Array[Domain]] = js.native
}
object Calendars {
  
  @scala.inline
  def apply(calendars: js.Array[String]): Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
  
  @scala.inline
  implicit class CalendarsOps[Self <: Calendars] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: Domain*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Domain]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
