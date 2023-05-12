package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollResponder extends StObject {
  
  def detach(): Unit
  
  /* private */ var drain: Any
  
  /* private */ var emitter: Any
  
  /* private */ var execFunc: Any
  
  /* private */ var fireInitialScroll: Any
  
  /* private */ var handleScrollRequest: Any
  
  var queuedRequest: ScrollRequest
  
  /* private */ var scrollTime: Any
  
  /* private */ var scrollTimeReset: Any
  
  def update(isDatesNew: Boolean): Unit
}
object ScrollResponder {
  
  inline def apply(
    detach: () => Unit,
    drain: Any,
    emitter: Any,
    execFunc: Any,
    fireInitialScroll: Any,
    handleScrollRequest: Any,
    queuedRequest: ScrollRequest,
    scrollTime: Any,
    scrollTimeReset: Any,
    update: Boolean => Unit
  ): ScrollResponder = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), drain = drain.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], execFunc = execFunc.asInstanceOf[js.Any], fireInitialScroll = fireInitialScroll.asInstanceOf[js.Any], handleScrollRequest = handleScrollRequest.asInstanceOf[js.Any], queuedRequest = queuedRequest.asInstanceOf[js.Any], scrollTime = scrollTime.asInstanceOf[js.Any], scrollTimeReset = scrollTimeReset.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ScrollResponder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollResponder] (val x: Self) extends AnyVal {
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setDrain(value: Any): Self = StObject.set(x, "drain", value.asInstanceOf[js.Any])
    
    inline def setEmitter(value: Any): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setExecFunc(value: Any): Self = StObject.set(x, "execFunc", value.asInstanceOf[js.Any])
    
    inline def setFireInitialScroll(value: Any): Self = StObject.set(x, "fireInitialScroll", value.asInstanceOf[js.Any])
    
    inline def setHandleScrollRequest(value: Any): Self = StObject.set(x, "handleScrollRequest", value.asInstanceOf[js.Any])
    
    inline def setQueuedRequest(value: ScrollRequest): Self = StObject.set(x, "queuedRequest", value.asInstanceOf[js.Any])
    
    inline def setScrollTime(value: Any): Self = StObject.set(x, "scrollTime", value.asInstanceOf[js.Any])
    
    inline def setScrollTimeReset(value: Any): Self = StObject.set(x, "scrollTimeReset", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Boolean => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
