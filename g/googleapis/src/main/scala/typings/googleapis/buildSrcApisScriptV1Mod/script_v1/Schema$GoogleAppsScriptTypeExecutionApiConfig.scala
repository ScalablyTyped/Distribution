package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API executable entry point configuration.
  */
@js.native
trait Schema$GoogleAppsScriptTypeExecutionApiConfig extends js.Object {
  /**
    * Who has permission to run the API executable.
    */
  var access: js.UndefOr[String] = js.native
}

object Schema$GoogleAppsScriptTypeExecutionApiConfig {
  @scala.inline
  def apply(access: String = null): Schema$GoogleAppsScriptTypeExecutionApiConfig = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleAppsScriptTypeExecutionApiConfig]
  }
}

