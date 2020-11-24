package typings.googleAppsScript.GoogleAppsScript.HTML

import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service for returning HTML and other text content from a script.
  *
  * Due to security considerations, scripts cannot directly return content to a browser. Instead,
  * they must sanitize the HTML so that it cannot perform malicious actions. See the description of
  * HtmlOutput for what limitations this implies on what can be returned.
  */
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
