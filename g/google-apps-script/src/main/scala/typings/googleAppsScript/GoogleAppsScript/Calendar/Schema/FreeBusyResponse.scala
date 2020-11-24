package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusyResponse extends js.Object {
  
  var calendars: js.UndefOr[js.Object] = js.native
  
  var groups: js.UndefOr[js.Object] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var timeMax: js.UndefOr[String] = js.native
  
  var timeMin: js.UndefOr[String] = js.native
}
object FreeBusyResponse {
  
  @scala.inline
  def apply(): FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyResponse]
  }
  
  @scala.inline
  implicit class FreeBusyResponseOps[Self <: FreeBusyResponse] (val x: Self) extends AnyVal {
    
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
    def setCalendars(value: js.Object): Self = this.set("calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Object): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setTimeMax(value: String): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMax: Self = this.set("timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: String): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMin: Self = this.set("timeMin", js.undefined)
  }
}
