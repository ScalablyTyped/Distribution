package typings.googleCloudTasks.anon

import typings.googleCloudTasks.mod.AppEngineHttpRequest
import typings.googleCloudTasks.mod.Attempt
import typings.googleCloudTasks.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Task> */
trait PartialTask extends js.Object {
  var appEngineHttpRequest: js.UndefOr[AppEngineHttpRequest] = js.undefined
  var createTime: js.UndefOr[String] = js.undefined
  var dispatchCount: js.UndefOr[Double] = js.undefined
  var firstAttempt: js.UndefOr[Attempt] = js.undefined
  var lastAttempt: js.UndefOr[Attempt] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var responseCount: js.UndefOr[Double] = js.undefined
  var scheduleTime: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[View] = js.undefined
}

object PartialTask {
  @scala.inline
  def apply(
    appEngineHttpRequest: AppEngineHttpRequest = null,
    createTime: String = null,
    dispatchCount: js.UndefOr[Double] = js.undefined,
    firstAttempt: Attempt = null,
    lastAttempt: Attempt = null,
    name: String = null,
    responseCount: js.UndefOr[Double] = js.undefined,
    scheduleTime: String = null,
    view: View = null
  ): PartialTask = {
    val __obj = js.Dynamic.literal()
    if (appEngineHttpRequest != null) __obj.updateDynamic("appEngineHttpRequest")(appEngineHttpRequest.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (!js.isUndefined(dispatchCount)) __obj.updateDynamic("dispatchCount")(dispatchCount.get.asInstanceOf[js.Any])
    if (firstAttempt != null) __obj.updateDynamic("firstAttempt")(firstAttempt.asInstanceOf[js.Any])
    if (lastAttempt != null) __obj.updateDynamic("lastAttempt")(lastAttempt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(responseCount)) __obj.updateDynamic("responseCount")(responseCount.get.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTask]
  }
}

