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
  
  @scala.inline
  def apply[T](): MessageEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventInit[T]]
  }
  
  @scala.inline
  implicit class MessageEventInitMutableBuilder[Self <: MessageEventInit[?], T] (val x: Self & MessageEventInit[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
