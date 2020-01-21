package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var builds: BuildsResource
  var triggers: TriggersResource
}

object ProjectsResource {
  @scala.inline
  def apply(builds: BuildsResource, triggers: TriggersResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(builds = builds.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

