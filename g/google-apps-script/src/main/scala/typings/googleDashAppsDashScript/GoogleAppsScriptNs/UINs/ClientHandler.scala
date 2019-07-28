package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientHandler extends js.Object {
  def forEventSource(): ClientHandler = js.native
  def forTargets(widgets: js.Object*): ClientHandler = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setEnabled(enabled: Boolean): ClientHandler = js.native
  def setHTML(html: String): ClientHandler = js.native
  def setId(id: String): ClientHandler = js.native
  def setStyleAttribute(attribute: String, value: String): ClientHandler = js.native
  def setStyleAttribute(row: Integer, column: Integer, attribute: String, value: String): ClientHandler = js.native
  def setStyleAttributes(attributes: js.Any): ClientHandler = js.native
  def setStyleAttributes(row: Integer, column: Integer, attributes: js.Any): ClientHandler = js.native
  def setTag(tag: String): ClientHandler = js.native
  def setText(text: String): ClientHandler = js.native
  def setValue(value: Boolean): ClientHandler = js.native
  def setVisible(visible: Boolean): ClientHandler = js.native
  def validateEmail(widget: Widget): ClientHandler = js.native
  def validateInteger(widget: Widget): ClientHandler = js.native
  def validateLength(widget: Widget, min: Integer, max: Integer): ClientHandler = js.native
  def validateMatches(widget: Widget, pattern: String): ClientHandler = js.native
  def validateMatches(widget: Widget, pattern: String, flags: String): ClientHandler = js.native
  def validateNotEmail(widget: Widget): ClientHandler = js.native
  def validateNotInteger(widget: Widget): ClientHandler = js.native
  def validateNotLength(widget: Widget, min: Integer, max: Integer): ClientHandler = js.native
  def validateNotMatches(widget: Widget, pattern: String): ClientHandler = js.native
  def validateNotMatches(widget: Widget, pattern: String, flags: String): ClientHandler = js.native
  def validateNotNumber(widget: Widget): ClientHandler = js.native
  def validateNotOptions(widget: Widget, options: js.Array[String]): ClientHandler = js.native
  def validateNotRange(widget: Widget, min: Double, max: Double): ClientHandler = js.native
  def validateNotSum(widgets: js.Array[Widget], sum: Integer): ClientHandler = js.native
  def validateNumber(widget: Widget): ClientHandler = js.native
  def validateOptions(widget: Widget, options: js.Array[String]): ClientHandler = js.native
  def validateRange(widget: Widget, min: Double, max: Double): ClientHandler = js.native
  def validateSum(widgets: js.Array[Widget], sum: Integer): ClientHandler = js.native
}

