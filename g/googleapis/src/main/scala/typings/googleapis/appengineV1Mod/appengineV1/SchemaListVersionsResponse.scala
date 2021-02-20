package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for Versions.ListVersions.
  */
@js.native
trait SchemaListVersionsResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The versions belonging to the requested service.
    */
  var versions: js.UndefOr[js.Array[SchemaVersion]] = js.native
}
object SchemaListVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListVersionsResponseMutableBuilder[Self <: SchemaListVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[SchemaVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SchemaVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
