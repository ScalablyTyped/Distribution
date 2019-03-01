package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRequest extends js.Object {
  /**
    * The resource for which the policy is being requested. resource is usually specified as a path. For example, a Project resource is specified as projects/{project}.
    */
  var resource: java.lang.String
}

object ResourceRequest {
  @scala.inline
  def apply(resource: java.lang.String): ResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ResourceRequest]
  }
}

