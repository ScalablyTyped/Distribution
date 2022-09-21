package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveFolderRequest extends StObject {
  
  /**
    * Required. The resource name of the Folder or Organization to reparent the folder under. Must be of the form `folders/{folder_id\}` or `organizations/{org_id\}`.
    */
  var destinationParent: js.UndefOr[String | Null] = js.undefined
}
object SchemaMoveFolderRequest {
  
  inline def apply(): SchemaMoveFolderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveFolderRequest]
  }
  
  extension [Self <: SchemaMoveFolderRequest](x: Self) {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentNull: Self = StObject.set(x, "destinationParent", null)
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
  }
}
