package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An API executable entry point.
  */
@js.native
trait Schema$GoogleAppsScriptTypeExecutionApiEntryPoint extends js.Object {
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[Schema$GoogleAppsScriptTypeExecutionApiConfig] = js.native
}

object Schema$GoogleAppsScriptTypeExecutionApiEntryPoint {
  @scala.inline
  def apply(entryPointConfig: Schema$GoogleAppsScriptTypeExecutionApiConfig = null): Schema$GoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    if (entryPointConfig != null) __obj.updateDynamic("entryPointConfig")(entryPointConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleAppsScriptTypeExecutionApiEntryPoint]
  }
}

