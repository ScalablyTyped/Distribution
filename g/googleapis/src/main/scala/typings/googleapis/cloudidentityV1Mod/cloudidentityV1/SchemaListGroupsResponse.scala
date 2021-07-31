package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListGroups operation.
  */
trait SchemaListGroupsResponse extends StObject {
  
  /**
    * Groups returned in response to list request. The results are not sorted.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for listing.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListGroupsResponse {
  
  @scala.inline
  def apply(): SchemaListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGroupsResponse]
  }
  
  @scala.inline
  implicit class SchemaListGroupsResponseMutableBuilder[Self <: SchemaListGroupsResponse] (val x: Self) extends AnyVal {
    
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
