package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libPluginConfigMod.ForkTsCheckerWebpackPluginConfig
import typings.forkTsCheckerWebpackPlugin.libPluginStateMod.ForkTsCheckerWebpackPluginState
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksTapAfterCompileToAddDependenciesMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-after-compile-to-add-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapAfterCompileToAddDependencies(
    compiler: Compiler,
    config: ForkTsCheckerWebpackPluginConfig,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapAfterCompileToAddDependencies")(compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
