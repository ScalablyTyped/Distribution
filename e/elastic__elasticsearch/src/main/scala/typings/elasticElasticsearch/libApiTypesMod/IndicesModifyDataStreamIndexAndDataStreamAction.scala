package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesModifyDataStreamIndexAndDataStreamAction extends StObject {
  
  var data_stream: DataStreamName
  
  var index: IndexName
}
object IndicesModifyDataStreamIndexAndDataStreamAction {
  
  inline def apply(data_stream: DataStreamName, index: IndexName): IndicesModifyDataStreamIndexAndDataStreamAction = {
    val __obj = js.Dynamic.literal(data_stream = data_stream.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesModifyDataStreamIndexAndDataStreamAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesModifyDataStreamIndexAndDataStreamAction] (val x: Self) extends AnyVal {
    
    inline def setData_stream(value: DataStreamName): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
