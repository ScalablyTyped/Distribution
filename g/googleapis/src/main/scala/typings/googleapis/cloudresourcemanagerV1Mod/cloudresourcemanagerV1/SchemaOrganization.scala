package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrganization extends StObject {
  
  /**
    * Timestamp when the Organization was created. Assigned by the server.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human-readable string that refers to the Organization in the GCP Console UI. This string is set by the server and cannot be changed. The string will be set to the primary domain (for example, "google.com") of the G Suite customer that owns the organization.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The organization's current lifecycle state. Assigned by the server.
    */
  var lifecycleState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the organization. This is the organization's relative path in the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The owner of this Organization. The owner should be specified on creation. Once set, it cannot be changed. This field is required.
    */
  var owner: js.UndefOr[SchemaOrganizationOwner] = js.undefined
}
object SchemaOrganization {
  
  inline def apply(): SchemaOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganization]
  }
  
  extension [Self <: SchemaOrganization](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLifecycleState(value: String): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateNull: Self = StObject.set(x, "lifecycleState", null)
    
    inline def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: SchemaOrganizationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
