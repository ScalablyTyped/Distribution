package typings.electron.mod

import typings.electron.Electron.NotificationConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "Notification")
@js.native
/**
  * Notification
  */
class Notification ()
  extends typings.electron.Electron.Notification {
  def this(options: NotificationConstructorOptions) = this()
}
object Notification {
  
  @JSImport("electron", "Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Whether or not desktop notifications are supported on the current system
    */
  /* static member */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
