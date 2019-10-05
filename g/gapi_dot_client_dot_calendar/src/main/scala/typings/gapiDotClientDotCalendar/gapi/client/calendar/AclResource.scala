package typings.gapiDotClientDotCalendar.gapi.client.calendar

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCalendar.Anon_Alt
import typings.gapiDotClientDotCalendar.Anon_AltCalendarId
import typings.gapiDotClientDotCalendar.Anon_AltCalendarIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Returns an access control rule. */
  def get(request: Anon_Alt): Request[AclRule]
  /** Creates an access control rule. */
  def insert(request: Anon_AltCalendarId): Request[AclRule]
  /** Returns the rules in the access control list for the calendar. */
  def list(request: Anon_AltCalendarIdFields): Request[Acl]
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[AclRule]
  /** Updates an access control rule. */
  def update(request: Anon_Alt): Request[AclRule]
  /** Watch for changes to ACL resources. */
  def watch(request: Anon_AltCalendarIdFields): Request[Channel]
}

object AclResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[AclRule],
    insert: Anon_AltCalendarId => Request[AclRule],
    list: Anon_AltCalendarIdFields => Request[Acl],
    patch: Anon_Alt => Request[AclRule],
    update: Anon_Alt => Request[AclRule],
    watch: Anon_AltCalendarIdFields => Request[Channel]
  ): AclResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[AclResource]
  }
}

