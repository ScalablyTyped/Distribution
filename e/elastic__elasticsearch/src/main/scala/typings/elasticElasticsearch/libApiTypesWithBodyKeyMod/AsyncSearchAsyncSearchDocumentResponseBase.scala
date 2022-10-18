package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSearchAsyncSearchDocumentResponseBase[TDocument, TAggregations]
  extends StObject
     with AsyncSearchAsyncSearchResponseBase {
  
  var response: AsyncSearchAsyncSearch[TDocument, TAggregations]
}
object AsyncSearchAsyncSearchDocumentResponseBase {
  
  inline def apply[TDocument, TAggregations](
    expiration_time_in_millis: EpochTime[UnitMillis],
    is_partial: Boolean,
    is_running: Boolean,
    response: AsyncSearchAsyncSearch[TDocument, TAggregations],
    start_time_in_millis: EpochTime[UnitMillis]
  ): AsyncSearchAsyncSearchDocumentResponseBase[TDocument, TAggregations] = {
    val __obj = js.Dynamic.literal(expiration_time_in_millis = expiration_time_in_millis.asInstanceOf[js.Any], is_partial = is_partial.asInstanceOf[js.Any], is_running = is_running.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchAsyncSearchDocumentResponseBase[TDocument, TAggregations]]
  }
  
  extension [Self <: AsyncSearchAsyncSearchDocumentResponseBase[?, ?], TDocument, TAggregations](x: Self & (AsyncSearchAsyncSearchDocumentResponseBase[TDocument, TAggregations])) {
    
    inline def setResponse(value: AsyncSearchAsyncSearch[TDocument, TAggregations]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
