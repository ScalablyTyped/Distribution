package typings
package dropboxjsLib.DropboxNs.UtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Util.EventSource")
@js.native
class EventSource protected () extends js.Object {
  def this(options: dropboxjsLib.Anon_Cancelable) = this()
  def addListener(listener: js.Function1[/* event */ js.Any, scala.Unit]): EventSource = js.native
  def dispatch(event: js.Object): scala.Boolean = js.native
  def removeListener(listener: js.Function1[/* event */ js.Any, scala.Unit]): EventSource = js.native
}

