package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAlt
import typings.gapiClientCalendar.AnonCalendarId
import typings.gapiClientCalendar.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns an access control rule. */
  def get(request: AnonAlt): Request_[AclRule]
  /** Creates an access control rule. */
  def insert(request: AnonCalendarId): Request_[AclRule]
  /** Returns the rules in the access control list for the calendar. */
  def list(request: AnonFields): Request_[Acl]
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[AclRule]
  /** Updates an access control rule. */
  def update(request: AnonAlt): Request_[AclRule]
  /** Watch for changes to ACL resources. */
  def watch(request: AnonFields): Request_[Channel]
}

object AclResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[AclRule],
    insert: AnonCalendarId => Request_[AclRule],
    list: AnonFields => Request_[Acl],
    patch: AnonAlt => Request_[AclRule],
    update: AnonAlt => Request_[AclRule],
    watch: AnonFields => Request_[Channel]
  ): AclResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[AclResource]
  }
}

