package typings.expo

import typings.expo.anon.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", JSImport.Namespace)
@js.native
object exponentNotificationsHelperWebMod extends js.Object {
  def getDevicePushTokenAsync(): js.Promise[DataType] = js.native
  def getExponentPushTokenAsync(): js.Promise[String] = js.native
  def guardPermission(): Unit = js.native
}

