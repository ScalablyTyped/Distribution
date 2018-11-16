package typings
package dropboxjsLib.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.PollResult")
@js.native
class PollResult () extends js.Object {
  var hasChanges: scala.Boolean = js.native
  var retryAfter: scala.Double = js.native
}

@JSGlobal("Dropbox.Http.PollResult")
@js.native
object PollResult extends js.Object {
  def parse(response: js.Object): dropboxjsLib.DropboxNs.HttpNs.PollResult = js.native
}

