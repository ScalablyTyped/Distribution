package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetInfoResponse
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetProcessInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoApi extends StObject {
  
  /**
    * Returns information about the system.
    */
  def getInfo(): js.Promise[GetInfoResponse]
  
  /**
    * Returns information about all running processes.
    */
  def getProcessInfo(): js.Promise[GetProcessInfoResponse]
}
object SystemInfoApi {
  
  inline def apply(
    getInfo: () => js.Promise[GetInfoResponse],
    getProcessInfo: () => js.Promise[GetProcessInfoResponse]
  ): SystemInfoApi = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), getProcessInfo = js.Any.fromFunction0(getProcessInfo))
    __obj.asInstanceOf[SystemInfoApi]
  }
  
  extension [Self <: SystemInfoApi](x: Self) {
    
    inline def setGetInfo(value: () => js.Promise[GetInfoResponse]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    inline def setGetProcessInfo(value: () => js.Promise[GetProcessInfoResponse]): Self = StObject.set(x, "getProcessInfo", js.Any.fromFunction0(value))
  }
}
