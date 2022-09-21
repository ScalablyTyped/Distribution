package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveFolderMetadata extends StObject {
  
  /**
    * The resource name of the folder or organization to move the folder to.
    */
  var destinationParent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the folder.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the folder's parent.
    */
  var sourceParent: js.UndefOr[String | Null] = js.undefined
}
object SchemaMoveFolderMetadata {
  
  inline def apply(): SchemaMoveFolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveFolderMetadata]
  }
  
  extension [Self <: SchemaMoveFolderMetadata](x: Self) {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentNull: Self = StObject.set(x, "destinationParent", null)
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setSourceParent(value: String): Self = StObject.set(x, "sourceParent", value.asInstanceOf[js.Any])
    
    inline def setSourceParentNull: Self = StObject.set(x, "sourceParent", null)
    
    inline def setSourceParentUndefined: Self = StObject.set(x, "sourceParent", js.undefined)
  }
}
