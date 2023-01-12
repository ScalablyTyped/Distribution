package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesPromoteDataStreamRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: IndexName
}
object IndicesPromoteDataStreamRequest {
  
  inline def apply(name: IndexName): IndicesPromoteDataStreamRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPromoteDataStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesPromoteDataStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: IndexName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
