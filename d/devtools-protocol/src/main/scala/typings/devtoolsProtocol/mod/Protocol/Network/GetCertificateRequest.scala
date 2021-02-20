package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateRequest extends StObject {
  
  /**
    * Origin to get certificate for.
    */
  var origin: String = js.native
}
object GetCertificateRequest {
  
  @scala.inline
  def apply(origin: String): GetCertificateRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateRequest]
  }
  
  @scala.inline
  implicit class GetCertificateRequestMutableBuilder[Self <: GetCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
