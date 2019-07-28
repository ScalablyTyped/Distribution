package typings.dropboxjs.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.PulledChanges")
@js.native
class PulledChanges () extends js.Object {
  var blankSlate: Boolean = js.native
  var cursorTag: String = js.native
  var shouldBackOff: Boolean = js.native
  var shouldPullAgain: Boolean = js.native
  def cursor(): String = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.PulledChanges")
@js.native
object PulledChanges extends js.Object {
  def parse(deltaInfo: js.Object): PulledChanges = js.native
}

