package typings.expoConfigPlugins.mod

import typings.expoConfigPlugins.errorsMod.PluginErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/config-plugins/build", "PluginError")
@js.native
open class PluginError protected ()
  extends typings.expoConfigPlugins.errorsMod.PluginError {
  def this(message: String, code: PluginErrorCode) = this()
  def this(message: String, code: PluginErrorCode, cause: js.Error) = this()
}
