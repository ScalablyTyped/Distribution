package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatMlJobsRequest
  extends StObject
     with CatCatRequestBase {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var bytes: js.UndefOr[Bytes] = js.undefined
  
  @JSName("h")
  var h_CatMlJobsRequest: js.UndefOr[CatCatAnonalyDetectorColumns] = js.undefined
  
  var job_id: js.UndefOr[Id] = js.undefined
  
  @JSName("s")
  var s_CatMlJobsRequest: js.UndefOr[CatCatAnonalyDetectorColumns] = js.undefined
  
  var time: js.UndefOr[TimeUnit] = js.undefined
}
object CatMlJobsRequest {
  
  inline def apply(): CatMlJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMlJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatMlJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setBytes(value: Bytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setH(value: CatCatAnonalyDetectorColumns): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: CatCatAnomalyDetectorColumn*): Self = StObject.set(x, "h", js.Array(value*))
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setS(value: CatCatAnonalyDetectorColumns): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: CatCatAnomalyDetectorColumn*): Self = StObject.set(x, "s", js.Array(value*))
    
    inline def setTime(value: TimeUnit): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
