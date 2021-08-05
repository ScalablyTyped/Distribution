package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDatabaseRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String
  
  /**
    * Security origin.
    */
  var securityOrigin: String
}
object RequestDatabaseRequest {
  
  inline def apply(databaseName: String, securityOrigin: String): RequestDatabaseRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseRequest]
  }
  
  extension [Self <: RequestDatabaseRequest](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
