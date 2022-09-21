package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobList extends StObject {
  
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of jobs that were requested.
    */
  var jobs: js.UndefOr[js.Array[Configuration] | Null] = js.undefined
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobList {
  
  inline def apply(): SchemaJobList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobList]
  }
  
  extension [Self <: SchemaJobList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setJobs(value: js.Array[Configuration]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsNull: Self = StObject.set(x, "jobs", null)
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Configuration*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
