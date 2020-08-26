package typings.forkTsCheckerWebpackPlugin.rpcClientMod

import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RpcClient extends js.Object {
  def connect(): js.Promise[Unit] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def dispatchCall[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, payload: RpcProcedurePayload[TProcedure]): js.Promise[RpcProcedureResult[TProcedure]] = js.native
  def isConnected(): Boolean = js.native
}

object RpcClient {
  @scala.inline
  def apply(
    connect: () => js.Promise[Unit],
    disconnect: () => js.Promise[Unit],
    dispatchCall: (js.Any, RpcProcedurePayload[js.Any]) => js.Promise[RpcProcedureResult[js.Any]],
    isConnected: () => Boolean
  ): RpcClient = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), dispatchCall = js.Any.fromFunction2(dispatchCall), isConnected = js.Any.fromFunction0(isConnected))
    __obj.asInstanceOf[RpcClient]
  }
  @scala.inline
  implicit class RpcClientOps[Self <: RpcClient] (val x: Self) extends AnyVal {
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
    def setDispatchCall(value: (js.Any, RpcProcedurePayload[js.Any]) => js.Promise[RpcProcedureResult[js.Any]]): Self = this.set("dispatchCall", js.Any.fromFunction2(value))
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = this.set("isConnected", js.Any.fromFunction0(value))
  }
  
}

