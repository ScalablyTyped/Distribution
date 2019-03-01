package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentRequest extends js.Object {
  /**
    * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
    */
  var parent: java.lang.String
}

object ParentRequest {
  @scala.inline
  def apply(parent: java.lang.String): ParentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ParentRequest]
  }
}

