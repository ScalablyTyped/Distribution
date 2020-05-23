package typings.googleCloudTasks.anon

import typings.googleCloudTasks.mod.AppEngineHttpQueue
import typings.googleCloudTasks.mod.RateLimits
import typings.googleCloudTasks.mod.RetryConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Queue> */
trait PartialQueue extends js.Object {
  var appEngineHttpQueue: js.UndefOr[AppEngineHttpQueue] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var purgeTime: js.UndefOr[String] = js.undefined
  var rateLimits: js.UndefOr[RateLimits] = js.undefined
  var retryConfig: js.UndefOr[RetryConfig] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object PartialQueue {
  @scala.inline
  def apply(
    appEngineHttpQueue: AppEngineHttpQueue = null,
    name: String = null,
    purgeTime: String = null,
    rateLimits: RateLimits = null,
    retryConfig: RetryConfig = null,
    state: String = null
  ): PartialQueue = {
    val __obj = js.Dynamic.literal()
    if (appEngineHttpQueue != null) __obj.updateDynamic("appEngineHttpQueue")(appEngineHttpQueue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (purgeTime != null) __obj.updateDynamic("purgeTime")(purgeTime.asInstanceOf[js.Any])
    if (rateLimits != null) __obj.updateDynamic("rateLimits")(rateLimits.asInstanceOf[js.Any])
    if (retryConfig != null) __obj.updateDynamic("retryConfig")(retryConfig.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialQueue]
  }
}

