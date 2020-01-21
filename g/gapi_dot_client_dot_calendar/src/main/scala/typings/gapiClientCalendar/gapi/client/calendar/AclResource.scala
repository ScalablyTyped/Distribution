package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAlt
import typings.gapiClientCalendar.AnonAltCalendarId
import typings.gapiClientCalendar.AnonAltCalendarIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns an access control rule. */
  def get(request: AnonAlt): Request_[AclRule]
  /** Creates an access control rule. */
  def insert(request: AnonAltCalendarId): Request_[AclRule]
  /** Returns the rules in the access control list for the calendar. */
  def list(request: AnonAltCalendarIdFields): Request_[Acl]
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[AclRule]
  /** Updates an access control rule. */
  def update(request: AnonAlt): Request_[AclRule]
  /** Watch for changes to ACL resources. */
  def watch(request: AnonAltCalendarIdFields): Request_[Channel]
}

object AclResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[AclRule],
    insert: AnonAltCalendarId => Request_[AclRule],
    list: AnonAltCalendarIdFields => Request_[Acl],
    patch: AnonAlt => Request_[AclRule],
    update: AnonAlt => Request_[AclRule],
    watch: AnonAltCalendarIdFields => Request_[Channel]
  ): AclResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[AclResource]
  }
}

