package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsageAndQuotaRequest extends StObject {
  
  /**
    * Security origin.
    */
  var origin: String = js.native
}
object GetUsageAndQuotaRequest {
  
  @scala.inline
  def apply(origin: String): GetUsageAndQuotaRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageAndQuotaRequest]
  }
  
  @scala.inline
  implicit class GetUsageAndQuotaRequestMutableBuilder[Self <: GetUsageAndQuotaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
