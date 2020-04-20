package typings.googleCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/tasks.@google-cloud/tasks.CreateNamedRequest<'queue', std.Partial<@google-cloud/tasks.@google-cloud/tasks.Queue>> */
trait CreateNamedRequestqueuePa extends js.Object {
  /**
    * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
    */
  var parent: String
  var queue: PartialQueue
}

object CreateNamedRequestqueuePa {
  @scala.inline
  def apply(parent: String, queue: PartialQueue): CreateNamedRequestqueuePa = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamedRequestqueuePa]
  }
}

