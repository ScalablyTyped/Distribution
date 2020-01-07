package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configurations template for the app, saved from the managed
  * configurations iframe.
  */
@js.native
trait Schema$ManagedConfigurationTemplate extends js.Object {
  /**
    * Optional, a map containing &lt;key, value&gt; configuration variables
    * defined for the configuration.
    */
  var configurationVariables: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The ID of the managed configurations template.
    */
  var templateId: js.UndefOr[String] = js.native
}

object Schema$ManagedConfigurationTemplate {
  @scala.inline
  def apply(configurationVariables: StringDictionary[String] = null, templateId: String = null): Schema$ManagedConfigurationTemplate = {
    val __obj = js.Dynamic.literal()
    if (configurationVariables != null) __obj.updateDynamic("configurationVariables")(configurationVariables.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedConfigurationTemplate]
  }
}

