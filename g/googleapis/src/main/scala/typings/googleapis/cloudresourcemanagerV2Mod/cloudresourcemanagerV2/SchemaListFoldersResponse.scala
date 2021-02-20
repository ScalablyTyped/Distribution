package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListFolders response message.
  */
@js.native
trait SchemaListFoldersResponse extends StObject {
  
  /**
    * A possibly paginated list of Folders that are direct descendants of the
    * specified parent resource.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
  
  /**
    * A pagination token returned from a previous call to `ListFolders` that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListFoldersResponse {
  
  @scala.inline
  def apply(): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
  
  @scala.inline
  implicit class SchemaListFoldersResponseMutableBuilder[Self <: SchemaListFoldersResponse] (val x: Self) extends AnyVal {
    
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
