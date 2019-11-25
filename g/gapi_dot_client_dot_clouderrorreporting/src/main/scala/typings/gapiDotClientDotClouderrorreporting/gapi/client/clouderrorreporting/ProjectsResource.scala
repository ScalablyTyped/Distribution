package typings.gapiDotClientDotClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotClouderrorreporting.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var events: EventsResource
  var groupStats: GroupStatsResource
  var groups: GroupsResource
  /** Deletes all error events of a given project. */
  def deleteEvents(request: Anon_AccesstokenAlt): Request[js.Object]
}

object ProjectsResource {
  @scala.inline
  def apply(
    deleteEvents: Anon_AccesstokenAlt => Request[js.Object],
    events: EventsResource,
    groupStats: GroupStatsResource,
    groups: GroupsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(deleteEvents = js.Any.fromFunction1(deleteEvents), events = events.asInstanceOf[js.Any], groupStats = groupStats.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

