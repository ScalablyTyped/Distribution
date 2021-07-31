package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobList extends StObject {
  
  var etag: js.UndefOr[String] = js.undefined
  
  var jobs: js.UndefOr[js.Array[JobListJobs]] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object JobList {
  
  @scala.inline
  def apply(): JobList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobList]
  }
  
  @scala.inline
  implicit class JobListMutableBuilder[Self <: JobList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setJobs(value: js.Array[JobListJobs]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: JobListJobs*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
