package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPostDataRequest[TData]
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var data: js.UndefOr[js.Array[TData]] = js.undefined
  
  var job_id: Id
  
  var reset_end: js.UndefOr[DateTime] = js.undefined
  
  var reset_start: js.UndefOr[DateTime] = js.undefined
}
object MlPostDataRequest {
  
  inline def apply[TData](job_id: Id): MlPostDataRequest[TData] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostDataRequest[TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPostDataRequest[?], TData] (val x: Self & MlPostDataRequest[TData]) extends AnyVal {
    
    inline def setData(value: js.Array[TData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: TData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setReset_end(value: DateTime): Self = StObject.set(x, "reset_end", value.asInstanceOf[js.Any])
    
    inline def setReset_endUndefined: Self = StObject.set(x, "reset_end", js.undefined)
    
    inline def setReset_start(value: DateTime): Self = StObject.set(x, "reset_start", value.asInstanceOf[js.Any])
    
    inline def setReset_startUndefined: Self = StObject.set(x, "reset_start", js.undefined)
  }
}
