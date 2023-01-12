package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlFlushJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var advance_time: js.UndefOr[DateTime] = js.undefined
  
  var calc_interim: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var job_id: Id
  
  var skip_time: js.UndefOr[DateTime] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
}
object MlFlushJobRequest {
  
  inline def apply(job_id: Id): MlFlushJobRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFlushJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlFlushJobRequest] (val x: Self) extends AnyVal {
    
    inline def setAdvance_time(value: DateTime): Self = StObject.set(x, "advance_time", value.asInstanceOf[js.Any])
    
    inline def setAdvance_timeUndefined: Self = StObject.set(x, "advance_time", js.undefined)
    
    inline def setCalc_interim(value: Boolean): Self = StObject.set(x, "calc_interim", value.asInstanceOf[js.Any])
    
    inline def setCalc_interimUndefined: Self = StObject.set(x, "calc_interim", js.undefined)
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSkip_time(value: DateTime): Self = StObject.set(x, "skip_time", value.asInstanceOf[js.Any])
    
    inline def setSkip_timeUndefined: Self = StObject.set(x, "skip_time", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
