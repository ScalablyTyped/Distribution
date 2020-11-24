package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for searching folders.
  */
@js.native
trait SchemaSearchFoldersResponse extends js.Object {
  
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
  implicit class SchemaSearchFoldersResponseOps[Self <: SchemaSearchFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFoldersVarargs(value: SchemaFolder*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[SchemaFolder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
