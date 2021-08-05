package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecuteWatch[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object WatcherExecuteWatch {
  
  inline def apply[T](): WatcherExecuteWatch[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherExecuteWatch[T]]
  }
  
  extension [Self <: WatcherExecuteWatch[?], T](x: Self & WatcherExecuteWatch[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
