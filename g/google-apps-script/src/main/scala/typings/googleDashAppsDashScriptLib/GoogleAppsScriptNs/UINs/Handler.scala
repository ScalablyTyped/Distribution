package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler extends js.Object {
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def setId(id: java.lang.String): Handler = js.native
  def setTag(tag: java.lang.String): Handler = js.native
  def validateEmail(widget: Widget): Handler = js.native
  def validateInteger(widget: Widget): Handler = js.native
  def validateLength(
    widget: Widget,
    min: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Handler = js.native
  def validateMatches(widget: Widget, pattern: java.lang.String): Handler = js.native
  def validateMatches(widget: Widget, pattern: java.lang.String, flags: java.lang.String): Handler = js.native
  def validateNotEmail(widget: Widget): Handler = js.native
  def validateNotInteger(widget: Widget): Handler = js.native
  def validateNotLength(
    widget: Widget,
    min: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Handler = js.native
  def validateNotMatches(widget: Widget, pattern: java.lang.String): Handler = js.native
  def validateNotMatches(widget: Widget, pattern: java.lang.String, flags: java.lang.String): Handler = js.native
  def validateNotNumber(widget: Widget): Handler = js.native
  def validateNotOptions(widget: Widget, options: js.Array[java.lang.String]): Handler = js.native
  def validateNotRange(widget: Widget, min: scala.Double, max: scala.Double): Handler = js.native
  def validateNotSum(widgets: js.Array[Widget], sum: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Handler = js.native
  def validateNumber(widget: Widget): Handler = js.native
  def validateOptions(widget: Widget, options: js.Array[java.lang.String]): Handler = js.native
  def validateRange(widget: Widget, min: scala.Double, max: scala.Double): Handler = js.native
  def validateSum(widgets: js.Array[Widget], sum: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Handler = js.native
}

