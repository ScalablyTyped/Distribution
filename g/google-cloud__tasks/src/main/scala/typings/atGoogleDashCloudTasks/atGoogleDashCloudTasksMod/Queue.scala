package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

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
    val __obj = js.Dynamic.literal(appEngineHttpQueue = appEngineHttpQueue, name = name, purgeTime = purgeTime, rateLimits = rateLimits, retryConfig = retryConfig, state = state)
  
    __obj.asInstanceOf[Queue]
  }
}

