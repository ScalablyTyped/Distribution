package typings.googleDashAppsDashScript.GoogleAppsScriptNs.HTMLNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.BlobSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlService extends js.Object {
  var SandboxMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SandboxMode */ js.Any = js.native
  var XFrameOptionsMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof XFrameOptionsMode */ js.Any = js.native
  def createHtmlOutput(): HtmlOutput = js.native
  def createHtmlOutput(blob: BlobSource): HtmlOutput = js.native
  def createHtmlOutput(html: String): HtmlOutput = js.native
  def createHtmlOutputFromFile(filename: String): HtmlOutput = js.native
  def createTemplate(blob: BlobSource): HtmlTemplate = js.native
  def createTemplate(html: String): HtmlTemplate = js.native
  def createTemplateFromFile(filename: String): HtmlTemplate = js.native
  def getUserAgent(): String = js.native
}

