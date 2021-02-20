package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSearchGroupsResponse extends StObject {
  
  /**
    * List of Groups satisfying the search query.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for specified query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaSearchGroupsResponse {
  
  @scala.inline
  def apply(): SchemaSearchGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchGroupsResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchGroupsResponseMutableBuilder[Self <: SchemaSearchGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[SchemaGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: SchemaGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
