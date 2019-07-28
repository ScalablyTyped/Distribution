package typings.glidejs.JQueryGlideNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlideApi extends js.Object {
  /**
    * Append arrows to specifed target (eq. 'body', '.class', '#id')
    */
  def arrows(target: String): Unit
  /**
    * Returning current slide number
    */
  def current(): Double
  /**
    * Destroy and cleanup slider
    */
  def destroy(): Unit
  /**
    * Jump to current slide
    */
  def jump(distance: Double, callback: js.Function): Unit
  /**
    * Append navigation to specifed target (eq. 'body', '.class', '#id')
    */
  def nav(target: String): Unit
  /**
    * Slide one forward
    */
  def next(callback: js.Function): Unit
  /**
    * Stopping autoplay
    */
  def pause(): Unit
  /**
    * Starting autoplay
    */
  def play(): Unit
  /**
    * Slide one backward
    */
  def prev(callback: js.Function): Unit
  /**
    * Rebuild and recalculate dimensions of slider elements
    */
  def reinit(): Unit
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
}

