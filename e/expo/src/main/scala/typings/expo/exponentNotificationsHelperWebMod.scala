package typings.expo

import typings.expo.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", JSImport.Namespace)
@js.native
object exponentNotificationsHelperWebMod extends js.Object {
  def getDevicePushTokenAsync(): js.Promise[Type] = js.native
  def getExponentPushTokenAsync(): js.Promise[String] = js.native
  def guardPermission(): Unit = js.native
}

