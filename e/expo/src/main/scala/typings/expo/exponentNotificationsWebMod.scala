package typings.expo

import typings.expo.anon.Data
import typings.expo.anon.IntervalMs
import typings.expo.notificationsTypesMod.LocalNotification
import typings.expo.notificationsTypesMod.LocalNotificationId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentNotificationsWebMod {
  
  object default {
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAllScheduledNotificationsAsync")().asInstanceOf[js.Promise[Unit]]
    
    inline def cancelScheduledNotificationAsync(notificationId: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelScheduledNotificationAsync")(notificationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def dismissAllNotifications(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAllNotifications")().asInstanceOf[js.Promise[Unit]]
    
    inline def dismissNotification(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotification")().asInstanceOf[js.Promise[Unit]]
    inline def dismissNotification(notificationId: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotification")(notificationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def getBadgeNumberAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeNumberAsync")().asInstanceOf[js.Promise[Double]]
    
    inline def getDevicePushTokenAsync(): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicePushTokenAsync")().asInstanceOf[js.Promise[Data]]
    
    inline def getExponentPushTokenAsync(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExponentPushTokenAsync")().asInstanceOf[js.Promise[String]]
    
    inline def presentLocalNotification(notification: LocalNotification): js.Promise[LocalNotificationId] = ^.asInstanceOf[js.Dynamic].applyDynamic("presentLocalNotification")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalNotificationId]]
    
    inline def scheduleLocalNotification(notification: js.Any): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleLocalNotification")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def scheduleLocalNotification(notification: js.Any, options: IntervalMs): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleLocalNotification")(notification.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def setBadgeNumberAsync(badgeNumber: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeNumberAsync")(badgeNumber.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
}
