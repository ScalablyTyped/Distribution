package typings.expo.mod

import typings.expo.AnonData
import typings.expo.AnonDay
import typings.expo.AnonGcmSenderId
import typings.expo.AnonInterval
import typings.expo.AnonIntervalMs
import typings.expo.notificationsTypesMod.ActionType
import typings.expo.notificationsTypesMod.Channel
import typings.expo.notificationsTypesMod.LocalNotification
import typings.expo.notificationsTypesMod.Notification
import typings.fbemitter.mod.EventSubscription
import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Notifications")
@js.native
object Notifications extends js.Object {
  def _setInitialNotification(notification: Notification): Unit = js.native
  def addListener(listener: js.Function1[/* notification */ Notification, _]): EventSubscription = js.native
  def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
  def cancelScheduledNotificationAsync(notificationId: ReactText): js.Promise[Unit] = js.native
  def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = js.native
  def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = js.native
  def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = js.native
  def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = js.native
  def dismissAllNotificationsAsync(): js.Promise[Unit] = js.native
  def dismissNotificationAsync(notificationId: ReactText): js.Promise[Unit] = js.native
  def getBadgeNumberAsync(): js.Promise[Double] = js.native
  def getDevicePushTokenAsync(config: AnonGcmSenderId): js.Promise[AnonData] = js.native
  def getExpoPushTokenAsync(): js.Promise[String] = js.native
  def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[ReactText] = js.native
  def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[ReactText] = js.native
  def scheduleLocalNotificationAsync(notification: LocalNotification, options: AnonIntervalMs): js.Promise[ReactText] = js.native
  def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = js.native
  def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: AnonDay): js.Promise[String] = js.native
  def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: AnonInterval): js.Promise[String] = js.native
  def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
}

