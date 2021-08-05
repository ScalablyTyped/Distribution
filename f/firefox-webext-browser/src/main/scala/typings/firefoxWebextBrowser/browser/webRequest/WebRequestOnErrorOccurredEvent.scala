package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestOnErrorOccurredEvent[TCallback] extends StObject {
  
  def addListener(cb: TCallback, filter: RequestFilter): Unit
  
  def hasListener(cb: TCallback): Boolean
  
  def removeListener(cb: TCallback): Unit
}
object WebRequestOnErrorOccurredEvent {
  
  inline def apply[TCallback](
    addListener: (TCallback, RequestFilter) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): WebRequestOnErrorOccurredEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[WebRequestOnErrorOccurredEvent[TCallback]]
  }
  
  extension [Self <: WebRequestOnErrorOccurredEvent[?], TCallback](x: Self & WebRequestOnErrorOccurredEvent[TCallback]) {
    
    inline def setAddListener(value: (TCallback, RequestFilter) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
  }
}
