package typings.firefoxWebextBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtEvent[TCallback /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
  
  def addListener(cb: TCallback): Unit
  
  def hasListener(cb: TCallback): Boolean
  
  def removeListener(cb: TCallback): Unit
}
object WebExtEvent {
  
  inline def apply[TCallback /* <: js.Function1[/* repeated */ Any, Any] */](
    addListener: TCallback => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): WebExtEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[WebExtEvent[TCallback]]
  }
  
  extension [Self <: WebExtEvent[?], TCallback /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & WebExtEvent[TCallback]) {
    
    inline def setAddListener(value: TCallback => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
  }
}
