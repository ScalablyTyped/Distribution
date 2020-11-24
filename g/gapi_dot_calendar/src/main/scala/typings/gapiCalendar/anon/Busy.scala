package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Busy extends js.Object {
  
  var busy: js.Array[End] = js.native
  
  var errors: js.UndefOr[js.Array[Domain]] = js.native
}
object Busy {
  
  @scala.inline
  def apply(busy: js.Array[End]): Busy = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Busy]
  }
  
  @scala.inline
  implicit class BusyOps[Self <: Busy] (val x: Self) extends AnyVal {
    
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
    def setBusyVarargs(value: End*): Self = this.set("busy", js.Array(value :_*))
    
    @scala.inline
    def setBusy(value: js.Array[End]): Self = this.set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Domain*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Domain]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
