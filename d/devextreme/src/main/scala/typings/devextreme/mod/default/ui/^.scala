package typings.devextreme.mod.default.ui

import typings.devextreme.AnonCompile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "ui")
@js.native
object ^ extends js.Object {
  var dxItem: js.Any = js.native
  /** Creates a toast message. */
  def notify(message: String): Unit = js.native
  def notify(message: String, `type`: String): Unit = js.native
  def notify(message: String, `type`: String, displayTime: Double): Unit = js.native
  /** Creates a toast message. */
  def notify(options: js.Any): Unit = js.native
  def notify(options: js.Any, `type`: String): Unit = js.native
  def notify(options: js.Any, `type`: String, displayTime: Double): Unit = js.native
  /** Repaints the Floating Action Button. */
  def repaintFloatingActionButton(): Unit = js.native
  /** Sets a template engine. */
  def setTemplateEngine(templateEngineName: String): Unit = js.native
  /** Sets a custom template engine defined via custom compile and render functions. */
  def setTemplateEngine(templateEngineOptions: AnonCompile): Unit = js.native
}

