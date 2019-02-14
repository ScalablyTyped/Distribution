package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxSlideShow extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.undefined
  @JSName("$progress")
  var $progress: JQuery
  var instance: FancyBoxInstance
  var isActive: scala.Boolean
  var timer: js.UndefOr[scala.Double] = js.undefined
  def clear(): scala.Unit
  def init(): scala.Unit
  def set(force: scala.Boolean): scala.Unit
  def start(): scala.Unit
  def stop(): scala.Unit
  def toggle(): scala.Unit
}

