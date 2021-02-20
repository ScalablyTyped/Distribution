package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import typings.forkTsCheckerWebpackPlugin.reporterRpcServiceMod.ReporterRpcService
import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod {
  
  /**
    * Computes aggregated files change based on the subsequent files changes.
    *
    * @param changes List of subsequent files changes
    * @returns Files change that represents all subsequent changes as a one event
    */
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter", "aggregateFilesChanges")
  @js.native
  def aggregateFilesChanges(changes: js.Array[FilesChange]): FilesChange = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter", "composeReporterRpcClients")
  @js.native
  def composeReporterRpcClients(clients: js.Array[ReporterRpcClient]): ReporterRpcClient = js.native
  
  /**
    * This higher order reporter aggregates too frequent getReport requests to avoid unnecessary computation.
    */
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter", "createAggregatedReporter")
  @js.native
  def createAggregatedReporter[TReporter /* <: Reporter */](reporter: TReporter): TReporter = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter", "createReporterRpcClient")
  @js.native
  def createReporterRpcClient[TConfiguration /* <: js.Object */](channel: RpcMessageChannel, configuration: TConfiguration): ReporterRpcClient = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter", "registerReporterRpcService")
  @js.native
  def registerReporterRpcService[TConfiguration /* <: js.Object */](
    servicePort: RpcMessagePort,
    reporterFactory: js.Function1[/* configuration */ TConfiguration, Reporter]
  ): ReporterRpcService = js.native
}
