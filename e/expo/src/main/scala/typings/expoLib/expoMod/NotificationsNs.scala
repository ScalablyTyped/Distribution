package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Notifications")
@js.native
object NotificationsNs extends js.Object {
  trait ActionType extends js.Object {
    var actionId: java.lang.String
    var buttonTitle: java.lang.String
    var isAuthenticationRequired: js.UndefOr[scala.Boolean] = js.undefined
    var isDestructive: js.UndefOr[scala.Boolean] = js.undefined
    var textInput: js.UndefOr[expoLib.Anon_Placeholder] = js.undefined
  }
  
  trait Channel extends js.Object {
    var badge: js.UndefOr[scala.Boolean] = js.undefined
    var description: js.UndefOr[java.lang.String] = js.undefined
    var name: java.lang.String
    var priority: js.UndefOr[java.lang.String] = js.undefined
    var sound: js.UndefOr[scala.Boolean] = js.undefined
    var vibrate: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  }
  
  trait LocalNotification extends js.Object {
    var android: js.UndefOr[expoLib.Anon_ChannelId] = js.undefined
    var body: js.UndefOr[java.lang.String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var ios: js.UndefOr[expoLib.Anon_SoundBoolean] = js.undefined
    var title: java.lang.String
  }
  
  trait Notification extends js.Object {
    var data: js.Any
    var isMultiple: scala.Boolean
    var origin: expoLib.expoLibStrings.selected | expoLib.expoLibStrings.received
    var remote: scala.Boolean
  }
  
  def addListener(listener: js.Function1[/* notification */ Notification, _]): fbemitterLib.fbemitterMod.EventSubscription = js.native
  /** Cancel all scheduled notifications */
  def cancelAllScheduledNotificationsAsync(): js.Promise[scala.Unit] = js.native
  /** Cancel scheduled notification notification with ID */
  def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[scala.Unit] = js.native
  def createCategoryAsync(categoryId: java.lang.String, actions: js.Array[ActionType]): js.Promise[scala.Unit] = js.native
  def createChannelAndroidAsync(id: java.lang.String, channel: Channel): js.Promise[scala.Unit] = js.native
  def deleteCategoryAsync(categoryId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteChannelAndroidAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Dismiss all currently shown notifications (Android only) */
  def dismissAllNotificationsAsync(): js.Promise[scala.Unit] = js.native
  /** Dismiss currently shown notification with ID (Android only) */
  def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[scala.Unit] = js.native
  def getBadgeNumberAsync(): js.Promise[scala.Double] = js.native
  def getDevicePushTokenAsync(config: expoLib.Anon_GcmSenderId): js.Promise[expoLib.Anon_Data] = js.native
  def getExpoPushTokenAsync(): js.Promise[java.lang.String] = js.native
  /* Shows a notification instantly */
  def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
  /** Schedule a notification at a later date */
  def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
  def scheduleLocalNotificationAsync(notification: LocalNotification, options: expoLib.Anon_Day): js.Promise[LocalNotificationId] = js.native
  def setBadgeNumberAsync(number: scala.Double): js.Promise[scala.Unit] = js.native
  type LocalNotificationId = java.lang.String | scala.Double
}

