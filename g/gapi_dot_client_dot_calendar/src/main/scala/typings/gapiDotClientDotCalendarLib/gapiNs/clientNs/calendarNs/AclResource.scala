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

