package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDatabaseRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String = js.native
  
  /**
    * Security origin.
    */
  var securityOrigin: String = js.native
}
object RequestDatabaseRequest {
  
  @scala.inline
  def apply(databaseName: String, securityOrigin: String): RequestDatabaseRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDatabaseRequest]
  }
  
  @scala.inline
  implicit class RequestDatabaseRequestMutableBuilder[Self <: RequestDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
