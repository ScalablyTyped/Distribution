package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEngineQueueConfig extends js.Object {
  /** Deprecated. Use AppEngineTarget.app_engine_routing_override. */
  var appEngineRoutingOverride: js.UndefOr[AppEngineRouting] = js.native
}

object AppEngineQueueConfig {
  @scala.inline
  def apply(): AppEngineQueueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineQueueConfig]
  }
  @scala.inline
  implicit class AppEngineQueueConfigOps[Self <: AppEngineQueueConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppEngineRoutingOverride(value: AppEngineRouting): Self = this.set("appEngineRoutingOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineRoutingOverride: Self = this.set("appEngineRoutingOverride", js.undefined)
  }
  
}

