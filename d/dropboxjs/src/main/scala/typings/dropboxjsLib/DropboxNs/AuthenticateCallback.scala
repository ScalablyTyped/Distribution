package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Callbacks */
@js.native
trait AuthenticateCallback extends js.Object {
  def apply(err: ApiError, client: Client): scala.Unit = js.native
  def apply(err: AuthError, client: Client): scala.Unit = js.native
}

