package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libPluginConfigMod.ForkTsCheckerWebpackPluginConfig
import typings.forkTsCheckerWebpackPlugin.libPluginStateMod.ForkTsCheckerWebpackPluginState
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksTapAfterCompileToGetIssuesMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-after-compile-to-get-issues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapAfterCompileToGetIssues(
    compiler: Compiler,
    config: ForkTsCheckerWebpackPluginConfig,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapAfterCompileToGetIssues")(compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
