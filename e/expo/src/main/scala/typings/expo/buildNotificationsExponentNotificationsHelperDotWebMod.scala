package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", JSImport.Namespace)
@js.native
object buildNotificationsExponentNotificationsHelperDotWebMod extends js.Object {
  def getDevicePushTokenAsync(): js.Promise[Anon_DataType] = js.native
  def getExponentPushTokenAsync(): js.Promise[String] = js.native
  def guardPermission(): Unit = js.native
}

