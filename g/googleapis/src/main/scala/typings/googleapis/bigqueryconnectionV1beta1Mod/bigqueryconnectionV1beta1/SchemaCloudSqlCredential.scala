package typings.googleapis.bigqueryconnectionV1beta1Mod.bigqueryconnectionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudSqlCredential extends StObject {
  
  /**
    * The password for the credential.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The username for the credential.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudSqlCredential {
  
  inline def apply(): SchemaCloudSqlCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudSqlCredential]
  }
  
  extension [Self <: SchemaCloudSqlCredential](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
