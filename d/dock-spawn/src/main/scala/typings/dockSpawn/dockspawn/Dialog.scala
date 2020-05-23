package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dialog extends js.Object {
  def bringToFront(): Unit
  def resize(width: Double, height: Double): Unit
  def setPosition(x: Double, y: Double): Unit
  def setTitle(title: String): Unit
  def setTitleIcon(iconName: String): Unit
}

object Dialog {
  @scala.inline
  def apply(
    bringToFront: () => Unit,
    resize: (Double, Double) => Unit,
    setPosition: (Double, Double) => Unit,
    setTitle: String => Unit,
    setTitleIcon: String => Unit
  ): Dialog = {
    val __obj = js.Dynamic.literal(bringToFront = js.Any.fromFunction0(bringToFront), resize = js.Any.fromFunction2(resize), setPosition = js.Any.fromFunction2(setPosition), setTitle = js.Any.fromFunction1(setTitle), setTitleIcon = js.Any.fromFunction1(setTitleIcon))
    __obj.asInstanceOf[Dialog]
  }
}

