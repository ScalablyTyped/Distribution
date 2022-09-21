package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainId extends StObject {
  
  /**
    * The primary domain for the customer.
    */
  var customerPrimaryDomain: js.UndefOr[String | Null] = js.undefined
}
object SchemaDomainId {
  
  inline def apply(): SchemaDomainId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainId]
  }
  
  extension [Self <: SchemaDomainId](x: Self) {
    
    inline def setCustomerPrimaryDomain(value: String): Self = StObject.set(x, "customerPrimaryDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomerPrimaryDomainNull: Self = StObject.set(x, "customerPrimaryDomain", null)
    
    inline def setCustomerPrimaryDomainUndefined: Self = StObject.set(x, "customerPrimaryDomain", js.undefined)
  }
}
