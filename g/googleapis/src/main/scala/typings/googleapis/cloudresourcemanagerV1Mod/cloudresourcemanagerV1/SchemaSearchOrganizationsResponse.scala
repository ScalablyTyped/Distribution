package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response returned from the `SearchOrganizations` method.
  */
trait SchemaSearchOrganizationsResponse extends StObject {
  
  /**
    * A pagination token to be used to retrieve the next page of results. If
    * the result is too large to fit within the page size specified in the
    * request, this field will be set with a token that can be used to fetch
    * the next page of results. If this field is empty, it indicates that this
    * response contains the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of Organizations that matched the search query, possibly
    * paginated.
    */
  var organizations: js.UndefOr[js.Array[SchemaOrganization]] = js.undefined
}
object SchemaSearchOrganizationsResponse {
  
  inline def apply(): SchemaSearchOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchOrganizationsResponse]
  }
  
  extension [Self <: SchemaSearchOrganizationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOrganizations(value: js.Array[SchemaOrganization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: SchemaOrganization*): Self = StObject.set(x, "organizations", js.Array(value :_*))
  }
}
