package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStreamIndex extends StObject {
  
  var index_name: IndexName
  
  var index_uuid: Uuid
}
object IndicesDataStreamIndex {
  
  inline def apply(index_name: IndexName, index_uuid: Uuid): IndicesDataStreamIndex = {
    val __obj = js.Dynamic.literal(index_name = index_name.asInstanceOf[js.Any], index_uuid = index_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDataStreamIndex]
  }
  
  extension [Self <: IndicesDataStreamIndex](x: Self) {
    
    inline def setIndex_name(value: IndexName): Self = StObject.set(x, "index_name", value.asInstanceOf[js.Any])
    
    inline def setIndex_uuid(value: Uuid): Self = StObject.set(x, "index_uuid", value.asInstanceOf[js.Any])
  }
}
