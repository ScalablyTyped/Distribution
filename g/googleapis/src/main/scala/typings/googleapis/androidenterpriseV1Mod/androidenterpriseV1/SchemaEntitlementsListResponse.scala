package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntitlementsListResponse extends StObject {
  
  /**
    * An entitlement of a user to a product (e.g. an app). For example, a free app that they have installed, or a paid app that they have been allocated a license to.
    */
  var entitlement: js.UndefOr[js.Array[SchemaEntitlement]] = js.undefined
}
object SchemaEntitlementsListResponse {
  
  inline def apply(): SchemaEntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntitlementsListResponse]
  }
  
  extension [Self <: SchemaEntitlementsListResponse](x: Self) {
    
    inline def setEntitlement(value: js.Array[SchemaEntitlement]): Self = StObject.set(x, "entitlement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementUndefined: Self = StObject.set(x, "entitlement", js.undefined)
    
    inline def setEntitlementVarargs(value: SchemaEntitlement*): Self = StObject.set(x, "entitlement", js.Array(value*))
  }
}
