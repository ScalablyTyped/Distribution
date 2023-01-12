package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetDataStreamResponse extends StObject {
  
  var data_streams: js.Array[IndicesDataStream]
}
object IndicesGetDataStreamResponse {
  
  inline def apply(data_streams: js.Array[IndicesDataStream]): IndicesGetDataStreamResponse = {
    val __obj = js.Dynamic.literal(data_streams = data_streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesGetDataStreamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesGetDataStreamResponse] (val x: Self) extends AnyVal {
    
    inline def setData_streams(value: js.Array[IndicesDataStream]): Self = StObject.set(x, "data_streams", value.asInstanceOf[js.Any])
    
    inline def setData_streamsVarargs(value: IndicesDataStream*): Self = StObject.set(x, "data_streams", js.Array(value*))
  }
}
