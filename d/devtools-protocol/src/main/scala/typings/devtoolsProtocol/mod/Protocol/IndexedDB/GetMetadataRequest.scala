package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetadataRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String = js.native
  
  /**
    * Object store name.
    */
  var objectStoreName: String = js.native
  
  /**
    * Security origin.
    */
  var securityOrigin: String = js.native
}
object GetMetadataRequest {
  
  @scala.inline
  def apply(databaseName: String, objectStoreName: String, securityOrigin: String): GetMetadataRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetadataRequest]
  }
  
  @scala.inline
  implicit class GetMetadataRequestMutableBuilder[Self <: GetMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
