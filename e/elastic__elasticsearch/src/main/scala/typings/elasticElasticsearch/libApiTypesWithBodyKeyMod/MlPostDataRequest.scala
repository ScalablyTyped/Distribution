package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPostDataRequest[TData]
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, use 'data' instead. */
  var body: js.UndefOr[js.Array[TData]] = js.undefined
  
  var job_id: Id
  
  var reset_end: js.UndefOr[DateTime] = js.undefined
  
  var reset_start: js.UndefOr[DateTime] = js.undefined
}
object MlPostDataRequest {
  
  inline def apply[TData](job_id: Id): MlPostDataRequest[TData] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostDataRequest[TData]]
  }
  
  extension [Self <: MlPostDataRequest[?], TData](x: Self & MlPostDataRequest[TData]) {
    
    inline def setBody(value: js.Array[TData]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBodyVarargs(value: TData*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setReset_end(value: DateTime): Self = StObject.set(x, "reset_end", value.asInstanceOf[js.Any])
    
    inline def setReset_endUndefined: Self = StObject.set(x, "reset_end", js.undefined)
    
    inline def setReset_start(value: DateTime): Self = StObject.set(x, "reset_start", value.asInstanceOf[js.Any])
    
    inline def setReset_startUndefined: Self = StObject.set(x, "reset_start", js.undefined)
  }
}
