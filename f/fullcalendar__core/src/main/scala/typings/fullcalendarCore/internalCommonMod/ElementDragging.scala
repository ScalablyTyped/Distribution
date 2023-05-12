package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDragging extends StObject {
  
  def destroy(): Unit
  
  var emitter: Emitter[Any]
  
  def setAutoScrollEnabled(bool: Boolean): Unit
  
  def setIgnoreMove(bool: Boolean): Unit
  
  def setMirrorIsVisible(bool: Boolean): Unit
  
  def setMirrorNeedsRevert(bool: Boolean): Unit
}
object ElementDragging {
  
  inline def apply(
    destroy: () => Unit,
    emitter: Emitter[Any],
    setAutoScrollEnabled: Boolean => Unit,
    setIgnoreMove: Boolean => Unit,
    setMirrorIsVisible: Boolean => Unit,
    setMirrorNeedsRevert: Boolean => Unit
  ): ElementDragging = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), emitter = emitter.asInstanceOf[js.Any], setAutoScrollEnabled = js.Any.fromFunction1(setAutoScrollEnabled), setIgnoreMove = js.Any.fromFunction1(setIgnoreMove), setMirrorIsVisible = js.Any.fromFunction1(setMirrorIsVisible), setMirrorNeedsRevert = js.Any.fromFunction1(setMirrorNeedsRevert))
    __obj.asInstanceOf[ElementDragging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDragging] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setEmitter(value: Emitter[Any]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setSetAutoScrollEnabled(value: Boolean => Unit): Self = StObject.set(x, "setAutoScrollEnabled", js.Any.fromFunction1(value))
    
    inline def setSetIgnoreMove(value: Boolean => Unit): Self = StObject.set(x, "setIgnoreMove", js.Any.fromFunction1(value))
    
    inline def setSetMirrorIsVisible(value: Boolean => Unit): Self = StObject.set(x, "setMirrorIsVisible", js.Any.fromFunction1(value))
    
    inline def setSetMirrorNeedsRevert(value: Boolean => Unit): Self = StObject.set(x, "setMirrorNeedsRevert", js.Any.fromFunction1(value))
  }
}
