package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration that defines how a deployment is accessed externally.
  */
@js.native
trait Schema$EntryPoint extends js.Object {
  /**
    * Add-on properties.
    */
  var addOn: js.UndefOr[Schema$GoogleAppsScriptTypeAddOnEntryPoint] = js.native
  /**
    * The type of the entry point.
    */
  var entryPointType: js.UndefOr[String] = js.native
  /**
    * An entry point specification for Apps Script API execution calls.
    */
  var executionApi: js.UndefOr[Schema$GoogleAppsScriptTypeExecutionApiEntryPoint] = js.native
  /**
    * An entry point specification for web apps.
    */
  var webApp: js.UndefOr[Schema$GoogleAppsScriptTypeWebAppEntryPoint] = js.native
}

object Schema$EntryPoint {
  @scala.inline
  def apply(
    addOn: Schema$GoogleAppsScriptTypeAddOnEntryPoint = null,
    entryPointType: String = null,
    executionApi: Schema$GoogleAppsScriptTypeExecutionApiEntryPoint = null,
    webApp: Schema$GoogleAppsScriptTypeWebAppEntryPoint = null
  ): Schema$EntryPoint = {
    val __obj = js.Dynamic.literal()
    if (addOn != null) __obj.updateDynamic("addOn")(addOn.asInstanceOf[js.Any])
    if (entryPointType != null) __obj.updateDynamic("entryPointType")(entryPointType.asInstanceOf[js.Any])
    if (executionApi != null) __obj.updateDynamic("executionApi")(executionApi.asInstanceOf[js.Any])
    if (webApp != null) __obj.updateDynamic("webApp")(webApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EntryPoint]
  }
}

