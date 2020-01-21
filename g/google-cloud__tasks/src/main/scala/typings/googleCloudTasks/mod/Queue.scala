package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  var appEngineHttpQueue: AppEngineHttpQueue
  var name: String
  var purgeTime: String
  var rateLimits: RateLimits
  var retryConfig: RetryConfig
  var state: String
}

object Queue {
  @scala.inline
  def apply(
    appEngineHttpQueue: AppEngineHttpQueue,
    name: String,
    purgeTime: String,
    rateLimits: RateLimits,
    retryConfig: RetryConfig,
    state: String
  ): Queue = {
    val __obj = js.Dynamic.literal(appEngineHttpQueue = appEngineHttpQueue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], purgeTime = purgeTime.asInstanceOf[js.Any], rateLimits = rateLimits.asInstanceOf[js.Any], retryConfig = retryConfig.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Queue]
  }
}

