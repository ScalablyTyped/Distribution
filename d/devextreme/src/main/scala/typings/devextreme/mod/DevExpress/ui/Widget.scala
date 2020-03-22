package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends DOMComponent {
  /** Sets focus on the widget. */
  def focus(): Unit = js.native
  /** Registers a handler to be executed when a user presses a specific key. */
  def registerKeyHandler(key: String, handler: js.Function): Unit = js.native
  /** Repaints the widget without reloading data. Call it to update the widget's markup. */
  def repaint(): Unit = js.native
}

