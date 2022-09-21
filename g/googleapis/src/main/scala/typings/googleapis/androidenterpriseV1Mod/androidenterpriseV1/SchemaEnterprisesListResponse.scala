package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnterprisesListResponse extends StObject {
  
  /**
    * An enterprise.
    */
  var enterprise: js.UndefOr[js.Array[SchemaEnterprise]] = js.undefined
}
object SchemaEnterprisesListResponse {
  
  inline def apply(): SchemaEnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprisesListResponse]
  }
  
  extension [Self <: SchemaEnterprisesListResponse](x: Self) {
    
    inline def setEnterprise(value: js.Array[SchemaEnterprise]): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setEnterpriseVarargs(value: SchemaEnterprise*): Self = StObject.set(x, "enterprise", js.Array(value*))
  }
}
