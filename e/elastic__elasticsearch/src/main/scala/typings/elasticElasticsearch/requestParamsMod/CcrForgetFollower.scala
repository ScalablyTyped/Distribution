package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrForgetFollower[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var index: String
}
object CcrForgetFollower {
  
  inline def apply[T](body: T, index: String): CcrForgetFollower[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrForgetFollower[T]]
  }
  
  extension [Self <: CcrForgetFollower[?], T](x: Self & CcrForgetFollower[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
