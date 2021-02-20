package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetSslProxiesSetBackendServiceRequest extends StObject {
  
  /**
    * The URL of the new BackendService resource for the targetSslProxy.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaTargetSslProxiesSetBackendServiceRequest {
  
  @scala.inline
  def apply(): SchemaTargetSslProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetSslProxiesSetBackendServiceRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetSslProxiesSetBackendServiceRequestMutableBuilder[Self <: SchemaTargetSslProxiesSetBackendServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
