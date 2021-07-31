package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDataSourceResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var sources: js.UndefOr[js.Array[SchemaDataSource]] = js.undefined
}
object SchemaListDataSourceResponse {
  
  @scala.inline
  def apply(): SchemaListDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDataSourceResponse]
  }
  
  @scala.inline
  implicit class SchemaListDataSourceResponseMutableBuilder[Self <: SchemaListDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[SchemaDataSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaDataSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
