package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityIsolationStatusResponse extends StObject {
  
  var status: SecurityIsolationStatus = js.native
}
object GetSecurityIsolationStatusResponse {
  
  @scala.inline
  def apply(status: SecurityIsolationStatus): GetSecurityIsolationStatusResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityIsolationStatusResponse]
  }
  
  @scala.inline
  implicit class GetSecurityIsolationStatusResponseMutableBuilder[Self <: GetSecurityIsolationStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: SecurityIsolationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
