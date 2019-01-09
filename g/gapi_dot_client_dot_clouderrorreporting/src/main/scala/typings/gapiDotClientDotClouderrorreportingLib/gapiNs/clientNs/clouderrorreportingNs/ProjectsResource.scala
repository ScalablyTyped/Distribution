package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var events: EventsResource
  var groupStats: GroupStatsResource
  var groups: GroupsResource
  /** Deletes all error events of a given project. */
  def deleteEvents(request: gapiDotClientDotClouderrorreportingLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

