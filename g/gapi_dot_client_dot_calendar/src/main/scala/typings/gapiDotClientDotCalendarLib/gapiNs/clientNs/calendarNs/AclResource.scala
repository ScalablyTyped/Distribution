package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(request: gapiDotClientDotCalendarLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns an access control rule. */
  def get(request: gapiDotClientDotCalendarLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
  /** Creates an access control rule. */
  def insert(request: gapiDotClientDotCalendarLib.Anon_AltCalendarId): gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
  /** Returns the rules in the access control list for the calendar. */
  def list(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Acl]
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: gapiDotClientDotCalendarLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
  /** Updates an access control rule. */
  def update(request: gapiDotClientDotCalendarLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
  /** Watch for changes to ACL resources. */
  def watch(request: gapiDotClientDotCalendarLib.Anon_AltCalendarIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object AclResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotCalendarLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotCalendarLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[AclRule],
    insert: gapiDotClientDotCalendarLib.Anon_AltCalendarId => gapiDotClientLib.gapiNs.clientNs.Request[AclRule],
    list: gapiDotClientDotCalendarLib.Anon_AltCalendarIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Acl],
    patch: gapiDotClientDotCalendarLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[AclRule],
    update: gapiDotClientDotCalendarLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[AclRule],
    watch: gapiDotClientDotCalendarLib.Anon_AltCalendarIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Channel]
  ): AclResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[AclResource]
  }
}

