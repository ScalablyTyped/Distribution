package typings.googleAppsScript.GoogleAppsScript.Content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service for returning text content from a script.
  *
  * You can serve up text in various forms. For example, publish this script as a web app.
  *
  *     function doGet() {
  *       return ContentService.createTextOutput("Hello World");
  *     }
  */
@js.native
trait ContentService extends js.Object {
  
  var MimeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MimeType */ js.Any = js.native
  
  def createTextOutput(): TextOutput = js.native
  def createTextOutput(content: String): TextOutput = js.native
}
