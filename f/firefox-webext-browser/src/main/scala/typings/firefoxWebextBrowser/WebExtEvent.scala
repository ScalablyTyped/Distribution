package typings.firefoxWebextBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtEvent[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */] extends StObject {
  
  def addListener(cb: TCallback): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
object WebExtEvent {
  
  @scala.inline
  def apply[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */](
    addListener: TCallback => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): WebExtEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[WebExtEvent[TCallback]]
  }
  
  @scala.inline
  implicit class WebExtEventMutableBuilder[Self <: WebExtEvent[_], TCallback /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with WebExtEvent[TCallback]) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: TCallback => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
  }
}
