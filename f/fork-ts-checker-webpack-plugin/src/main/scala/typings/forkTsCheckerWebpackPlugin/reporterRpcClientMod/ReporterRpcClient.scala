package typings.forkTsCheckerWebpackPlugin.reporterRpcClientMod

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterRpcClient extends Reporter {
  def connect(): js.Promise[Unit] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def isConnected(): Boolean = js.native
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
  implicit class ReporterRpcClientOps[Self <: ReporterRpcClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnect(value: () => js.Promise[Unit]): Self = this.set("connect", js.Any.fromFunction0(value))
    @scala.inline
    def setDisconnect(value: () => js.Promise[Unit]): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = this.set("isConnected", js.Any.fromFunction0(value))
  }
  
}

