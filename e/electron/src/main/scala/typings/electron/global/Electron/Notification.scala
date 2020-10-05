package typings.electron.global.Electron

import typings.electron.Electron.NotificationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.Notification")
@js.native
/**
  * Notification
  */
class Notification ()
  extends typings.electron.Electron.Notification {
  def this(options: NotificationConstructorOptions) = this()
}

/* static members */
@JSGlobal("Electron.Notification")
@js.native
object Notification extends js.Object {
  /**
    * Whether or not desktop notifications are supported on the current system
    */
  def isSupported(): Boolean = js.native
}

