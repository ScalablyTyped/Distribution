package typings.gapiDotClientDotCloudbuild.gapiNs.clientNs.cloudbuildNs

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
    val __obj = js.Dynamic.literal(builds = builds, triggers = triggers)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

