package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerHandler extends js.Object {
  def addCallbackElement(widget: Widget): ServerHandler = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setCallbackFunction(functionToInvoke: String): ServerHandler = js.native
  def setId(id: String): ServerHandler = js.native
  def setTag(tag: String): ServerHandler = js.native
  def validateEmail(widget: Widget): ServerHandler = js.native
  def validateInteger(widget: Widget): ServerHandler = js.native
  def validateLength(widget: Widget, min: Integer, max: Integer): ServerHandler = js.native
  def validateMatches(widget: Widget, pattern: String): ServerHandler = js.native
  def validateMatches(widget: Widget, pattern: String, flags: String): ServerHandler = js.native
  def validateNotEmail(widget: Widget): ServerHandler = js.native
  def validateNotInteger(widget: Widget): ServerHandler = js.native
  def validateNotLength(widget: Widget, min: Integer, max: Integer): ServerHandler = js.native
  def validateNotMatches(widget: Widget, pattern: String): ServerHandler = js.native
  def validateNotMatches(widget: Widget, pattern: String, flags: String): ServerHandler = js.native
  def validateNotNumber(widget: Widget): ServerHandler = js.native
  def validateNotOptions(widget: Widget, options: js.Array[String]): ServerHandler = js.native
  def validateNotRange(widget: Widget, min: Double, max: Double): ServerHandler = js.native
  def validateNotSum(widgets: js.Array[Widget], sum: Integer): ServerHandler = js.native
  def validateNumber(widget: Widget): ServerHandler = js.native
  def validateOptions(widget: Widget, options: js.Array[String]): ServerHandler = js.native
  def validateRange(widget: Widget, min: Double, max: Double): ServerHandler = js.native
  def validateSum(widgets: js.Array[Widget], sum: Integer): ServerHandler = js.native
}

