package typings.fpsmeter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSMeter extends StObject {
  
  def destroy(): Unit
  
  def hide(): FPSMeter
  
  var options: FPSMeterOptions
  
  def pause(): FPSMeter
  
  def resume(): FPSMeter
  
  def set(name: String, value: js.Any): FPSMeter
  
  def show(): FPSMeter
  
  def showDuration(): FPSMeter
  
  def showFps(): FPSMeter
  
  def tick(): Unit
  
  def tickStart(): Unit
  
  def toggle(): FPSMeter
}
object FPSMeter {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => FPSMeter,
    options: FPSMeterOptions,
    pause: () => FPSMeter,
    resume: () => FPSMeter,
    set: (String, js.Any) => FPSMeter,
    show: () => FPSMeter,
    showDuration: () => FPSMeter,
    showFps: () => FPSMeter,
    tick: () => Unit,
    tickStart: () => Unit,
    toggle: () => FPSMeter
  ): FPSMeter = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), options = options.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), set = js.Any.fromFunction2(set), show = js.Any.fromFunction0(show), showDuration = js.Any.fromFunction0(showDuration), showFps = js.Any.fromFunction0(showFps), tick = js.Any.fromFunction0(tick), tickStart = js.Any.fromFunction0(tickStart), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[FPSMeter]
  }
  
  @scala.inline
  implicit class FPSMeterMutableBuilder[Self <: FPSMeter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => FPSMeter): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: FPSMeterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => FPSMeter): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResume(value: () => FPSMeter): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => FPSMeter): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: () => FPSMeter): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowDuration(value: () => FPSMeter): Self = StObject.set(x, "showDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowFps(value: () => FPSMeter): Self = StObject.set(x, "showFps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTickStart(value: () => Unit): Self = StObject.set(x, "tickStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => FPSMeter): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
