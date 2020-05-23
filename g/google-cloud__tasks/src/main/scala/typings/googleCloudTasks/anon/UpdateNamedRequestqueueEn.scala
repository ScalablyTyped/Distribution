package typings.googleCloudTasks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/tasks.@google-cloud/tasks.UpdateNamedRequest<'queue', @google-cloud/tasks.@google-cloud/tasks.EnhancedPick<@google-cloud/tasks.@google-cloud/tasks.Queue, 'name', 'appEngineHttpQueue' | 'rateLimits' | 'retryConfig'>> */
trait UpdateNamedRequestqueueEn extends js.Object {
  /**
    * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
    */
  var parent: String
  var queue: EnhancedPickQueuenameappE
}

object UpdateNamedRequestqueueEn {
  @scala.inline
  def apply(parent: String, queue: EnhancedPickQueuenameappE): UpdateNamedRequestqueueEn = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNamedRequestqueueEn]
  }
}

