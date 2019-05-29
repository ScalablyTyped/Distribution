package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerHandler extends js.Object {
  def addCallbackElement(widget: Widget): ServerHandler = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def setCallbackFunction(functionToInvoke: java.lang.String): ServerHandler = js.native
  def setId(id: java.lang.String): ServerHandler = js.native
  def setTag(tag: java.lang.String): ServerHandler = js.native
  def validateEmail(widget: Widget): ServerHandler = js.native
  def validateInteger(widget: Widget): ServerHandler = js.native
  def validateLength(
    widget: Widget,
    min: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ServerHandler = js.native
  def validateMatches(widget: Widget, pattern: java.lang.String): ServerHandler = js.native
  def validateMatches(widget: Widget, pattern: java.lang.String, flags: java.lang.String): ServerHandler = js.native
  def validateNotEmail(widget: Widget): ServerHandler = js.native
  def validateNotInteger(widget: Widget): ServerHandler = js.native
  def validateNotLength(
    widget: Widget,
    min: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ServerHandler = js.native
  def validateNotMatches(widget: Widget, pattern: java.lang.String): ServerHandler = js.native
  def validateNotMatches(widget: Widget, pattern: java.lang.String, flags: java.lang.String): ServerHandler = js.native
  def validateNotNumber(widget: Widget): ServerHandler = js.native
  def validateNotOptions(widget: Widget, options: js.Array[java.lang.String]): ServerHandler = js.native
  def validateNotRange(widget: Widget, min: scala.Double, max: scala.Double): ServerHandler = js.native
  def validateNotSum(widgets: js.Array[Widget], sum: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ServerHandler = js.native
  def validateNumber(widget: Widget): ServerHandler = js.native
  def validateOptions(widget: Widget, options: js.Array[java.lang.String]): ServerHandler = js.native
  def validateRange(widget: Widget, min: scala.Double, max: scala.Double): ServerHandler = js.native
  def validateSum(widgets: js.Array[Widget], sum: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ServerHandler = js.native
}

