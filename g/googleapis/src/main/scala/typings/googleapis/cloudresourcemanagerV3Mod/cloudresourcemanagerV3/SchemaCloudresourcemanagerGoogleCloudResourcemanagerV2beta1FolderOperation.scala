package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation extends StObject {
  
  /**
    * The resource name of the folder or organization we are either creating the folder under or moving the folder to.
    */
  var destinationParent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the folder.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this operation.
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the folder's parent. Only applicable when the operation_type is MOVE.
    */
  var sourceParent: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation {
  
  inline def apply(): SchemaCloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation]
  }
  
  extension [Self <: SchemaCloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation](x: Self) {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentNull: Self = StObject.set(x, "destinationParent", null)
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setSourceParent(value: String): Self = StObject.set(x, "sourceParent", value.asInstanceOf[js.Any])
    
    inline def setSourceParentNull: Self = StObject.set(x, "sourceParent", null)
    
    inline def setSourceParentUndefined: Self = StObject.set(x, "sourceParent", js.undefined)
  }
}
