package typings.eventsource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventInit[T]
  extends StObject
     with EventInit {
  
  var data: js.UndefOr[T] = js.undefined
  
  var lastEventId: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
}
object MessageEventInit {
  
  inline def apply[T](): MessageEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventInit[T]]
  }
  
  extension [Self <: MessageEventInit[?], T](x: Self & MessageEventInit[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    inline def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
