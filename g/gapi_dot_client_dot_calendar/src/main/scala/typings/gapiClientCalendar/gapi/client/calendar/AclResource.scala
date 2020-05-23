package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCalendar.anon.Alt
import typings.gapiClientCalendar.anon.CalendarId
import typings.gapiClientCalendar.anon.Fields
import typings.gapiClientCalendar.anon.Key
import typings.gapiClientCalendar.anon.MaxResults
import typings.gapiClientCalendar.anon.Oauthtoken
import typings.gapiClientCalendar.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  /** Returns an access control rule. */
  def get(): Request[AclRule] = js.native
  def get(request: Alt): Request[AclRule] = js.native
  /** Creates an access control rule. */
  def insert(request: CalendarId): Request[AclRule] = js.native
  def insert(request: Fields, body: AclRule): Request[AclRule] = js.native
  /** Returns the rules in the access control list for the calendar. */
  def list(): Request[Acl] = js.native
  def list(request: Key): Request[Acl] = js.native
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[AclRule] = js.native
  def patch(request: PrettyPrint, body: AclRule): Request[AclRule] = js.native
  /** Updates an access control rule. */
  def update(request: Oauthtoken): Request[AclRule] = js.native
  def update(request: PrettyPrint, body: AclRule): Request[AclRule] = js.native
  def watch(request: Key, body: Channel): Request[Channel] = js.native
  /** Watch for changes to ACL resources. */
  def watch(request: MaxResults): Request[Channel] = js.native
}

