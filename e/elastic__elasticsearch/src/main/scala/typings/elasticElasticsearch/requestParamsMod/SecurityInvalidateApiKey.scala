package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateApiKey[T]
  extends StObject
     with Generic {
  
  var body: T
}
object SecurityInvalidateApiKey {
  
  inline def apply[T](body: T): SecurityInvalidateApiKey[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInvalidateApiKey[T]]
  }
  
  extension [Self <: SecurityInvalidateApiKey[?], T](x: Self & SecurityInvalidateApiKey[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
