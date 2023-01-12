package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDatabaseResponse extends StObject {
  
  /**
    * Database with an array of object stores.
    */
  var databaseWithObjectStores: DatabaseWithObjectStores
}
object RequestDatabaseResponse {
  
  inline def apply(databaseWithObjectStores: DatabaseWithObjectStores): RequestDatabaseResponse = {
    val __obj = js.Dynamic.literal(databaseWithObjectStores = databaseWithObjectStores.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestDatabaseResponse] (val x: Self) extends AnyVal {
    
    inline def setDatabaseWithObjectStores(value: DatabaseWithObjectStores): Self = StObject.set(x, "databaseWithObjectStores", value.asInstanceOf[js.Any])
  }
}
