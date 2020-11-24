package typings.expo

import typings.expo.anon.Day
import typings.expo.anon.GcmSenderId
import typings.expo.anon.Interval
import typings.expo.anon.IntervalMs
import typings.expo.anon.Type
import typings.expo.expoBooleans.`true`
import typings.expo.notificationsTypesMod.ActionType
import typings.expo.notificationsTypesMod.Channel
import typings.expo.notificationsTypesMod.LocalNotification
import typings.expo.notificationsTypesMod.LocalNotificationId
import typings.expo.notificationsTypesMod.Notification
import typings.expoLinking.anon.Key
import typings.expoLinking.linkingTypesMod.ParsedURL
import typings.expoLinking.linkingTypesMod.QueryParams
import typings.expoLinking.linkingTypesMod.URLListener
import typings.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/deprecated.web", JSImport.Namespace)
@js.native
object deprecatedWebMod extends js.Object {
  
  @js.native
  object Linking extends js.Object {
    
    def addEventListener(`type`: String, handler: URLListener): Unit = js.native
    
    def canOpenURL(url: String): js.Promise[Boolean] = js.native
    
    def getInitialURL(): js.Promise[String | Null] = js.native
    
    def makeUrl(): String = js.native
    def makeUrl(path: js.UndefOr[scala.Nothing], queryParams: QueryParams): String = js.native
    def makeUrl(path: String): String = js.native
    def makeUrl(path: String, queryParams: QueryParams): String = js.native
    
    def openSettings(): js.Promise[Unit] = js.native
    
    def openURL(url: String): js.Promise[`true`] = js.native
    
    def parse(url: String): ParsedURL = js.native
    
    def parseInitialURLAsync(): js.Promise[ParsedURL] = js.native
    
    def removeEventListener(`type`: String, handler: URLListener): Unit = js.native
    
    def sendIntent(action: String): js.Promise[Unit] = js.native
    def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = js.native
    
    def useUrl(): String | Null = js.native
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
    
    def getDevicePushTokenAsync(config: GcmSenderId): js.Promise[Type] = js.native
    
    def getExpoPushTokenAsync(): js.Promise[String] = js.native
    
    def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    
    def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification, options: IntervalMs): js.Promise[LocalNotificationId] = js.native
    
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Day): js.Promise[String] = js.native
    
    def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Interval): js.Promise[String] = js.native
    
    def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
  }
}
