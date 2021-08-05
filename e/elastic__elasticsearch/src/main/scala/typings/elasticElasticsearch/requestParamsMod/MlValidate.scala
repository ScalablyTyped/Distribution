package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlValidate[T]
  extends StObject
     with Generic {
  
  var body: T
}
object MlValidate {
  
  inline def apply[T](body: T): MlValidate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlValidate[T]]
  }
  
  extension [Self <: MlValidate[?], T](x: Self & MlValidate[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
