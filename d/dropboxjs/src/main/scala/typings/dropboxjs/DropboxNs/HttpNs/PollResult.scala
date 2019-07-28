package typings.dropboxjs.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.PollResult")
@js.native
class PollResult () extends js.Object {
  var hasChanges: Boolean = js.native
  var retryAfter: Double = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.PollResult")
@js.native
object PollResult extends js.Object {
  def parse(response: js.Object): PollResult = js.native
}

