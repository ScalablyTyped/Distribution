package typings.electron.global.Electron

import typings.electron.Electron.NotificationConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSGlobal("Electron.Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Whether or not desktop notifications are supported on the current system
    */
  /* static member */
  @scala.inline
  def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
