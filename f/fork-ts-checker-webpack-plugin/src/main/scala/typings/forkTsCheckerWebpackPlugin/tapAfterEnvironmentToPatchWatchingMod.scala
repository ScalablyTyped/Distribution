package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.pluginStateMod.ForkTsCheckerWebpackPluginState
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapAfterEnvironmentToPatchWatchingMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-after-environment-to-patch-watching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapAfterEnvironmentToPatchWatching(compiler: Compiler, state: ForkTsCheckerWebpackPluginState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapAfterEnvironmentToPatchWatching")(compiler.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
