package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetFeatureStateRequest
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetFeatureStateResponse
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetInfoResponse
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetProcessInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoApi extends StObject {
  
  /**
    * Returns information about the feature state.
    */
  def getFeatureState(params: GetFeatureStateRequest): js.Promise[GetFeatureStateResponse]
  
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
    getFeatureState: GetFeatureStateRequest => js.Promise[GetFeatureStateResponse],
    getInfo: () => js.Promise[GetInfoResponse],
    getProcessInfo: () => js.Promise[GetProcessInfoResponse]
  ): SystemInfoApi = {
    val __obj = js.Dynamic.literal(getFeatureState = js.Any.fromFunction1(getFeatureState), getInfo = js.Any.fromFunction0(getInfo), getProcessInfo = js.Any.fromFunction0(getProcessInfo))
    __obj.asInstanceOf[SystemInfoApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoApi] (val x: Self) extends AnyVal {
    
    inline def setGetFeatureState(value: GetFeatureStateRequest => js.Promise[GetFeatureStateResponse]): Self = StObject.set(x, "getFeatureState", js.Any.fromFunction1(value))
    
    inline def setGetInfo(value: () => js.Promise[GetInfoResponse]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    inline def setGetProcessInfo(value: () => js.Promise[GetProcessInfoResponse]): Self = StObject.set(x, "getProcessInfo", js.Any.fromFunction0(value))
  }
}
