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

