package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Notifications")
@js.native
object NotificationsNs extends js.Object {
  
  trait LocalNotification extends js.Object {
    var android: js.UndefOr[expoLib.Anon_Priority] = js.undefined
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
  def cancelAllScheduledNotificationsAsync(): js.Promise[scala.Unit] = js.native
  def cancelScheduledNotificationAsync(localNotificationId: LocalNotificationId): js.Promise[scala.Unit] = js.native
  def dismissAllNotificationsAsync(): js.Promise[scala.Unit] = js.native
  def dismissNotificationAsync(localNotificationId: LocalNotificationId): js.Promise[scala.Unit] = js.native
  def getBadgeNumberAsync(): js.Promise[scala.Double] = js.native
  def getExpoPushTokenAsync(): js.Promise[java.lang.String] = js.native
  def presentLocalNotificationAsync(localNotification: LocalNotification): js.Promise[LocalNotificationId] = js.native
  def scheduleLocalNotificationAsync(localNotification: LocalNotification, schedulingOptions: expoLib.Anon_Repeat): js.Promise[LocalNotificationId] = js.native
  def setBadgeNumberAsync(number: scala.Double): js.Promise[scala.Unit] = js.native
  type LocalNotificationId = java.lang.String | scala.Double
}

