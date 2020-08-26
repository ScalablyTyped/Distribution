package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouderrorreporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var events: EventsResource = js.native
  var groupStats: GroupStatsResource = js.native
  var groups: GroupsResource = js.native
  /** Deletes all error events of a given project. */
  def deleteEvents(request: Alt): Request[js.Object] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    deleteEvents: Alt => Request[js.Object],
    events: EventsResource,
    groupStats: GroupStatsResource,
    groups: GroupsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(deleteEvents = js.Any.fromFunction1(deleteEvents), events = events.asInstanceOf[js.Any], groupStats = groupStats.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleteEvents(value: Alt => Request[js.Object]): Self = this.set("deleteEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setEvents(value: EventsResource): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupStats(value: GroupStatsResource): Self = this.set("groupStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroups(value: GroupsResource): Self = this.set("groups", value.asInstanceOf[js.Any])
  }
  
}

