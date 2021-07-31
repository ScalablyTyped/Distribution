package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectWorkerRequest extends StObject {
  
  var versionId: String
}
object InspectWorkerRequest {
  
  @scala.inline
  def apply(versionId: String): InspectWorkerRequest = {
    val __obj = js.Dynamic.literal(versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectWorkerRequest]
  }
  
  @scala.inline
  implicit class InspectWorkerRequestMutableBuilder[Self <: InspectWorkerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
