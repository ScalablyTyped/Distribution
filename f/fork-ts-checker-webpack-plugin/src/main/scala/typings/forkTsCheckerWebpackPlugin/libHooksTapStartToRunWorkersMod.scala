package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libPluginConfigMod.ForkTsCheckerWebpackPluginConfig
import typings.forkTsCheckerWebpackPlugin.libPluginStateMod.ForkTsCheckerWebpackPluginState
import typings.forkTsCheckerWebpackPlugin.libRpcRpcWorkerMod.RpcWorker
import typings.forkTsCheckerWebpackPlugin.libTypescriptWorkerGetDependenciesWorkerMod.GetDependenciesWorker
import typings.forkTsCheckerWebpackPlugin.libTypescriptWorkerGetIssuesWorkerMod.GetIssuesWorker
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksTapStartToRunWorkersMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-start-to-run-workers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapStartToRunWorkers(
    compiler: Compiler,
    getIssuesWorker: RpcWorker[GetIssuesWorker],
    getDependenciesWorker: RpcWorker[GetDependenciesWorker],
    config: ForkTsCheckerWebpackPluginConfig,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapStartToRunWorkers")(compiler.asInstanceOf[js.Any], getIssuesWorker.asInstanceOf[js.Any], getDependenciesWorker.asInstanceOf[js.Any], config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
