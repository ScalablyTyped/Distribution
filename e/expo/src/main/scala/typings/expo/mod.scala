package typings.expo

import typings.expo.anon.Data
import typings.expo.anon.Day
import typings.expo.anon.GcmSenderId
import typings.expo.anon.Interval
import typings.expo.anon.IntervalMs
import typings.expo.notificationsTypesMod.ActionType
import typings.expo.notificationsTypesMod.Channel
import typings.expo.notificationsTypesMod.LocalNotification
import typings.expo.notificationsTypesMod.LocalNotificationId
import typings.expo.notificationsTypesMod.Notification
import typings.fbemitter.mod.EventSubscription
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AppLoading ()
    extends typings.expo.appLoadingMod.AppLoading
  
  val DangerZone: typings.expo.dangerZoneMod.DangerZone = js.native
  def apisAreAvailable(): Boolean = js.native
  def registerRootComponent[P](component: ComponentType[P]): Unit = js.native
  @js.native
  object Logs extends js.Object {
    def disableExpoCliLogging(): Unit = js.native
    def enableExpoCliLogging(): Unit = js.native
  }
  
  @js.native
  object Notifications extends js.Object {
    def _setInitialNotification(notification: Notification): Unit = js.native
    def addListener(listener: js.Function1[/* notification */ Notification, _]): EventSubscription = js.native
    def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
    def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = js.native
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType], previewPlaceholder: String): js.Promise[Unit] = js.native
    def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = js.native
    def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = js.native
    def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = js.native
    def dismissAllNotificationsAsync(): js.Promise[Unit] = js.native
    def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    def getBadgeNumberAsync(): js.Promise[Double] = js.native
    def getDevicePushTokenAsync(config: GcmSenderId): js.Promise[Data] = js.native
    def getExpoPushTokenAsync(): js.Promise[String] = js.native
    def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification, options: IntervalMs): js.Promise[LocalNotificationId] = js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Day): js.Promise[String] = js.native
    def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Interval): js.Promise[String] = js.native
    def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  object SplashScreen extends js.Object {
    def hide(): Unit = js.native
    def hideAsync(): js.Promise[Boolean] = js.native
    def preventAutoHide(): Unit = js.native
    def preventAutoHideAsync(): js.Promise[Boolean] = js.native
  }
  
}

