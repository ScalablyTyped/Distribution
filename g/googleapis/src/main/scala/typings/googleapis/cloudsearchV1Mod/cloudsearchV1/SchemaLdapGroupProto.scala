package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLdapGroupProto extends StObject {
  
  var groupName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLdapGroupProto {
  
  inline def apply(): SchemaLdapGroupProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLdapGroupProto]
  }
  
  extension [Self <: SchemaLdapGroupProto](x: Self) {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameNull: Self = StObject.set(x, "groupName", null)
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
