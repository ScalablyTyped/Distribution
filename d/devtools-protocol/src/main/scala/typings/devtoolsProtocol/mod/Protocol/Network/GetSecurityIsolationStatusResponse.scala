package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityIsolationStatusResponse extends StObject {
  
  var status: SecurityIsolationStatus
}
object GetSecurityIsolationStatusResponse {
  
  inline def apply(status: SecurityIsolationStatus): GetSecurityIsolationStatusResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityIsolationStatusResponse]
  }
  
  extension [Self <: GetSecurityIsolationStatusResponse](x: Self) {
    
    inline def setStatus(value: SecurityIsolationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
