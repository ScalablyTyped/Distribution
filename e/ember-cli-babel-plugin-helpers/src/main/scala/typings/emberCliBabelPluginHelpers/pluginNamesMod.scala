package typings.emberCliBabelPluginHelpers

import typings.emberCliBabelPluginHelpers.mod.BabelPluginConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginNamesMod {
  
  @JSImport("ember-cli-babel-plugin-helpers/lib/-private/plugin-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def normalizePluginName(rawName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePluginName")(rawName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def resolvePluginName(pluginConfig: BabelPluginConfig): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePluginName")(pluginConfig.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
}
