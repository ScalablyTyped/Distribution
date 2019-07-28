package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler extends js.Object {
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setId(id: String): Handler = js.native
  def setTag(tag: String): Handler = js.native
  def validateEmail(widget: Widget): Handler = js.native
  def validateInteger(widget: Widget): Handler = js.native
  def validateLength(widget: Widget, min: Integer, max: Integer): Handler = js.native
  def validateMatches(widget: Widget, pattern: String): Handler = js.native
  def validateMatches(widget: Widget, pattern: String, flags: String): Handler = js.native
  def validateNotEmail(widget: Widget): Handler = js.native
  def validateNotInteger(widget: Widget): Handler = js.native
  def validateNotLength(widget: Widget, min: Integer, max: Integer): Handler = js.native
  def validateNotMatches(widget: Widget, pattern: String): Handler = js.native
  def validateNotMatches(widget: Widget, pattern: String, flags: String): Handler = js.native
  def validateNotNumber(widget: Widget): Handler = js.native
  def validateNotOptions(widget: Widget, options: js.Array[String]): Handler = js.native
  def validateNotRange(widget: Widget, min: Double, max: Double): Handler = js.native
  def validateNotSum(widgets: js.Array[Widget], sum: Integer): Handler = js.native
  def validateNumber(widget: Widget): Handler = js.native
  def validateOptions(widget: Widget, options: js.Array[String]): Handler = js.native
  def validateRange(widget: Widget, min: Double, max: Double): Handler = js.native
  def validateSum(widgets: js.Array[Widget], sum: Integer): Handler = js.native
}

