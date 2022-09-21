package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFoldersResponse extends StObject {
  
  /**
    * A possibly paginated list of Folders that are direct descendants of the specified parent resource.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to `ListFolders` that indicates from where listing should continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListFoldersResponse {
  
  inline def apply(): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
  
  extension [Self <: SchemaListFoldersResponse](x: Self) {
    
    inline def setFolders(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: SchemaFolder*): Self = StObject.set(x, "folders", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
