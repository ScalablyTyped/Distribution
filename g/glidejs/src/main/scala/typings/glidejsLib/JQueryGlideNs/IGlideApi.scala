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
    arrows: js.Function1[java.lang.String, scala.Unit],
    current: js.Function0[scala.Double],
    destroy: js.Function0[scala.Unit],
    jump: js.Function2[scala.Double, js.Function, scala.Unit],
    nav: js.Function1[java.lang.String, scala.Unit],
    next: js.Function1[js.Function, scala.Unit],
    pause: js.Function0[scala.Unit],
    play: js.Function0[scala.Unit],
    prev: js.Function1[js.Function, scala.Unit],
    reinit: js.Function0[scala.Unit]
  ): IGlideApi = {
    val __obj = js.Dynamic.literal(arrows = arrows, current = current, destroy = destroy, jump = jump, nav = nav, next = next, pause = pause, play = play, prev = prev, reinit = reinit)
  
    __obj.asInstanceOf[IGlideApi]
  }
}

