package typings.emberCliBabelPluginHelpers

import typings.emberCliBabelPluginHelpers.mod.BabelPluginConfig
import typings.emberCliBabelPluginHelpers.mod.ConfigurationTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginConfigurationMod {
  
  @JSImport("ember-cli-babel-plugin-helpers/lib/-private/plugin-configuration", "findPluginIndex")
  @js.native
  def findPluginIndex(plugins: js.Array[BabelPluginConfig], plugin: String): Double = js.native
  
  @JSImport("ember-cli-babel-plugin-helpers/lib/-private/plugin-configuration", "getPluginsArray")
  @js.native
  def getPluginsArray(target: js.Array[BabelPluginConfig]): js.Array[BabelPluginConfig] = js.native
  @JSImport("ember-cli-babel-plugin-helpers/lib/-private/plugin-configuration", "getPluginsArray")
  @js.native
  def getPluginsArray(target: ConfigurationTarget): js.Array[BabelPluginConfig] = js.native
}
