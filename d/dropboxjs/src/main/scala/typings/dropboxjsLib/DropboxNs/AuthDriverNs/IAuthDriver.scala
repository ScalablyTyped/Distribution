package typings
package dropboxjsLib.DropboxNs.AuthDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
@JSGlobal("Dropbox.AuthDriver.IAuthDriver")
@js.native
class IAuthDriver () extends js.Object {
  def doAuthorize(authUrl: java.lang.String, stateParam: java.lang.String, client: dropboxjsLib.DropboxNs.Client): scala.Unit = js.native
  def doAuthorize(
    authUrl: java.lang.String,
    stateParam: java.lang.String,
    client: dropboxjsLib.DropboxNs.Client,
    callback: dropboxjsLib.DropboxNs.QueryParamsCallback
  ): scala.Unit = js.native
}

