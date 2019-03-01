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
    delete: js.Function1[
      gapiDotClientDotCalendarLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotCalendarLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
    ],
    insert: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
    ],
    list: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Acl]
    ],
    patch: js.Function1[
      gapiDotClientDotCalendarLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
    ],
    update: js.Function1[
      gapiDotClientDotCalendarLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AclRule]
    ],
    watch: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltCalendarIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Channel]
    ]
  ): AclResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[AclResource]
  }
}

