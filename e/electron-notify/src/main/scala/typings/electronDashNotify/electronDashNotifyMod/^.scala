package typings.electronDashNotify.electronDashNotifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def closeAll(): Unit = js.native
  def getTemplatePath(): String = js.native
  def notify(notification: INotification): Unit = js.native
  def setConfig(customConfig: ICustomConfig): Unit = js.native
  def setTemplatePath(path: String): Unit = js.native
}

