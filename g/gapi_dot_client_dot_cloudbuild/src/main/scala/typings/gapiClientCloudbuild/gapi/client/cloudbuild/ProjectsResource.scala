package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var builds: BuildsResource = js.native
  var triggers: TriggersResource = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(builds: BuildsResource, triggers: TriggersResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(builds = builds.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
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
    def setBuilds(value: BuildsResource): Self = this.set("builds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggers(value: TriggersResource): Self = this.set("triggers", value.asInstanceOf[js.Any])
  }
  
}

