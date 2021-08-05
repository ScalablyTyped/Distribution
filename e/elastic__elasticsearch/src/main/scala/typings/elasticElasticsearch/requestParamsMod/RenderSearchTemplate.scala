package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSearchTemplate[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object RenderSearchTemplate {
  
  inline def apply[T](): RenderSearchTemplate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderSearchTemplate[T]]
  }
  
  extension [Self <: RenderSearchTemplate[?], T](x: Self & RenderSearchTemplate[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
