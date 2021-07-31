package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entitlement resources for the user.
  */
trait SchemaEntitlementsListResponse extends StObject {
  
  /**
    * An entitlement of a user to a product (e.g. an app). For example, a free
    * app that they have installed, or a paid app that they have been allocated
    * a license to.
    */
  var entitlement: js.UndefOr[js.Array[SchemaEntitlement]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#entitlementsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaEntitlementsListResponse {
  
  @scala.inline
  def apply(): SchemaEntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntitlementsListResponse]
  }
  
  @scala.inline
  implicit class SchemaEntitlementsListResponseMutableBuilder[Self <: SchemaEntitlementsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlement(value: js.Array[SchemaEntitlement]): Self = StObject.set(x, "entitlement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementUndefined: Self = StObject.set(x, "entitlement", js.undefined)
    
    @scala.inline
    def setEntitlementVarargs(value: SchemaEntitlement*): Self = StObject.set(x, "entitlement", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
