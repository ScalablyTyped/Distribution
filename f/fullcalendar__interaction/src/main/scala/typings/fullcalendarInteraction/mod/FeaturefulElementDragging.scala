package typings.fullcalendarInteraction.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementDragging * / any */ trait FeaturefulElementDragging extends StObject {
  
  var autoScroller: AutoScroller
  
  /* private */ var containerEl: Any
  
  var delay: Double | Null
  
  var delayTimeoutId: Double | Null
  
  def destroy(): Unit
  
  def handleDelayEnd(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def handleDistanceSurpassed(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  var isDelayEnded: Boolean
  
  var isDistanceSurpassed: Boolean
  
  var isDragging: Boolean
  
  var isInteracting: Boolean
  
  var minDistance: Double
  
  var mirror: ElementMirror
  
  var mirrorNeedsRevert: Boolean
  
  def onPointerDown(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def onPointerMove(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def onPointerUp(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  var pointer: PointerDragging
  
  def setAutoScrollEnabled(bool: Boolean): Unit
  
  def setIgnoreMove(bool: Boolean): Unit
  
  def setMirrorIsVisible(bool: Boolean): Unit
  
  def setMirrorNeedsRevert(bool: Boolean): Unit
  
  def startDelay(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def stopDrag(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  var touchScrollAllowed: Boolean
  
  def tryStartDrag(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
  
  def tryStopDrag(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit
}
object FeaturefulElementDragging {
  
  inline def apply(
    autoScroller: AutoScroller,
    containerEl: Any,
    destroy: () => Unit,
    handleDelayEnd: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    handleDistanceSurpassed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    isDelayEnded: Boolean,
    isDistanceSurpassed: Boolean,
    isDragging: Boolean,
    isInteracting: Boolean,
    minDistance: Double,
    mirror: ElementMirror,
    mirrorNeedsRevert: Boolean,
    onPointerDown: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    onPointerMove: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    onPointerUp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    pointer: PointerDragging,
    setAutoScrollEnabled: Boolean => Unit,
    setIgnoreMove: Boolean => Unit,
    setMirrorIsVisible: Boolean => Unit,
    setMirrorNeedsRevert: Boolean => Unit,
    startDelay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    stopDrag: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    touchScrollAllowed: Boolean,
    tryStartDrag: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit,
    tryStopDrag: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
  ): FeaturefulElementDragging = {
    val __obj = js.Dynamic.literal(autoScroller = autoScroller.asInstanceOf[js.Any], containerEl = containerEl.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), handleDelayEnd = js.Any.fromFunction1(handleDelayEnd), handleDistanceSurpassed = js.Any.fromFunction1(handleDistanceSurpassed), isDelayEnded = isDelayEnded.asInstanceOf[js.Any], isDistanceSurpassed = isDistanceSurpassed.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isInteracting = isInteracting.asInstanceOf[js.Any], minDistance = minDistance.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], mirrorNeedsRevert = mirrorNeedsRevert.asInstanceOf[js.Any], onPointerDown = js.Any.fromFunction1(onPointerDown), onPointerMove = js.Any.fromFunction1(onPointerMove), onPointerUp = js.Any.fromFunction1(onPointerUp), pointer = pointer.asInstanceOf[js.Any], setAutoScrollEnabled = js.Any.fromFunction1(setAutoScrollEnabled), setIgnoreMove = js.Any.fromFunction1(setIgnoreMove), setMirrorIsVisible = js.Any.fromFunction1(setMirrorIsVisible), setMirrorNeedsRevert = js.Any.fromFunction1(setMirrorNeedsRevert), startDelay = js.Any.fromFunction1(startDelay), stopDrag = js.Any.fromFunction1(stopDrag), touchScrollAllowed = touchScrollAllowed.asInstanceOf[js.Any], tryStartDrag = js.Any.fromFunction1(tryStartDrag), tryStopDrag = js.Any.fromFunction1(tryStopDrag), delay = null, delayTimeoutId = null)
    __obj.asInstanceOf[FeaturefulElementDragging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturefulElementDragging] (val x: Self) extends AnyVal {
    
    inline def setAutoScroller(value: AutoScroller): Self = StObject.set(x, "autoScroller", value.asInstanceOf[js.Any])
    
    inline def setContainerEl(value: Any): Self = StObject.set(x, "containerEl", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayNull: Self = StObject.set(x, "delay", null)
    
    inline def setDelayTimeoutId(value: Double): Self = StObject.set(x, "delayTimeoutId", value.asInstanceOf[js.Any])
    
    inline def setDelayTimeoutIdNull: Self = StObject.set(x, "delayTimeoutId", null)
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setHandleDelayEnd(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "handleDelayEnd", js.Any.fromFunction1(value))
    
    inline def setHandleDistanceSurpassed(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "handleDistanceSurpassed", js.Any.fromFunction1(value))
    
    inline def setIsDelayEnded(value: Boolean): Self = StObject.set(x, "isDelayEnded", value.asInstanceOf[js.Any])
    
    inline def setIsDistanceSurpassed(value: Boolean): Self = StObject.set(x, "isDistanceSurpassed", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsInteracting(value: Boolean): Self = StObject.set(x, "isInteracting", value.asInstanceOf[js.Any])
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMirror(value: ElementMirror): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorNeedsRevert(value: Boolean): Self = StObject.set(x, "mirrorNeedsRevert", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDown(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerMove(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerUp(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setPointer(value: PointerDragging): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setSetAutoScrollEnabled(value: Boolean => Unit): Self = StObject.set(x, "setAutoScrollEnabled", js.Any.fromFunction1(value))
    
    inline def setSetIgnoreMove(value: Boolean => Unit): Self = StObject.set(x, "setIgnoreMove", js.Any.fromFunction1(value))
    
    inline def setSetMirrorIsVisible(value: Boolean => Unit): Self = StObject.set(x, "setMirrorIsVisible", js.Any.fromFunction1(value))
    
    inline def setSetMirrorNeedsRevert(value: Boolean => Unit): Self = StObject.set(x, "setMirrorNeedsRevert", js.Any.fromFunction1(value))
    
    inline def setStartDelay(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "startDelay", js.Any.fromFunction1(value))
    
    inline def setStopDrag(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "stopDrag", js.Any.fromFunction1(value))
    
    inline def setTouchScrollAllowed(value: Boolean): Self = StObject.set(x, "touchScrollAllowed", value.asInstanceOf[js.Any])
    
    inline def setTryStartDrag(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "tryStartDrag", js.Any.fromFunction1(value))
    
    inline def setTryStopDrag(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any => Unit
    ): Self = StObject.set(x, "tryStopDrag", js.Any.fromFunction1(value))
  }
}
