package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStartDatafeedRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var datafeed_id: Id
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlStartDatafeedRequest {
  
  inline def apply(datafeed_id: Id): MlStartDatafeedRequest = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartDatafeedRequest]
  }
  
  extension [Self <: MlStartDatafeedRequest](x: Self) {
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
