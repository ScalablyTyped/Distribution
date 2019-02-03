package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acl extends js.Object {
  var etag: etag
  var id: java.lang.String
  var kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#aclRule`
  var role: AccessRole
  var scope: gapiDotCalendarLib.Anon_Type
}

@JSGlobal("gapi.client.calendar.acl")
@js.native
class acl () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.acl")
@js.native
object acl extends js.Object {
  def delete(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AclDeleteParameters): gapiLib.gapiNs.clientNs.HttpRequest[scala.Unit] = js.native
  def get(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AclGetParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Acl] = js.native
  def insert(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AclInsertParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Acl] = js.native
  def update(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AclUpdateParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Acl] = js.native
}

