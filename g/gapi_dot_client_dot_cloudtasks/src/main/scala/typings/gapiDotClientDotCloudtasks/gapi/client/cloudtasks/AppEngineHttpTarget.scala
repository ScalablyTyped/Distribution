package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineHttpTarget extends js.Object {
  /**
    * Overrides for the
    * task-level app_engine_routing.
    *
    * If set, AppEngineHttpTarget.app_engine_routing_override is used for
    * all tasks in the queue, no matter what the setting is for the
    * task-level app_engine_routing.
    */
  var appEngineRoutingOverride: js.UndefOr[AppEngineRouting] = js.undefined
}

object AppEngineHttpTarget {
  @scala.inline
  def apply(appEngineRoutingOverride: AppEngineRouting = null): AppEngineHttpTarget = {
    val __obj = js.Dynamic.literal()
    if (appEngineRoutingOverride != null) __obj.updateDynamic("appEngineRoutingOverride")(appEngineRoutingOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineHttpTarget]
  }
}

