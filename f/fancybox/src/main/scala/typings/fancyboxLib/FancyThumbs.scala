package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyThumbs extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.undefined
  @JSName("$grid")
  var $grid: js.UndefOr[JQuery] = js.undefined
  @JSName("$list")
  var $list: js.UndefOr[JQuery] = js.undefined
  var instance: FancyBoxInstance
  var isActive: scala.Boolean
  var isVisible: scala.Boolean
  var opts: FancyThumbsOptions
  def create(): scala.Unit
  def focus(duration: scala.Double): scala.Unit
  def hide(): scala.Unit
  def init(instance: FancyBoxInstance): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
  def update(): scala.Unit
}

