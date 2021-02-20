package typings.expo

import typings.expo.anon.Data
import typings.expo.anon.IntervalMs
import typings.expo.notificationsTypesMod.LocalNotification
import typings.expo.notificationsTypesMod.LocalNotificationId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentNotificationsWebMod {
  
  object default {
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.cancelAllScheduledNotificationsAsync")
    @js.native
    def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.cancelScheduledNotificationAsync")
    @js.native
    def cancelScheduledNotificationAsync(notificationId: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.dismissAllNotifications")
    @js.native
    def dismissAllNotifications(): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.dismissNotification")
    @js.native
    def dismissNotification(): js.Promise[Unit] = js.native
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.dismissNotification")
    @js.native
    def dismissNotification(notificationId: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.getBadgeNumberAsync")
    @js.native
    def getBadgeNumberAsync(): js.Promise[Double] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.getDevicePushTokenAsync")
    @js.native
    def getDevicePushTokenAsync(): js.Promise[Data] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.getExponentPushTokenAsync")
    @js.native
    def getExponentPushTokenAsync(): js.Promise[String] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.presentLocalNotification")
    @js.native
    def presentLocalNotification(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.scheduleLocalNotification")
    @js.native
    def scheduleLocalNotification(notification: js.Any): js.Promise[String] = js.native
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.scheduleLocalNotification")
    @js.native
    def scheduleLocalNotification(notification: js.Any, options: IntervalMs): js.Promise[String] = js.native
    
    @JSImport("expo/build/Notifications/ExponentNotifications.web", "default.setBadgeNumberAsync")
    @js.native
    def setBadgeNumberAsync(badgeNumber: Double): js.Promise[Unit] = js.native
  }
}
