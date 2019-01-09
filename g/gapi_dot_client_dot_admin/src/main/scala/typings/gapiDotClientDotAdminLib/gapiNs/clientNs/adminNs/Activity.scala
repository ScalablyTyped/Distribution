package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** User doing the action. */
  var actor: js.UndefOr[gapiDotClientDotAdminLib.Anon_CallerType] = js.undefined
  /** ETag of the entry. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Activity events. */
  var events: js.UndefOr[js.Array[gapiDotClientDotAdminLib.Anon_Name]] = js.undefined
  /** Unique identifier for each activity record. */
  var id: js.UndefOr[gapiDotClientDotAdminLib.Anon_ApplicationName] = js.undefined
  /** IP Address of the user doing the action. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Domain of source customer. */
  var ownerDomain: js.UndefOr[java.lang.String] = js.undefined
}

