package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearObjectStoreRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String
  
  /**
    * Object store name.
    */
  var objectStoreName: String
  
  /**
    * Security origin.
    */
  var securityOrigin: String
}
object ClearObjectStoreRequest {
  
  inline def apply(databaseName: String, objectStoreName: String, securityOrigin: String): ClearObjectStoreRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearObjectStoreRequest]
  }
  
  extension [Self <: ClearObjectStoreRequest](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
