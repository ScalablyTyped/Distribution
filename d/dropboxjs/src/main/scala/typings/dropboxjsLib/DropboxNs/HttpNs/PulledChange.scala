package typings
package dropboxjsLib.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.PulledChange")
@js.native
class PulledChange () extends js.Object {
  var path: java.lang.String = js.native
  var stat: dropboxjsLib.DropboxNs.FileNs.Stat = js.native
  var wasRemoved: scala.Boolean = js.native
}

@JSGlobal("Dropbox.Http.PulledChange")
@js.native
object PulledChange extends js.Object {
  def parse(entry: js.Object): dropboxjsLib.DropboxNs.HttpNs.PulledChange = js.native
}

