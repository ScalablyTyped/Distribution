package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestOnErrorOccurredEvent[TCallback] extends StObject {
  
  def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
object WebRequestOnErrorOccurredEvent {
  
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, RequestFilter) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): WebRequestOnErrorOccurredEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[WebRequestOnErrorOccurredEvent[TCallback]]
  }
  
  @scala.inline
  implicit class WebRequestOnErrorOccurredEventMutableBuilder[Self <: WebRequestOnErrorOccurredEvent[_], TCallback] (val x: Self with WebRequestOnErrorOccurredEvent[TCallback]) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: (TCallback, RequestFilter) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
  }
}
