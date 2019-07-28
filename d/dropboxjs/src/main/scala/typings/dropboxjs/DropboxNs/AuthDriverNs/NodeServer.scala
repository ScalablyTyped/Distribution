package typings.dropboxjs.DropboxNs.AuthDriverNs

import typings.dropboxjs.Anon_Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.NodeServer")
@js.native
class NodeServer () extends IAuthDriver {
  def this(options: Anon_Port) = this()
  def authType(): String = js.native
  def closeBrowser(response: js.Any): Unit = js.native
  def closeServer(): Unit = js.native
  def createApp(): Unit = js.native
  // TODO check request response types
  def doRequest(request: js.Any, response: js.Any): Unit = js.native
  def openBrowser(url: String): Unit = js.native
  def url(): String = js.native
}

