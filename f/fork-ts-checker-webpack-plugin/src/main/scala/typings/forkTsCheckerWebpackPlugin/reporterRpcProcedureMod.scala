package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterRpcProcedureMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcProcedure", "closeReport")
  @js.native
  val closeReport: RpcProcedure[Unit, Unit] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcProcedure", "configure")
  @js.native
  val configure: RpcProcedure[js.Object, Unit] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcProcedure", "getDependencies")
  @js.native
  val getDependencies: RpcProcedure[Unit, Dependencies] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcProcedure", "getIssues")
  @js.native
  val getIssues: RpcProcedure[Unit, js.Array[Issue]] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcProcedure", "getReport")
  @js.native
  val getReport: RpcProcedure[FilesChange, Unit] = js.native
}
