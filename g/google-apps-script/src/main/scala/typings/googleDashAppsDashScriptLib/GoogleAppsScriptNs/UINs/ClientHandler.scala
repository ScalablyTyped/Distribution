package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientHandler extends js.Object {
  def forEventSource(): ClientHandler = js.native
  def forTargets(widgets: js.Object*): ClientHandler = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def setEnabled(enabled: scala.Boolean): ClientHandler = js.native
  def setHTML(html: java.lang.String): ClientHandler = js.native
  def setId(id: java.lang.String): ClientHandler = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): ClientHandler = js.native
  def setStyleAttribute(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attribute: java.lang.String,
    value: java.lang.String
  ): ClientHandler = js.native
  def setStyleAttributes(attributes: js.Object): ClientHandler = js.native
  def setStyleAttributes(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attributes: js.Object
  ): ClientHandler = js.native
  def setTag(tag: java.lang.String): ClientHandler = js.native
  def setText(text: java.lang.String): ClientHandler = js.native
  def setValue(value: scala.Boolean): ClientHandler = js.native
  def setVisible(visible: scala.Boolean): ClientHandler = js.native
  def validateEmail(widget: Widget): ClientHandler = js.native
  def validateInteger(widget: Widget): ClientHandler = js.native
  def validateLength(
    widget: Widget,
    min: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ClientHandler = js.native
  def validateMatches(widget: Widget, pattern: java.lang.String): ClientHandler = js.native
  def validateMatches(widget: Widget, pattern: java.lang.String, flags: java.lang.String): ClientHandler = js.native
  def validateNotEmail(widget: Widget): ClientHandler = js.native
  def validateNotInteger(widget: Widget): ClientHandler = js.native
  def validateNotLength(
    widget: Widget,
    min: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ClientHandler = js.native
  def validateNotMatches(widget: Widget, pattern: java.lang.String): ClientHandler = js.native
  def validateNotMatches(widget: Widget, pattern: java.lang.String, flags: java.lang.String): ClientHandler = js.native
  def validateNotNumber(widget: Widget): ClientHandler = js.native
  def validateNotOptions(widget: Widget, options: js.Array[java.lang.String]): ClientHandler = js.native
  def validateNotRange(widget: Widget, min: stdLib.Number, max: stdLib.Number): ClientHandler = js.native
  def validateNotSum(widgets: js.Array[Widget], sum: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClientHandler = js.native
  def validateNumber(widget: Widget): ClientHandler = js.native
  def validateOptions(widget: Widget, options: js.Array[java.lang.String]): ClientHandler = js.native
  def validateRange(widget: Widget, min: stdLib.Number, max: stdLib.Number): ClientHandler = js.native
  def validateSum(widgets: js.Array[Widget], sum: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClientHandler = js.native
}

