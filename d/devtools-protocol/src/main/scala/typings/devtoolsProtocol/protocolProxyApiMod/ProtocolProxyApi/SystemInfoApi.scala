package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetInfoResponse
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetProcessInfoResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoApi extends js.Object {
  /**
    * Returns information about the system.
    */
  def getInfo(): js.Promise[GetInfoResponse] = js.native
  /**
    * Returns information about all running processes.
    */
  def getProcessInfo(): js.Promise[GetProcessInfoResponse] = js.native
}

object SystemInfoApi {
  @scala.inline
  def apply(
    getInfo: () => js.Promise[GetInfoResponse],
    getProcessInfo: () => js.Promise[GetProcessInfoResponse]
  ): SystemInfoApi = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), getProcessInfo = js.Any.fromFunction0(getProcessInfo))
    __obj.asInstanceOf[SystemInfoApi]
  }
  @scala.inline
  implicit class SystemInfoApiOps[Self <: SystemInfoApi] (val x: Self) extends AnyVal {
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
    def setGetInfo(value: () => js.Promise[GetInfoResponse]): Self = this.set("getInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProcessInfo(value: () => js.Promise[GetProcessInfoResponse]): Self = this.set("getProcessInfo", js.Any.fromFunction0(value))
  }
  
}

