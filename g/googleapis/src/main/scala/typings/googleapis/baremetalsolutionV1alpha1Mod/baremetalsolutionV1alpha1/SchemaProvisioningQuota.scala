package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvisioningQuota extends StObject {
  
  /**
    * Instance quota.
    */
  var instanceQuota: js.UndefOr[SchemaInstanceQuota] = js.undefined
}
object SchemaProvisioningQuota {
  
  inline def apply(): SchemaProvisioningQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvisioningQuota]
  }
  
  extension [Self <: SchemaProvisioningQuota](x: Self) {
    
    inline def setInstanceQuota(value: SchemaInstanceQuota): Self = StObject.set(x, "instanceQuota", value.asInstanceOf[js.Any])
    
    inline def setInstanceQuotaUndefined: Self = StObject.set(x, "instanceQuota", js.undefined)
  }
}
