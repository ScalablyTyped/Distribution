package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDatabaseResponse extends StObject {
  
  /**
    * Database with an array of object stores.
    */
  var databaseWithObjectStores: DatabaseWithObjectStores = js.native
}
object RequestDatabaseResponse {
  
  @scala.inline
  def apply(databaseWithObjectStores: DatabaseWithObjectStores): RequestDatabaseResponse = {
    val __obj = js.Dynamic.literal(databaseWithObjectStores = databaseWithObjectStores.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseResponse]
  }
  
  @scala.inline
  implicit class RequestDatabaseResponseMutableBuilder[Self <: RequestDatabaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseWithObjectStores(value: DatabaseWithObjectStores): Self = StObject.set(x, "databaseWithObjectStores", value.asInstanceOf[js.Any])
  }
}
