package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libPluginConfigMod.ForkTsCheckerWebpackPluginConfig
import typings.forkTsCheckerWebpackPlugin.libPluginStateMod.ForkTsCheckerWebpackPluginState
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksTapDoneToAsyncGetIssuesMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-done-to-async-get-issues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapDoneToAsyncGetIssues(
    compiler: Compiler,
    config: ForkTsCheckerWebpackPluginConfig,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapDoneToAsyncGetIssues")(compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
