package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Type
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignaclRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl_ extends js.Object {
  var etag: typings.gapiCalendar.gapi.client.calendar.etag = js.native
  var id: String = js.native
  var kind: calendarNumbersignaclRule = js.native
  var role: AccessRole = js.native
  var scope: Type = js.native
}

object Acl_ {
  @scala.inline
  def apply(etag: etag, id: String, kind: calendarNumbersignaclRule, role: AccessRole, scope: Type): Acl_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl_]
  }
  @scala.inline
  implicit class Acl_Ops[Self <: Acl_] (val x: Self) extends AnyVal {
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
    def setEtag(value: etag): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: calendarNumbersignaclRule): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: AccessRole): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Type): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

