package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotCalendar.Anon_Type
import typings.gapiDotCalendar.gapiDotCalendarStrings.`calendar#aclRule`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acl extends js.Object {
  var etag: typings.gapiDotCalendar.gapi.client.calendar.etag
  var id: String
  var kind: `calendar#aclRule`
  var role: AccessRole
  var scope: Anon_Type
}

object Acl {
  @scala.inline
  def apply(etag: etag, id: String, kind: `calendar#aclRule`, role: AccessRole, scope: Anon_Type): Acl = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Acl]
  }
}

@JSGlobal("gapi.client.calendar.acl")
@js.native
class acl () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.acl")
@js.native
object acl extends js.Object {
  def delete(parameters: AclDeleteParameters): HttpRequest[Unit] = js.native
  def get(parameters: AclGetParameters): HttpRequest[Acl] = js.native
  def insert(parameters: AclInsertParameters): HttpRequest[Acl] = js.native
  def update(parameters: AclUpdateParameters): HttpRequest[Acl] = js.native
}

