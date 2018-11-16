package typings
package electronDashNotifyLib.electronDashNotifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notify", JSImport.Namespace)
@js.native
object electronDashNotifyModMembers extends js.Object {
  def closeAll(): scala.Unit = js.native
  def getTemplatePath(): java.lang.String = js.native
  def notify(notification: INotification): scala.Unit = js.native
  def setConfig(customConfig: ICustomConfig): scala.Unit = js.native
  def setTemplatePath(path: java.lang.String): scala.Unit = js.native
}

