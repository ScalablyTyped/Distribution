package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateFilter[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var filter_id: String
}
object MlUpdateFilter {
  
  inline def apply[T](body: T, filter_id: String): MlUpdateFilter[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateFilter[T]]
  }
  
  extension [Self <: MlUpdateFilter[?], T](x: Self & MlUpdateFilter[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setFilter_id(value: String): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
  }
}
