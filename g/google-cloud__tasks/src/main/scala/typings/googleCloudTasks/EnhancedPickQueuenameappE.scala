package typings.googleCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/tasks.@google-cloud/tasks.EnhancedPick<@google-cloud/tasks.@google-cloud/tasks.Queue, 'name', 'appEngineHttpQueue' | 'rateLimits' | 'retryConfig'> */
trait EnhancedPickQueuenameappE extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object EnhancedPickQueuenameappE {
  @scala.inline
  def apply(name: String = null): EnhancedPickQueuenameappE = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedPickQueuenameappE]
  }
}

