package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetOverallBucketsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var bucket_span: js.UndefOr[Duration] = js.undefined
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  
  var job_id: Id
  
  var overall_score: js.UndefOr[double | String] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
  
  var top_n: js.UndefOr[integer] = js.undefined
}
object MlGetOverallBucketsRequest {
  
  inline def apply(job_id: Id): MlGetOverallBucketsRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetOverallBucketsRequest]
  }
  
  extension [Self <: MlGetOverallBucketsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setBucket_span(value: Duration): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setBucket_spanUndefined: Self = StObject.set(x, "bucket_span", js.undefined)
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setExclude_interim(value: Boolean): Self = StObject.set(x, "exclude_interim", value.asInstanceOf[js.Any])
    
    inline def setExclude_interimUndefined: Self = StObject.set(x, "exclude_interim", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setOverall_score(value: double | String): Self = StObject.set(x, "overall_score", value.asInstanceOf[js.Any])
    
    inline def setOverall_scoreUndefined: Self = StObject.set(x, "overall_score", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTop_n(value: integer): Self = StObject.set(x, "top_n", value.asInstanceOf[js.Any])
    
    inline def setTop_nUndefined: Self = StObject.set(x, "top_n", js.undefined)
  }
}
