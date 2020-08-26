package typings.firebaseMessaging.appConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppConfig extends js.Object {
  val apiKey: String = js.native
  val appId: String = js.native
  val appName: String = js.native
  val projectId: String = js.native
  /** Only used for old DB migration. */
  val senderId: String = js.native
}

object AppConfig {
  @scala.inline
  def apply(apiKey: String, appId: String, appName: String, projectId: String, senderId: String): AppConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], senderId = senderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfig]
  }
  @scala.inline
  implicit class AppConfigOps[Self <: AppConfig] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSenderId(value: String): Self = this.set("senderId", value.asInstanceOf[js.Any])
  }
  
}

