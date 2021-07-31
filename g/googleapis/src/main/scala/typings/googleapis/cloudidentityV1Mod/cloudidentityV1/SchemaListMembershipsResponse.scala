package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMembershipsResponse extends StObject {
  
  /**
    * List of Memberships.
    */
  var memberships: js.UndefOr[js.Array[SchemaMembership]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for listing.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListMembershipsResponse {
  
  @scala.inline
  def apply(): SchemaListMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMembershipsResponse]
  }
  
  @scala.inline
  implicit class SchemaListMembershipsResponseMutableBuilder[Self <: SchemaListMembershipsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberships(value: js.Array[SchemaMembership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    @scala.inline
    def setMembershipsVarargs(value: SchemaMembership*): Self = StObject.set(x, "memberships", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
