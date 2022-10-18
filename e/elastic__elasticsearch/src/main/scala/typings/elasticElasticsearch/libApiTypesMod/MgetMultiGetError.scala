package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MgetMultiGetError
  extends StObject
     with MgetResponseItem[Any] {
  
  var _id: Id
  
  var _index: IndexName
  
  var error: ErrorCause
}
object MgetMultiGetError {
  
  inline def apply(_id: Id, _index: IndexName, error: ErrorCause): MgetMultiGetError = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MgetMultiGetError]
  }
  
  extension [Self <: MgetMultiGetError](x: Self) {
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
  }
}
