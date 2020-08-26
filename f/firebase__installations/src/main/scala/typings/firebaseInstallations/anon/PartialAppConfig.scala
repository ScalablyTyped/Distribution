package typings.firebaseInstallations.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@firebase/installations.@firebase/installations/dist/src/interfaces/app-config.AppConfig> */
@js.native
trait PartialAppConfig extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var appId: js.UndefOr[String] = js.native
  var appName: js.UndefOr[String] = js.native
  var projectId: js.UndefOr[String] = js.native
}

object PartialAppConfig {
  @scala.inline
  def apply(): PartialAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAppConfig]
  }
  @scala.inline
  implicit class PartialAppConfigOps[Self <: PartialAppConfig] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

