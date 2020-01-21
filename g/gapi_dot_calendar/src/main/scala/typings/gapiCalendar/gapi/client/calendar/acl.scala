package typings.gapiCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.calendar.acl")
@js.native
class acl () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.acl")
@js.native
object acl extends js.Object {
  def delete(parameters: AclDeleteParameters): HttpRequest[Unit] = js.native
  def get(parameters: AclGetParameters): HttpRequest[Acl_] = js.native
  def insert(parameters: AclInsertParameters): HttpRequest[Acl_] = js.native
  def update(parameters: AclUpdateParameters): HttpRequest[Acl_] = js.native
}

