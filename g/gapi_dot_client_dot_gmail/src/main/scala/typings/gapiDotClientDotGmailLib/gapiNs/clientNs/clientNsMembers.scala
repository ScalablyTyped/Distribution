package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val users: gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs.UsersResource = js.native
  /** Load Gmail API v1 */
  def load(
    name: gapiDotClientDotGmailLib.gapiDotClientDotGmailLibStrings.gmail,
    version: gapiDotClientDotGmailLib.gapiDotClientDotGmailLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotGmailLib.gapiDotClientDotGmailLibStrings.gmail,
    version: gapiDotClientDotGmailLib.gapiDotClientDotGmailLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

