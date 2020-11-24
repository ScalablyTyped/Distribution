package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcProcedure", JSImport.Namespace)
@js.native
object reporterRpcProcedureMod extends js.Object {
  
  val closeReport: RpcProcedure[Unit, Unit] = js.native
  
  val configure: RpcProcedure[js.Object, Unit] = js.native
  
  val getDependencies: RpcProcedure[Unit, Dependencies] = js.native
  
  val getIssues: RpcProcedure[Unit, js.Array[Issue]] = js.native
  
  val getReport: RpcProcedure[FilesChange, Unit] = js.native
}
