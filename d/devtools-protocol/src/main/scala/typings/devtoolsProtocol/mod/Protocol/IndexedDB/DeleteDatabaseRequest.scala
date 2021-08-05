package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatabaseRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String
  
  /**
    * Security origin.
    */
  var securityOrigin: String
}
object DeleteDatabaseRequest {
  
  inline def apply(databaseName: String, securityOrigin: String): DeleteDatabaseRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatabaseRequest]
  }
  
  extension [Self <: DeleteDatabaseRequest](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
