package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSearchApplicationsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  var searchApplications: js.UndefOr[js.Array[SchemaSearchApplication]] = js.undefined
}
object SchemaListSearchApplicationsResponse {
  
  inline def apply(): SchemaListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSearchApplicationsResponse]
  }
  
  extension [Self <: SchemaListSearchApplicationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSearchApplications(value: js.Array[SchemaSearchApplication]): Self = StObject.set(x, "searchApplications", value.asInstanceOf[js.Any])
    
    inline def setSearchApplicationsUndefined: Self = StObject.set(x, "searchApplications", js.undefined)
    
    inline def setSearchApplicationsVarargs(value: SchemaSearchApplication*): Self = StObject.set(x, "searchApplications", js.Array(value*))
  }
}
