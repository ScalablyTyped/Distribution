package typings.dropboxjs.DropboxNs.UtilNs

import typings.dropboxjs.Anon_Cancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Util.EventSource")
@js.native
class EventSource protected () extends js.Object {
  def this(options: Anon_Cancelable) = this()
  def addListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource = js.native
  def dispatch(event: js.Object): Boolean = js.native
  def removeListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource = js.native
}

