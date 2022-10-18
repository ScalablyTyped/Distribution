package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesCreateDataStreamRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: DataStreamName
}
object IndicesCreateDataStreamRequest {
  
  inline def apply(name: DataStreamName): IndicesCreateDataStreamRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCreateDataStreamRequest]
  }
  
  extension [Self <: IndicesCreateDataStreamRequest](x: Self) {
    
    inline def setName(value: DataStreamName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
