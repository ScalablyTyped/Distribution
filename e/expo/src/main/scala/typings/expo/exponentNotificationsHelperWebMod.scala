package typings.expo

import typings.expo.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentNotificationsHelperWebMod {
  
  @JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", "getDevicePushTokenAsync")
  @js.native
  def getDevicePushTokenAsync(): js.Promise[Data] = js.native
  
  @JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", "getExponentPushTokenAsync")
  @js.native
  def getExponentPushTokenAsync(): js.Promise[String] = js.native
  
  @JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", "guardPermission")
  @js.native
  def guardPermission(): Unit = js.native
}
