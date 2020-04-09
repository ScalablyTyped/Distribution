package typings.devextreme.mod.default.ui

import typings.devextreme.AnonCompile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "ui")
@js.native
object ^ extends js.Object {
  var dxItem: js.Any = js.native
  /** @name ui.notify(message,type,displayTime) */
  def notify(message: String): Unit = js.native
  def notify(message: String, `type`: String): Unit = js.native
  def notify(message: String, `type`: String, displayTime: Double): Unit = js.native
  /** @name ui.notify(options,type,displayTime) */
  def notify(options: js.Any): Unit = js.native
  def notify(options: js.Any, `type`: String): Unit = js.native
  def notify(options: js.Any, `type`: String, displayTime: Double): Unit = js.native
  /** @name ui.repaintFloatingActionButton() */
  def repaintFloatingActionButton(): Unit = js.native
  /** @name ui.setTemplateEngine(name) */
  def setTemplateEngine(templateEngineName: String): Unit = js.native
  /** @name ui.setTemplateEngine(options) */
  def setTemplateEngine(templateEngineOptions: AnonCompile): Unit = js.native
}

