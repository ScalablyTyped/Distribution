package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlService extends js.Object {
  var SandboxMode: js.Any = js.native
  var XFrameOptionsMode: js.Any = js.native
  def createHtmlOutput(): HtmlOutput = js.native
  def createHtmlOutput(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): HtmlOutput = js.native
  def createHtmlOutput(html: java.lang.String): HtmlOutput = js.native
  def createHtmlOutputFromFile(filename: java.lang.String): HtmlOutput = js.native
  def createTemplate(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): HtmlTemplate = js.native
  def createTemplate(html: java.lang.String): HtmlTemplate = js.native
  def createTemplateFromFile(filename: java.lang.String): HtmlTemplate = js.native
  def getUserAgent(): java.lang.String = js.native
}

