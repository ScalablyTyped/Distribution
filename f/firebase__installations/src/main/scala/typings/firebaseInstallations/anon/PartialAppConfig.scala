package typings.firebaseInstallations.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@firebase/installations.@firebase/installations/dist/src/interfaces/app-config.AppConfig> */
trait PartialAppConfig extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var appId: js.UndefOr[String] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
}

object PartialAppConfig {
  @scala.inline
  def apply(apiKey: String = null, appId: String = null, appName: String = null, projectId: String = null): PartialAppConfig = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAppConfig]
  }
}

