package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentRequest extends js.Object {
  /**
    * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
    */
  var parent: String
}

object ParentRequest {
  @scala.inline
  def apply(parent: String): ParentRequest = {
    val __obj = js.Dynamic.literal(parent = parent)
  
    __obj.asInstanceOf[ParentRequest]
  }
}

