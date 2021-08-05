package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearScroll[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var scroll_id: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ClearScroll {
  
  inline def apply[T](): ClearScroll[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearScroll[T]]
  }
  
  extension [Self <: ClearScroll[?], T](x: Self & ClearScroll[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setScroll_id(value: String | js.Array[String]): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
    
    inline def setScroll_idUndefined: Self = StObject.set(x, "scroll_id", js.undefined)
    
    inline def setScroll_idVarargs(value: String*): Self = StObject.set(x, "scroll_id", js.Array(value :_*))
  }
}
