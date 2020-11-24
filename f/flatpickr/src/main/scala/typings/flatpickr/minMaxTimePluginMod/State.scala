package typings.flatpickr.minMaxTimePluginMod

import typings.flatpickr.globalsMod.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var defaults: MinMaxTime = js.native
  
  def formatDate(date: Date, f: String): String = js.native
  
  var tableDateFormat: String = js.native
}
object State {
  
  @scala.inline
  def apply(defaults: MinMaxTime, formatDate: (Date, String) => String, tableDateFormat: String): State = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], formatDate = js.Any.fromFunction2(formatDate), tableDateFormat = tableDateFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: MinMaxTime): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDate(value: (Date, String) => String): Self = this.set("formatDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTableDateFormat(value: String): Self = this.set("tableDateFormat", value.asInstanceOf[js.Any])
  }
}
