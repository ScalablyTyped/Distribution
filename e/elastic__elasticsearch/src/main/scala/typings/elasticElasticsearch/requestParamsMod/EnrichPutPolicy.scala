package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichPutPolicy[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var name: String
}
object EnrichPutPolicy {
  
  inline def apply[T](body: T, name: String): EnrichPutPolicy[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichPutPolicy[T]]
  }
  
  extension [Self <: EnrichPutPolicy[?], T](x: Self & EnrichPutPolicy[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
