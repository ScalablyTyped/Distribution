package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A web application entry point.
  */
@js.native
trait Schema$GoogleAppsScriptTypeWebAppEntryPoint extends js.Object {
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[Schema$GoogleAppsScriptTypeWebAppConfig] = js.native
  /**
    * The URL for the web application.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$GoogleAppsScriptTypeWebAppEntryPoint {
  @scala.inline
  def apply(entryPointConfig: Schema$GoogleAppsScriptTypeWebAppConfig = null, url: String = null): Schema$GoogleAppsScriptTypeWebAppEntryPoint = {
    val __obj = js.Dynamic.literal()
    if (entryPointConfig != null) __obj.updateDynamic("entryPointConfig")(entryPointConfig.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleAppsScriptTypeWebAppEntryPoint]
  }
}

