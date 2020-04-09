package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends DOMComponent {
  /** @name Widget.focus() */
  def focus(): Unit = js.native
  /** @name Widget.registerKeyHandler(key, handler) */
  def registerKeyHandler(key: String, handler: js.Function): Unit = js.native
  /** @name Widget.repaint() */
  def repaint(): Unit = js.native
}

