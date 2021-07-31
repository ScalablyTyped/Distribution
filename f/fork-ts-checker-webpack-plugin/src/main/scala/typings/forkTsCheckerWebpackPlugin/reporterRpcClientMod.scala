package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterRpcClientMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def composeReporterRpcClients(clients: js.Array[ReporterRpcClient]): ReporterRpcClient = ^.asInstanceOf[js.Dynamic].applyDynamic("composeReporterRpcClients")(clients.asInstanceOf[js.Any]).asInstanceOf[ReporterRpcClient]
  
  @scala.inline
  def createReporterRpcClient[TConfiguration /* <: js.Object */](channel: RpcMessageChannel, configuration: TConfiguration): ReporterRpcClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createReporterRpcClient")(channel.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[ReporterRpcClient]
  
  trait ReporterRpcClient
    extends StObject
       with Reporter {
    
    def connect(): js.Promise[Unit]
    
    def disconnect(): js.Promise[Unit]
    
    def isConnected(): Boolean
  }
  object ReporterRpcClient {
    
    @scala.inline
    def apply(
      connect: () => js.Promise[Unit],
      disconnect: () => js.Promise[Unit],
      getReport: FilesChange => js.Promise[Report],
      isConnected: () => Boolean
    ): ReporterRpcClient = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), getReport = js.Any.fromFunction1(getReport), isConnected = js.Any.fromFunction0(isConnected))
      __obj.asInstanceOf[ReporterRpcClient]
    }
    
    @scala.inline
    implicit class ReporterRpcClientMutableBuilder[Self <: ReporterRpcClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
    }
  }
}
