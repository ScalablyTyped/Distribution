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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appEngineHttpQueue")(appEngineHttpQueue)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("purgeTime")(purgeTime)
    __obj.updateDynamic("rateLimits")(rateLimits)
    __obj.updateDynamic("retryConfig")(retryConfig)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Queue]
  }
}

