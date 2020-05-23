package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelContainer extends js.Object {
  var height: Double
  var width: Double
  def setTitle(title: String): Unit
  def setTitleIcon(iconName: String): Unit
}

object PanelContainer {
  @scala.inline
  def apply(height: Double, setTitle: String => Unit, setTitleIcon: String => Unit, width: Double): PanelContainer = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], setTitle = js.Any.fromFunction1(setTitle), setTitleIcon = js.Any.fromFunction1(setTitleIcon), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelContainer]
  }
}

