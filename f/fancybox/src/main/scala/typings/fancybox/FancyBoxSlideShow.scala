package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxSlideShow extends js.Object {
  
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
  implicit class FancyBoxSlideShowOps[Self <: FancyBoxSlideShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$progress(value: JQuery): Self = this.set("$progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: FancyBoxInstance): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: Boolean => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def set$button(value: JQuery): Self = this.set("$button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$button: Self = this.set("$button", js.undefined)
    
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
  }
}
