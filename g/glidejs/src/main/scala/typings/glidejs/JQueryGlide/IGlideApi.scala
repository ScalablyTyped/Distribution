package typings.glidejs.JQueryGlide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlideApi extends js.Object {
  
  /**
    * Append arrows to specifed target (eq. 'body', '.class', '#id')
    */
  def arrows(target: String): Unit = js.native
  
  /**
    * Returning current slide number
    */
  def current(): Double = js.native
  
  /**
    * Destroy and cleanup slider
    */
  def destroy(): Unit = js.native
  
  /**
    * Jump to current slide
    */
  def jump(distance: Double, callback: js.Function): Unit = js.native
  
  /**
    * Append navigation to specifed target (eq. 'body', '.class', '#id')
    */
  def nav(target: String): Unit = js.native
  
  /**
    * Slide one forward
    */
  def next(callback: js.Function): Unit = js.native
  
  /**
    * Stopping autoplay
    */
  def pause(): Unit = js.native
  
  /**
    * Starting autoplay
    */
  def play(): Unit = js.native
  
  /**
    * Slide one backward
    */
  def prev(callback: js.Function): Unit = js.native
  
  /**
    * Rebuild and recalculate dimensions of slider elements
    */
  def reinit(): Unit = js.native
}
object IGlideApi {
  
  @scala.inline
  def apply(
    arrows: String => Unit,
    current: () => Double,
    destroy: () => Unit,
    jump: (Double, js.Function) => Unit,
    nav: String => Unit,
    next: js.Function => Unit,
    pause: () => Unit,
    play: () => Unit,
    prev: js.Function => Unit,
    reinit: () => Unit
  ): IGlideApi = {
    val __obj = js.Dynamic.literal(arrows = js.Any.fromFunction1(arrows), current = js.Any.fromFunction0(current), destroy = js.Any.fromFunction0(destroy), jump = js.Any.fromFunction2(jump), nav = js.Any.fromFunction1(nav), next = js.Any.fromFunction1(next), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), prev = js.Any.fromFunction1(prev), reinit = js.Any.fromFunction0(reinit))
    __obj.asInstanceOf[IGlideApi]
  }
  
  @scala.inline
  implicit class IGlideApiOps[Self <: IGlideApi] (val x: Self) extends AnyVal {
    
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
    def setArrows(value: String => Unit): Self = this.set("arrows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrent(value: () => Double): Self = this.set("current", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJump(value: (Double, js.Function) => Unit): Self = this.set("jump", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNav(value: String => Unit): Self = this.set("nav", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext(value: js.Function => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: js.Function => Unit): Self = this.set("prev", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReinit(value: () => Unit): Self = this.set("reinit", js.Any.fromFunction0(value))
  }
}
