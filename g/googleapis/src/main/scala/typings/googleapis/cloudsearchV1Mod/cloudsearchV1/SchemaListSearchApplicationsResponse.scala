package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSearchApplicationsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var searchApplications: js.UndefOr[js.Array[SchemaSearchApplication]] = js.undefined
}
object SchemaListSearchApplicationsResponse {
  
  @scala.inline
  def apply(): SchemaListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSearchApplicationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListSearchApplicationsResponseMutableBuilder[Self <: SchemaListSearchApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSearchApplications(value: js.Array[SchemaSearchApplication]): Self = StObject.set(x, "searchApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchApplicationsUndefined: Self = StObject.set(x, "searchApplications", js.undefined)
    
    @scala.inline
    def setSearchApplicationsVarargs(value: SchemaSearchApplication*): Self = StObject.set(x, "searchApplications", js.Array(value :_*))
  }
}
