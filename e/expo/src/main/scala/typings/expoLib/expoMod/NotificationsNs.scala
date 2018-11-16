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
  def cancelAllScheduledNotificationsAsync(): stdLib.Promise[scala.Unit] = js.native
  def cancelScheduledNotificationAsync(localNotificationId: LocalNotificationId): stdLib.Promise[scala.Unit] = js.native
  def dismissAllNotificationsAsync(): stdLib.Promise[scala.Unit] = js.native
  def dismissNotificationAsync(localNotificationId: LocalNotificationId): stdLib.Promise[scala.Unit] = js.native
  def getBadgeNumberAsync(): stdLib.Promise[scala.Double] = js.native
  def getExpoPushTokenAsync(): stdLib.Promise[java.lang.String] = js.native
  def presentLocalNotificationAsync(localNotification: LocalNotification): stdLib.Promise[LocalNotificationId] = js.native
  def scheduleLocalNotificationAsync(localNotification: LocalNotification, schedulingOptions: expoLib.Anon_Repeat): stdLib.Promise[LocalNotificationId] = js.native
  def setBadgeNumberAsync(number: scala.Double): stdLib.Promise[scala.Unit] = js.native
  type LocalNotificationId = java.lang.String | scala.Double
}

