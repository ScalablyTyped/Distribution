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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesCreateDataStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: DataStreamName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
