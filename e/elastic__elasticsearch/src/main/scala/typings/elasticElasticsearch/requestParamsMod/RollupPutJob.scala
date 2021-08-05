package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupPutJob[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var id: String
}
object RollupPutJob {
  
  inline def apply[T](body: T, id: String): RollupPutJob[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupPutJob[T]]
  }
  
  extension [Self <: RollupPutJob[?], T](x: Self & RollupPutJob[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
