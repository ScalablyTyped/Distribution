package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDatabaseNamesRequest extends StObject {
  
  /**
    * Security origin.
    */
  var securityOrigin: String
}
object RequestDatabaseNamesRequest {
  
  inline def apply(securityOrigin: String): RequestDatabaseNamesRequest = {
    val __obj = js.Dynamic.literal(securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseNamesRequest]
  }
  
  extension [Self <: RequestDatabaseNamesRequest](x: Self) {
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
