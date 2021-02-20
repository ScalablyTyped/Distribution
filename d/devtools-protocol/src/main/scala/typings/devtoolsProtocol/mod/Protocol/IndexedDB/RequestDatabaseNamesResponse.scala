package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDatabaseNamesResponse extends StObject {
  
  /**
    * Database names for origin.
    */
  var databaseNames: js.Array[String] = js.native
}
object RequestDatabaseNamesResponse {
  
  @scala.inline
  def apply(databaseNames: js.Array[String]): RequestDatabaseNamesResponse = {
    val __obj = js.Dynamic.literal(databaseNames = databaseNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseNamesResponse]
  }
  
  @scala.inline
  implicit class RequestDatabaseNamesResponseMutableBuilder[Self <: RequestDatabaseNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseNames(value: js.Array[String]): Self = StObject.set(x, "databaseNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNamesVarargs(value: String*): Self = StObject.set(x, "databaseNames", js.Array(value :_*))
  }
}
