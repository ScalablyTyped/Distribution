package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import typings.devtoolsProtocol.mod.Protocol.Target.TargetID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerVersion extends StObject {
  
  var controlledClients: js.UndefOr[js.Array[TargetID]] = js.undefined
  
  var registrationId: RegistrationID
  
  var runningStatus: ServiceWorkerVersionRunningStatus
  
  /**
    * The Last-Modified header value of the main script.
    */
  var scriptLastModified: js.UndefOr[Double] = js.undefined
  
  /**
    * The time at which the response headers of the main script were received from the server.
    * For cached script it is the last time the cache entry was validated.
    */
  var scriptResponseTime: js.UndefOr[Double] = js.undefined
  
  var scriptURL: String
  
  var status: ServiceWorkerVersionStatus
  
  var targetId: js.UndefOr[TargetID] = js.undefined
  
  var versionId: String
}
object ServiceWorkerVersion {
  
  @scala.inline
  def apply(
    registrationId: RegistrationID,
    runningStatus: ServiceWorkerVersionRunningStatus,
    scriptURL: String,
    status: ServiceWorkerVersionStatus,
    versionId: String
  ): ServiceWorkerVersion = {
    val __obj = js.Dynamic.literal(registrationId = registrationId.asInstanceOf[js.Any], runningStatus = runningStatus.asInstanceOf[js.Any], scriptURL = scriptURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerVersion]
  }
  
  @scala.inline
  implicit class ServiceWorkerVersionMutableBuilder[Self <: ServiceWorkerVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlledClients(value: js.Array[TargetID]): Self = StObject.set(x, "controlledClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlledClientsUndefined: Self = StObject.set(x, "controlledClients", js.undefined)
    
    @scala.inline
    def setControlledClientsVarargs(value: TargetID*): Self = StObject.set(x, "controlledClients", js.Array(value :_*))
    
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningStatus(value: ServiceWorkerVersionRunningStatus): Self = StObject.set(x, "runningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptLastModified(value: Double): Self = StObject.set(x, "scriptLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptLastModifiedUndefined: Self = StObject.set(x, "scriptLastModified", js.undefined)
    
    @scala.inline
    def setScriptResponseTime(value: Double): Self = StObject.set(x, "scriptResponseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptResponseTimeUndefined: Self = StObject.set(x, "scriptResponseTime", js.undefined)
    
    @scala.inline
    def setScriptURL(value: String): Self = StObject.set(x, "scriptURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ServiceWorkerVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
