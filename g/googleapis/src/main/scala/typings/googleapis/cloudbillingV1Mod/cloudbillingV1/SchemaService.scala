package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates a single service in Google Cloud Platform.
  */
trait SchemaService extends StObject {
  
  /**
    * The business under which the service is offered. Ex.
    * &quot;businessEntities/GCP&quot;, &quot;businessEntities/Maps&quot;
    */
  var businessEntityName: js.UndefOr[String] = js.undefined
  
  /**
    * A human readable display name for this service.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name for the service. Example:
    * &quot;services/DA34-426B-A397&quot;
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the service. Example: &quot;DA34-426B-A397&quot;
    */
  var serviceId: js.UndefOr[String] = js.undefined
}
object SchemaService {
  
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  @scala.inline
  implicit class SchemaServiceMutableBuilder[Self <: SchemaService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessEntityName(value: String): Self = StObject.set(x, "businessEntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessEntityNameUndefined: Self = StObject.set(x, "businessEntityName", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
