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

object ActivitiesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotPlusLib.Anon_ActivityId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Activity]
    ],
    list: js.Function1[
      gapiDotClientDotPlusLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ActivityFeed]
    ],
    search: js.Function1[
      gapiDotClientDotPlusLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ActivityFeed]
    ]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = get, list = list, search = search)
  
    __obj.asInstanceOf[ActivitiesResource]
  }
}

