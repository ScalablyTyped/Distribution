package typings.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.Electron.Notification
import typings.electron.Electron.NotificationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofNotification
  extends Instantiable0[Notification]
     with Instantiable1[/* options */ NotificationConstructorOptions, Notification] {
  /**
    * Whether or not desktop notifications are supported on the current system
    */
  def isSupported(): Boolean = js.native
}

