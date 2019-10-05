package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineQueueConfig extends js.Object {
  /** Deprecated. Use AppEngineTarget.app_engine_routing_override. */
  var appEngineRoutingOverride: js.UndefOr[AppEngineRouting] = js.undefined
}

object AppEngineQueueConfig {
  @scala.inline
  def apply(appEngineRoutingOverride: AppEngineRouting = null): AppEngineQueueConfig = {
    val __obj = js.Dynamic.literal()
    if (appEngineRoutingOverride != null) __obj.updateDynamic("appEngineRoutingOverride")(appEngineRoutingOverride)
    __obj.asInstanceOf[AppEngineQueueConfig]
  }
}

