package typings.emberCliBabelPluginHelpers

import typings.emberCliBabelPluginHelpers.mod.BabelPluginConfig
import typings.emberCliBabelPluginHelpers.mod.ConfigurationTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-cli-babel-plugin-helpers/lib/-private/plugin-configuration", JSImport.Namespace)
@js.native
object pluginConfigurationMod extends js.Object {
  
  def findPluginIndex(plugins: js.Array[BabelPluginConfig], plugin: String): Double = js.native
  
  def getPluginsArray(target: js.Array[BabelPluginConfig]): js.Array[BabelPluginConfig] = js.native
  def getPluginsArray(target: ConfigurationTarget): js.Array[BabelPluginConfig] = js.native
}
