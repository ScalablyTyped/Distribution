package typings.dropboxjs.DropboxNs.AuthDriverNs

import typings.dropboxjs.DropboxNs.Client
import typings.dropboxjs.DropboxNs.QueryParamsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
@JSGlobal("Dropbox.AuthDriver.IAuthDriver")
@js.native
class IAuthDriver () extends js.Object {
  def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
}

