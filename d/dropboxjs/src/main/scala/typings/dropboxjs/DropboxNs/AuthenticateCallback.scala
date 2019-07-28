package typings.dropboxjs.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Callbacks */
@js.native
trait AuthenticateCallback extends js.Object {
  def apply(err: ApiError, client: Client): Unit = js.native
  def apply(err: AuthError, client: Client): Unit = js.native
}

