package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  var appEngineHttpQueue: AppEngineHttpQueue
  var name: java.lang.String
  var purgeTime: java.lang.String
  var rateLimits: RateLimits
  var retryConfig: RetryConfig
  var state: java.lang.String
}

object Queue {
  @scala.inline
  def apply(
    appEngineHttpQueue: AppEngineHttpQueue,
    name: java.lang.String,
    purgeTime: java.lang.String,
    rateLimits: RateLimits,
    retryConfig: RetryConfig,
    state: java.lang.String
  ): Queue = {
    val __obj = js.Dynamic.literal(appEngineHttpQueue = appEngineHttpQueue, name = name, purgeTime = purgeTime, rateLimits = rateLimits, retryConfig = retryConfig, state = state)
  
    __obj.asInstanceOf[Queue]
  }
}

