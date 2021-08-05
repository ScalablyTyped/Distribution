package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosePointInTime[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
}
object ClosePointInTime {
  
  inline def apply[T](): ClosePointInTime[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosePointInTime[T]]
  }
  
  extension [Self <: ClosePointInTime[?], T](x: Self & ClosePointInTime[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
