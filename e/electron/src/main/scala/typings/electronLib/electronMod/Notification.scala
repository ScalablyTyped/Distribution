package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Notification")
@js.native
class Notification protected ()
  extends electronLib.ElectronNs.Notification {
  def this(options: electronLib.ElectronNs.NotificationConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "Notification")
@js.native
object Notification extends js.Object {
  def isSupported(): scala.Boolean = js.native
}

