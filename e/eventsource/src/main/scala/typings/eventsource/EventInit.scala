package typings.eventsource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInit extends StObject {
  
  var bubbles: js.UndefOr[Boolean] = js.native
  
  var cancelable: js.UndefOr[Boolean] = js.native
  
  var composed: js.UndefOr[Boolean] = js.native
}
object EventInit {
  
  @scala.inline
  def apply(): EventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInit]
  }
  
  @scala.inline
  implicit class EventInitMutableBuilder[Self <: EventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    @scala.inline
    def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
