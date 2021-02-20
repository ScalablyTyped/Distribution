package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxSlideShow extends StObject {
  
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.native
  
  @JSName("$progress")
  var $progress: JQuery = js.native
  
  def clear(): Unit = js.native
  
  def init(): Unit = js.native
  
  var instance: FancyBoxInstance = js.native
  
  var isActive: Boolean = js.native
  
  def set(force: Boolean): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  
  var timer: js.UndefOr[Double] = js.native
  
  def toggle(): Unit = js.native
}
object FancyBoxSlideShow {
  
  @scala.inline
  def apply(
    $progress: JQuery,
    clear: () => Unit,
    init: () => Unit,
    instance: FancyBoxInstance,
    isActive: Boolean,
    set: Boolean => Unit,
    start: () => Unit,
    stop: () => Unit,
    toggle: () => Unit
  ): FancyBoxSlideShow = {
    val __obj = js.Dynamic.literal($progress = $progress.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), init = js.Any.fromFunction0(init), instance = instance.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[FancyBoxSlideShow]
  }
  
  @scala.inline
  implicit class FancyBoxSlideShowMutableBuilder[Self <: FancyBoxSlideShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$button(value: JQuery): Self = StObject.set(x, "$button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$buttonUndefined: Self = StObject.set(x, "$button", js.undefined)
    
    @scala.inline
    def set$progress(value: JQuery): Self = StObject.set(x, "$progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: FancyBoxInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: Boolean => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
