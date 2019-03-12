package typings
package glidejsLib.JQueryGlideNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlideApi extends js.Object {
  /**
    * Append arrows to specifed target (eq. 'body', '.class', '#id')
    */
  def arrows(target: java.lang.String): scala.Unit
  /**
    * Returning current slide number
    */
  def current(): scala.Double
  /**
    * Destroy and cleanup slider
    */
  def destroy(): scala.Unit
  /**
    * Jump to current slide
    */
  def jump(distance: scala.Double, callback: js.Function): scala.Unit
  /**
    * Append navigation to specifed target (eq. 'body', '.class', '#id')
    */
  def nav(target: java.lang.String): scala.Unit
  /**
    * Slide one forward
    */
  def next(callback: js.Function): scala.Unit
  /**
    * Stopping autoplay
    */
  def pause(): scala.Unit
  /**
    * Starting autoplay
    */
  def play(): scala.Unit
  /**
    * Slide one backward
    */
  def prev(callback: js.Function): scala.Unit
  /**
    * Rebuild and recalculate dimensions of slider elements
    */
  def reinit(): scala.Unit
}

object IGlideApi {
  @scala.inline
  def apply(
    arrows: java.lang.String => scala.Unit,
    current: () => scala.Double,
    destroy: () => scala.Unit,
    jump: (scala.Double, js.Function) => scala.Unit,
    nav: java.lang.String => scala.Unit,
    next: js.Function => scala.Unit,
    pause: () => scala.Unit,
    play: () => scala.Unit,
    prev: js.Function => scala.Unit,
    reinit: () => scala.Unit
  ): IGlideApi = {
    val __obj = js.Dynamic.literal(arrows = js.Any.fromFunction1(arrows), current = js.Any.fromFunction0(current), destroy = js.Any.fromFunction0(destroy), jump = js.Any.fromFunction2(jump), nav = js.Any.fromFunction1(nav), next = js.Any.fromFunction1(next), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), prev = js.Any.fromFunction1(prev), reinit = js.Any.fromFunction0(reinit))
  
    __obj.asInstanceOf[IGlideApi]
  }
}

