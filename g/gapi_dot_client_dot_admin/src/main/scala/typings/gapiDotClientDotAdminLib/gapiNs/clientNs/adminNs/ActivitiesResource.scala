package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActivitiesResource extends js.Object {
  /** Retrieves a list of activities for a specific customer and application. */
  def list(request: gapiDotClientDotAdminLib.Anon_EventName): gapiDotClientLib.gapiNs.clientNs.Request[Activities]
  /** Push changes to activities */
  def watch(request: gapiDotClientDotAdminLib.Anon_EventName): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

