package typings.dropboxjs.Dropbox.AuthDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeServer extends IAuthDriver {
  
  def authType(): String = js.native
  
  def closeBrowser(response: js.Any): Unit = js.native
  
  def closeServer(): Unit = js.native
  
  def createApp(): Unit = js.native
  
  // TODO check request response types
  def doRequest(request: js.Any, response: js.Any): Unit = js.native
  
  def openBrowser(url: String): Unit = js.native
  
  def url(): String = js.native
}
