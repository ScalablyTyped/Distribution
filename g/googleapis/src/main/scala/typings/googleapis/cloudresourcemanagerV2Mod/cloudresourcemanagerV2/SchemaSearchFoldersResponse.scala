package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for searching folders.
  */
@js.native
trait SchemaSearchFoldersResponse extends StObject {
  
  /**
    * A possibly paginated folder search results. the specified parent
    * resource.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
  
  /**
    * A pagination token returned from a previous call to `SearchFolders` that
    * indicates from where searching should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaSearchFoldersResponse {
  
  @scala.inline
  def apply(): SchemaSearchFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchFoldersResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchFoldersResponseMutableBuilder[Self <: SchemaSearchFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolders(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: SchemaFolder*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
