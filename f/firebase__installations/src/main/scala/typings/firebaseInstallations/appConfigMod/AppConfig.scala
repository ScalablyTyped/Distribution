package typings.firebaseInstallations.appConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppConfig extends js.Object {
  val apiKey: String
  val appId: String
  val appName: String
  val projectId: String
}

object AppConfig {
  @scala.inline
  def apply(apiKey: String, appId: String, appName: String, projectId: String): AppConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppConfig]
  }
}

