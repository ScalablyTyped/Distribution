package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaService extends StObject {
  
  /**
    * The business under which the service is offered. Ex. "businessEntities/GCP", "businessEntities/Maps"
    */
  var businessEntityName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human readable display name for this service.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the service. Example: "services/DA34-426B-A397"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The identifier for the service. Example: "DA34-426B-A397"
    */
  var serviceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaService {
  
  inline def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  extension [Self <: SchemaService](x: Self) {
    
    inline def setBusinessEntityName(value: String): Self = StObject.set(x, "businessEntityName", value.asInstanceOf[js.Any])
    
    inline def setBusinessEntityNameNull: Self = StObject.set(x, "businessEntityName", null)
    
    inline def setBusinessEntityNameUndefined: Self = StObject.set(x, "businessEntityName", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
