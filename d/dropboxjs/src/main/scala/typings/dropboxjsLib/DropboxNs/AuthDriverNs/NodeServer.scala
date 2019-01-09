package typings
package dropboxjsLib.DropboxNs.AuthDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.NodeServer")
@js.native
class NodeServer () extends IAuthDriver {
  def this(options: dropboxjsLib.Anon_Port) = this()
  def authType(): java.lang.String = js.native
  def closeBrowser(response: js.Any): scala.Unit = js.native
  def closeServer(): scala.Unit = js.native
  def createApp(): scala.Unit = js.native
  // TODO check request response types
  def doRequest(request: js.Any, response: js.Any): scala.Unit = js.native
  def openBrowser(url: java.lang.String): scala.Unit = js.native
  def url(): java.lang.String = js.native
}

