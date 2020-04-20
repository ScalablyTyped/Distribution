package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRequest extends js.Object {
  /**
    * The resource for which the policy is being requested. resource is usually specified as a path. For example, a Project resource is specified as projects/{project}.
    */
  var resource: String
}

object ResourceRequest {
  @scala.inline
  def apply(resource: String): ResourceRequest = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequest]
  }
}

