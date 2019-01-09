package typings
package dropboxjsLib.DropboxNs.AuthDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.Redirect")
@js.native
class Redirect () extends js.Object {
  def this(options: dropboxjsLib.Anon_RedirectFile) = this()
  def doAuthorize(authUrl: java.lang.String, stateParam: java.lang.String, client: dropboxjsLib.DropboxNs.Client): scala.Unit = js.native
  def resumeAuthorize(
    stateParam: java.lang.String,
    client: dropboxjsLib.DropboxNs.Client,
    callback: dropboxjsLib.DropboxNs.QueryParamsCallback
  ): scala.Unit = js.native
  def url(): java.lang.String = js.native
}

