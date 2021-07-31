package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import typings.forkTsCheckerWebpackPlugin.reporterRpcServiceMod.ReporterRpcService
import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes aggregated files change based on the subsequent files changes.
    *
    * @param changes List of subsequent files changes
    * @returns Files change that represents all subsequent changes as a one event
    */
  @scala.inline
  def aggregateFilesChanges(changes: js.Array[FilesChange]): FilesChange = ^.asInstanceOf[js.Dynamic].applyDynamic("aggregateFilesChanges")(changes.asInstanceOf[js.Any]).asInstanceOf[FilesChange]
  
  @scala.inline
  def composeReporterRpcClients(clients: js.Array[ReporterRpcClient]): ReporterRpcClient = ^.asInstanceOf[js.Dynamic].applyDynamic("composeReporterRpcClients")(clients.asInstanceOf[js.Any]).asInstanceOf[ReporterRpcClient]
  
  /**
    * This higher order reporter aggregates too frequent getReport requests to avoid unnecessary computation.
    */
  @scala.inline
  def createAggregatedReporter[TReporter /* <: Reporter */](reporter: TReporter): TReporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createAggregatedReporter")(reporter.asInstanceOf[js.Any]).asInstanceOf[TReporter]
  
  @scala.inline
  def createReporterRpcClient[TConfiguration /* <: js.Object */](channel: RpcMessageChannel, configuration: TConfiguration): ReporterRpcClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createReporterRpcClient")(channel.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[ReporterRpcClient]
  
  @scala.inline
  def registerReporterRpcService[TConfiguration /* <: js.Object */](
    servicePort: RpcMessagePort,
    reporterFactory: js.Function1[/* configuration */ TConfiguration, Reporter]
  ): ReporterRpcService = (^.asInstanceOf[js.Dynamic].applyDynamic("registerReporterRpcService")(servicePort.asInstanceOf[js.Any], reporterFactory.asInstanceOf[js.Any])).asInstanceOf[ReporterRpcService]
}
