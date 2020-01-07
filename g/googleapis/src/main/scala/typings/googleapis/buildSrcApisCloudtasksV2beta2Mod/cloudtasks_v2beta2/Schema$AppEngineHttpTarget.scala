package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App Engine HTTP target.  The task will be delivered to the App Engine
  * application hostname specified by its AppEngineHttpTarget and
  * AppEngineHttpRequest. The documentation for AppEngineHttpRequest explains
  * how the task&#39;s host URL is constructed.  Using AppEngineHttpTarget
  * requires
  * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
  * Google IAM permission for the project and the following scope:
  * `https://www.googleapis.com/auth/cloud-platform`
  */
@js.native
trait Schema$AppEngineHttpTarget extends js.Object {
  /**
    * Overrides for the task-level app_engine_routing.  If set,
    * `app_engine_routing_override` is used for all tasks in the queue, no
    * matter what the setting is for the task-level app_engine_routing.
    */
  var appEngineRoutingOverride: js.UndefOr[Schema$AppEngineRouting] = js.native
}

object Schema$AppEngineHttpTarget {
  @scala.inline
  def apply(appEngineRoutingOverride: Schema$AppEngineRouting = null): Schema$AppEngineHttpTarget = {
    val __obj = js.Dynamic.literal()
    if (appEngineRoutingOverride != null) __obj.updateDynamic("appEngineRoutingOverride")(appEngineRoutingOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppEngineHttpTarget]
  }
}

