package typings.electron.mod

import typings.electron.Electron.NotificationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Notification")
@js.native
class Notification protected ()
  extends typings.electron.Electron.Notification {
  def this(options: NotificationConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "Notification")
@js.native
object Notification extends js.Object {
  def isSupported(): Boolean = js.native
}

