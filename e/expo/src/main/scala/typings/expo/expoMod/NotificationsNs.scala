package typings.expo.expoMod

import typings.expo.Anon_ChannelId
import typings.expo.Anon_Data
import typings.expo.Anon_Day
import typings.expo.Anon_GcmSenderId
import typings.expo.Anon_Placeholder
import typings.expo.Anon_SoundBoolean
import typings.expo.expoMod.NotificationsNs.ActionType
import typings.expo.expoMod.NotificationsNs.Channel
import typings.expo.expoMod.NotificationsNs.LocalNotification
import typings.expo.expoMod.NotificationsNs.LocalNotificationId
import typings.expo.expoMod.NotificationsNs.Notification
import typings.expo.expoStrings.received
import typings.expo.expoStrings.selected
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Notifications")
@js.native
object NotificationsNs extends js.Object {
  trait ActionType extends js.Object {
    var actionId: String
    var buttonTitle: String
    var isAuthenticationRequired: js.UndefOr[Boolean] = js.undefined
    var isDestructive: js.UndefOr[Boolean] = js.undefined
    var textInput: js.UndefOr[Anon_Placeholder] = js.undefined
  }
  
  trait Channel extends js.Object {
    var badge: js.UndefOr[Boolean] = js.undefined
    var description: js.UndefOr[String] = js.undefined
    var name: String
    var priority: js.UndefOr[String] = js.undefined
    var sound: js.UndefOr[Boolean] = js.undefined
    var vibrate: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  }
  
  trait LocalNotification extends js.Object {
    var android: js.UndefOr[Anon_ChannelId] = js.undefined
    var body: js.UndefOr[String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var ios: js.UndefOr[Anon_SoundBoolean] = js.undefined
    var title: String
  }
  
  trait Notification extends js.Object {
    var data: js.Any
    var isMultiple: Boolean
    var origin: selected | received
    var remote: Boolean
  }
  
  def addListener(listener: js.Function1[/* notification */ Notification, _]): EventSubscription = js.native
  /** Cancel all scheduled notifications */
  def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
  /** Cancel scheduled notification notification with ID */
  def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
  def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = js.native
  def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = js.native
  def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = js.native
  def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = js.native
  /** Dismiss all currently shown notifications (Android only) */
  def dismissAllNotificationsAsync(): js.Promise[Unit] = js.native
  /** Dismiss currently shown notification with ID (Android only) */
  def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
  def getBadgeNumberAsync(): js.Promise[Double] = js.native
  def getDevicePushTokenAsync(config: Anon_GcmSenderId): js.Promise[Anon_Data] = js.native
  def getExpoPushTokenAsync(): js.Promise[String] = js.native
  /* Shows a notification instantly */
  def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
  /** Schedule a notification at a later date */
  def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
  def scheduleLocalNotificationAsync(notification: LocalNotification, options: Anon_Day): js.Promise[LocalNotificationId] = js.native
  def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
  type LocalNotificationId = String | Double
}

