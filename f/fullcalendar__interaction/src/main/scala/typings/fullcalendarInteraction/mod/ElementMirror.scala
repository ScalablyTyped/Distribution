package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementMirror extends StObject {
  
  def cleanup(): Unit
  
  var deltaX: js.UndefOr[Double] = js.undefined
  
  var deltaY: js.UndefOr[Double] = js.undefined
  
  def doRevertAnimation(callback: js.Function0[Unit], revertDuration: Double): Unit
  
  def getMirrorEl(): HTMLElement
  
  def handleMove(pageX: Double, pageY: Double): Unit
  
  var isVisible: Boolean
  
  var mirrorEl: HTMLElement | Null
  
  var origScreenX: js.UndefOr[Double] = js.undefined
  
  var origScreenY: js.UndefOr[Double] = js.undefined
  
  var parentNode: HTMLElement
  
  var revertDuration: Double
  
  def setIsVisible(bool: Boolean): Unit
  
  var sourceEl: HTMLElement | Null
  
  var sourceElRect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rect */ Any) | Null
  
  def start(sourceEl: HTMLElement, pageX: Double, pageY: Double): Unit
  
  def stop(needsRevertAnimation: Boolean, callback: js.Function0[Unit]): Unit
  
  def updateElPosition(): Unit
  
  var zIndex: Double
}
object ElementMirror {
  
  inline def apply(
    cleanup: () => Unit,
    doRevertAnimation: (js.Function0[Unit], Double) => Unit,
    getMirrorEl: () => HTMLElement,
    handleMove: (Double, Double) => Unit,
    isVisible: Boolean,
    parentNode: HTMLElement,
    revertDuration: Double,
    setIsVisible: Boolean => Unit,
    start: (HTMLElement, Double, Double) => Unit,
    stop: (Boolean, js.Function0[Unit]) => Unit,
    updateElPosition: () => Unit,
    zIndex: Double
  ): ElementMirror = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), doRevertAnimation = js.Any.fromFunction2(doRevertAnimation), getMirrorEl = js.Any.fromFunction0(getMirrorEl), handleMove = js.Any.fromFunction2(handleMove), isVisible = isVisible.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], revertDuration = revertDuration.asInstanceOf[js.Any], setIsVisible = js.Any.fromFunction1(setIsVisible), start = js.Any.fromFunction3(start), stop = js.Any.fromFunction2(stop), updateElPosition = js.Any.fromFunction0(updateElPosition), zIndex = zIndex.asInstanceOf[js.Any], mirrorEl = null, sourceEl = null, sourceElRect = null)
    __obj.asInstanceOf[ElementMirror]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementMirror] (val x: Self) extends AnyVal {
    
    inline def setCleanup(value: () => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    inline def setDoRevertAnimation(value: (js.Function0[Unit], Double) => Unit): Self = StObject.set(x, "doRevertAnimation", js.Any.fromFunction2(value))
    
    inline def setGetMirrorEl(value: () => HTMLElement): Self = StObject.set(x, "getMirrorEl", js.Any.fromFunction0(value))
    
    inline def setHandleMove(value: (Double, Double) => Unit): Self = StObject.set(x, "handleMove", js.Any.fromFunction2(value))
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setMirrorEl(value: HTMLElement): Self = StObject.set(x, "mirrorEl", value.asInstanceOf[js.Any])
    
    inline def setMirrorElNull: Self = StObject.set(x, "mirrorEl", null)
    
    inline def setOrigScreenX(value: Double): Self = StObject.set(x, "origScreenX", value.asInstanceOf[js.Any])
    
    inline def setOrigScreenXUndefined: Self = StObject.set(x, "origScreenX", js.undefined)
    
    inline def setOrigScreenY(value: Double): Self = StObject.set(x, "origScreenY", value.asInstanceOf[js.Any])
    
    inline def setOrigScreenYUndefined: Self = StObject.set(x, "origScreenY", js.undefined)
    
    inline def setParentNode(value: HTMLElement): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setRevertDuration(value: Double): Self = StObject.set(x, "revertDuration", value.asInstanceOf[js.Any])
    
    inline def setSetIsVisible(value: Boolean => Unit): Self = StObject.set(x, "setIsVisible", js.Any.fromFunction1(value))
    
    inline def setSourceEl(value: HTMLElement): Self = StObject.set(x, "sourceEl", value.asInstanceOf[js.Any])
    
    inline def setSourceElNull: Self = StObject.set(x, "sourceEl", null)
    
    inline def setSourceElRect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rect */ Any
    ): Self = StObject.set(x, "sourceElRect", value.asInstanceOf[js.Any])
    
    inline def setSourceElRectNull: Self = StObject.set(x, "sourceElRect", null)
    
    inline def setStart(value: (HTMLElement, Double, Double) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    inline def setStop(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setUpdateElPosition(value: () => Unit): Self = StObject.set(x, "updateElPosition", js.Any.fromFunction0(value))
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
