package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import typings.devtoolsProtocol.mod.Protocol.Target.TargetID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerVersion extends js.Object {
  
  var controlledClients: js.UndefOr[js.Array[TargetID]] = js.native
  
  var registrationId: RegistrationID = js.native
  
  var runningStatus: ServiceWorkerVersionRunningStatus = js.native
  
  /**
    * The Last-Modified header value of the main script.
    */
  var scriptLastModified: js.UndefOr[Double] = js.native
  
  /**
    * The time at which the response headers of the main script were received from the server.
    * For cached script it is the last time the cache entry was validated.
    */
  var scriptResponseTime: js.UndefOr[Double] = js.native
  
  var scriptURL: String = js.native
  
  var status: ServiceWorkerVersionStatus = js.native
  
  var targetId: js.UndefOr[TargetID] = js.native
  
  var versionId: String = js.native
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
  implicit class ServiceWorkerVersionOps[Self <: ServiceWorkerVersion] (val x: Self) extends AnyVal {
    
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
    def setRegistrationId(value: RegistrationID): Self = this.set("registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningStatus(value: ServiceWorkerVersionRunningStatus): Self = this.set("runningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptURL(value: String): Self = this.set("scriptURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ServiceWorkerVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlledClientsVarargs(value: TargetID*): Self = this.set("controlledClients", js.Array(value :_*))
    
    @scala.inline
    def setControlledClients(value: js.Array[TargetID]): Self = this.set("controlledClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlledClients: Self = this.set("controlledClients", js.undefined)
    
    @scala.inline
    def setScriptLastModified(value: Double): Self = this.set("scriptLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptLastModified: Self = this.set("scriptLastModified", js.undefined)
    
    @scala.inline
    def setScriptResponseTime(value: Double): Self = this.set("scriptResponseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptResponseTime: Self = this.set("scriptResponseTime", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
}
