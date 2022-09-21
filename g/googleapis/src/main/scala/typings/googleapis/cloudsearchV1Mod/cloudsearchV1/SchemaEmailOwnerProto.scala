package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmailOwnerProto extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaEmailOwnerProto {
  
  inline def apply(): SchemaEmailOwnerProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailOwnerProto]
  }
  
  extension [Self <: SchemaEmailOwnerProto](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
