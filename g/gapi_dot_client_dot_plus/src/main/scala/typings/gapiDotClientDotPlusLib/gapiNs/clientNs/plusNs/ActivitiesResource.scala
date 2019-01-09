package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: gapiDotClientDotPlusLib.Anon_ActivityId): gapiDotClientLib.gapiNs.clientNs.Request[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: gapiDotClientDotPlusLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ActivityFeed]
  /** Search public activities. */
  def search(request: gapiDotClientDotPlusLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ActivityFeed]
}

