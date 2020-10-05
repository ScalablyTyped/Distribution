package typings.expo

import typings.expo.anon.IntervalMs
import typings.expo.anon.Type
import typings.expo.notificationsTypesMod.LocalNotification
import typings.expo.notificationsTypesMod.LocalNotificationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/Notifications/ExponentNotifications.web", JSImport.Namespace)
@js.native
object exponentNotificationsWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
    def cancelScheduledNotificationAsync(notificationId: String): js.Promise[Unit] = js.native
    def dismissAllNotifications(): js.Promise[Unit] = js.native
    def dismissNotification(): js.Promise[Unit] = js.native
    def dismissNotification(notificationId: String): js.Promise[Unit] = js.native
    def getBadgeNumberAsync(): js.Promise[Double] = js.native
    def getDevicePushTokenAsync(): js.Promise[Type] = js.native
    def getExponentPushTokenAsync(): js.Promise[String] = js.native
    def presentLocalNotification(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    def scheduleLocalNotification(notification: js.Any): js.Promise[String] = js.native
    def scheduleLocalNotification(notification: js.Any, options: IntervalMs): js.Promise[String] = js.native
    def setBadgeNumberAsync(badgeNumber: Double): js.Promise[Unit] = js.native
  }
  
}

