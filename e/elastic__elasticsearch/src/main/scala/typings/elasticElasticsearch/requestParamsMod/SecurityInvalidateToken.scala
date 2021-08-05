package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateToken[T]
  extends StObject
     with Generic {
  
  var body: T
}
object SecurityInvalidateToken {
  
  inline def apply[T](body: T): SecurityInvalidateToken[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInvalidateToken[T]]
  }
  
  extension [Self <: SecurityInvalidateToken[?], T](x: Self & SecurityInvalidateToken[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
