package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_ActivityId): gapiDotClientLib.gapiNs.clientNs.Request[Activity]
  /** Create a new activity for the authenticated user. */
  def insert(request: gapiDotClientDotPlusdomainsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_AltCollection): gapiDotClientLib.gapiNs.clientNs.Request[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_ActivityId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Activity]
    ],
    insert: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Activity]
    ],
    list: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCollection, 
      gapiDotClientLib.gapiNs.clientNs.Request[ActivityFeed]
    ]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ActivitiesResource]
  }
}

