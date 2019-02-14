package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxFullScreen extends js.Object {
  def enabled(): scala.Boolean
  def exit(): scala.Unit
  def isFullscreen(): scala.Boolean
  def request(elem: stdLib.HTMLElement): scala.Unit
  def toggle(elem: stdLib.HTMLElement): scala.Unit
}

