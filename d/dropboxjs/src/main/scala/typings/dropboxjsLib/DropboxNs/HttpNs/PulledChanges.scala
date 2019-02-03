package typings
package dropboxjsLib.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.PulledChanges")
@js.native
class PulledChanges () extends js.Object {
  var blankSlate: scala.Boolean = js.native
  var cursorTag: java.lang.String = js.native
  var shouldBackOff: scala.Boolean = js.native
  var shouldPullAgain: scala.Boolean = js.native
  def cursor(): java.lang.String = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.PulledChanges")
@js.native
object PulledChanges extends js.Object {
  def parse(deltaInfo: js.Object): dropboxjsLib.DropboxNs.HttpNs.PulledChanges = js.native
}

