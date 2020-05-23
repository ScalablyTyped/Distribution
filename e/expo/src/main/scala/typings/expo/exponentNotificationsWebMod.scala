package typings.expo

import typings.expo.anon.DataType
import typings.expo.anon.IntervalMs
import typings.expo.notificationsTypesMod.LocalNotification
import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def getDevicePushTokenAsync(): js.Promise[DataType] = js.native
    def getExponentPushTokenAsync(): js.Promise[String] = js.native
    def presentLocalNotification(notification: LocalNotification): js.Promise[ReactText] = js.native
    def scheduleLocalNotification(notification: js.Any): js.Promise[String] = js.native
    def scheduleLocalNotification(notification: js.Any, options: IntervalMs): js.Promise[String] = js.native
  }
  
}

