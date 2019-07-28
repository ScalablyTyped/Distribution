package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRequest extends js.Object {
  /**
    * The resource name of the queue. For example: projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID
    */
  var name: String
}

object NamedRequest {
  @scala.inline
  def apply(name: String): NamedRequest = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[NamedRequest]
  }
}

