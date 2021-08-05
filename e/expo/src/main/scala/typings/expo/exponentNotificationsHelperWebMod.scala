package typings.expo

import typings.expo.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentNotificationsHelperWebMod {
  
  @JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDevicePushTokenAsync(): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicePushTokenAsync")().asInstanceOf[js.Promise[Data]]
  
  inline def getExponentPushTokenAsync(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExponentPushTokenAsync")().asInstanceOf[js.Promise[String]]
  
  inline def guardPermission(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("guardPermission")().asInstanceOf[Unit]
}
