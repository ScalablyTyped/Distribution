package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDatabaseNamesResponse extends StObject {
  
  /**
    * Database names for origin.
    */
  var databaseNames: js.Array[String]
}
object RequestDatabaseNamesResponse {
  
  inline def apply(databaseNames: js.Array[String]): RequestDatabaseNamesResponse = {
    val __obj = js.Dynamic.literal(databaseNames = databaseNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseNamesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestDatabaseNamesResponse] (val x: Self) extends AnyVal {
    
    inline def setDatabaseNames(value: js.Array[String]): Self = StObject.set(x, "databaseNames", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNamesVarargs(value: String*): Self = StObject.set(x, "databaseNames", js.Array(value*))
  }
}
