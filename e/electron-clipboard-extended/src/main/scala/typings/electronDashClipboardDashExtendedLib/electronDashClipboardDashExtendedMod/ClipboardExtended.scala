package typings
package electronDashClipboardDashExtendedLib.electronDashClipboardDashExtendedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardExtended
  extends electronLib.ElectronNs.Clipboard {
  def off(event: java.lang.String): scala.Unit = js.native
  def off(event: java.lang.String, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  def startWatching(): scala.Unit = js.native
  def stopWatching(): scala.Unit = js.native
}

