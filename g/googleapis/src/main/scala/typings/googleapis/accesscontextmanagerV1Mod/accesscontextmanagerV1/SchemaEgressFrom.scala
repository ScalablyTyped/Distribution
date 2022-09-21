package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEgressFrom extends StObject {
  
  /**
    * A list of identities that are allowed access through this [EgressPolicy]. Should be in the format of email address. The email address should represent individual user or service account only.
    */
  var identities: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies the type of identities that are allowed access to outside the perimeter. If left unspecified, then members of `identities` field will be allowed access.
    */
  var identityType: js.UndefOr[String | Null] = js.undefined
}
object SchemaEgressFrom {
  
  inline def apply(): SchemaEgressFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEgressFrom]
  }
  
  extension [Self <: SchemaEgressFrom](x: Self) {
    
    inline def setIdentities(value: js.Array[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesNull: Self = StObject.set(x, "identities", null)
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setIdentitiesVarargs(value: String*): Self = StObject.set(x, "identities", js.Array(value*))
    
    inline def setIdentityType(value: String): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeNull: Self = StObject.set(x, "identityType", null)
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "identityType", js.undefined)
  }
}
