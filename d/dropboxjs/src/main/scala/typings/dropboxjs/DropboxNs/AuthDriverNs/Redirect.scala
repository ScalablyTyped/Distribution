package typings.dropboxjs.DropboxNs.AuthDriverNs

import typings.dropboxjs.Anon_RedirectFile
import typings.dropboxjs.DropboxNs.Client
import typings.dropboxjs.DropboxNs.QueryParamsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.Redirect")
@js.native
class Redirect () extends js.Object {
  def this(options: Anon_RedirectFile) = this()
  def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def url(): String = js.native
}

