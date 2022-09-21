package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLdapUserProto extends StObject {
  
  var userName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLdapUserProto {
  
  inline def apply(): SchemaLdapUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLdapUserProto]
  }
  
  extension [Self <: SchemaLdapUserProto](x: Self) {
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
