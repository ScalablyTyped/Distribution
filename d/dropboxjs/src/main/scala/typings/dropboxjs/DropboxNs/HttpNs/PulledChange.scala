package typings.dropboxjs.DropboxNs.HttpNs

import typings.dropboxjs.DropboxNs.FileNs.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.PulledChange")
@js.native
class PulledChange () extends js.Object {
  var path: String = js.native
  var stat: Stat = js.native
  var wasRemoved: Boolean = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.PulledChange")
@js.native
object PulledChange extends js.Object {
  def parse(entry: js.Object): PulledChange = js.native
}

