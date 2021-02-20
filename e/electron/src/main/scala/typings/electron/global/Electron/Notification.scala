package typings.electron.global.Electron

import typings.electron.Electron.NotificationConstructorOptions
import org.scalablytyped.runtime.StObject
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
object Notification {
  
  /**
    * Whether or not desktop notifications are supported on the current system
    */
  /* static member */
  @JSGlobal("Electron.Notification.isSupported")
  @js.native
  def isSupported(): Boolean = js.native
}
