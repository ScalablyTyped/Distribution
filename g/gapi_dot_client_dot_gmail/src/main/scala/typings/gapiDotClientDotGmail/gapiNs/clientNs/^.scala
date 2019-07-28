package typings.gapiDotClientDotGmail.gapiNs.clientNs

import typings.gapiDotClientDotGmail.gapiDotClientDotGmailStrings.gmail
import typings.gapiDotClientDotGmail.gapiDotClientDotGmailStrings.v1
import typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs.UsersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val users: UsersResource = js.native
  /** Load Gmail API v1 */
  def load(name: gmail, version: v1): js.Thenable[Unit] = js.native
  def load(name: gmail, version: v1, callback: js.Function0[_]): Unit = js.native
}

