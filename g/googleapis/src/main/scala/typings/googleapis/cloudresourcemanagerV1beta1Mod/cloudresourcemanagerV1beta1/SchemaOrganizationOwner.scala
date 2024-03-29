package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrganizationOwner extends StObject {
  
  /**
    * The G Suite customer id used in the Directory API.
    */
  var directoryCustomerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrganizationOwner {
  
  inline def apply(): SchemaOrganizationOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationOwner]
  }
  
  extension [Self <: SchemaOrganizationOwner](x: Self) {
    
    inline def setDirectoryCustomerId(value: String): Self = StObject.set(x, "directoryCustomerId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryCustomerIdNull: Self = StObject.set(x, "directoryCustomerId", null)
    
    inline def setDirectoryCustomerIdUndefined: Self = StObject.set(x, "directoryCustomerId", js.undefined)
  }
}
