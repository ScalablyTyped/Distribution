package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.pluginConfigMod.ForkTsCheckerWebpackPluginConfig
import typings.forkTsCheckerWebpackPlugin.pluginStateMod.ForkTsCheckerWebpackPluginState
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptDoneToGetDevServerTapMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/intercept-done-to-get-dev-server-tap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interceptDoneToGetDevServerTap(
    compiler: Compiler,
    config: ForkTsCheckerWebpackPluginConfig,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptDoneToGetDevServerTap")(compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
