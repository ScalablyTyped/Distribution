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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedWebMod {
  
  object Linking {
    
    @JSImport("expo/build/deprecated.web", "Linking.addEventListener")
    @js.native
    def addEventListener(`type`: String, handler: URLListener): Unit = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.canOpenURL")
    @js.native
    def canOpenURL(url: String): js.Promise[Boolean] = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.getInitialURL")
    @js.native
    def getInitialURL(): js.Promise[String | Null] = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.makeUrl")
    @js.native
    def makeUrl(): String = js.native
    @JSImport("expo/build/deprecated.web", "Linking.makeUrl")
    @js.native
    def makeUrl(path: js.UndefOr[scala.Nothing], queryParams: QueryParams): String = js.native
    @JSImport("expo/build/deprecated.web", "Linking.makeUrl")
    @js.native
    def makeUrl(path: String): String = js.native
    @JSImport("expo/build/deprecated.web", "Linking.makeUrl")
    @js.native
    def makeUrl(path: String, queryParams: QueryParams): String = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.openSettings")
    @js.native
    def openSettings(): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.openURL")
    @js.native
    def openURL(url: String): js.Promise[`true`] = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.parse")
    @js.native
    def parse(url: String): ParsedURL = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.parseInitialURLAsync")
    @js.native
    def parseInitialURLAsync(): js.Promise[ParsedURL] = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.removeEventListener")
    @js.native
    def removeEventListener(`type`: String, handler: URLListener): Unit = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.sendIntent")
    @js.native
    def sendIntent(action: String): js.Promise[Unit] = js.native
    @JSImport("expo/build/deprecated.web", "Linking.sendIntent")
    @js.native
    def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Linking.useUrl")
    @js.native
    def useUrl(): String | Null = js.native
  }
  
  object Notifications {
    
    @JSImport("expo/build/deprecated.web", "Notifications.addListener")
    @js.native
    def addListener(listener: js.Function1[/* notification */ Notification, _]): EventSubscription = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.cancelAllScheduledNotificationsAsync")
    @js.native
    def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.cancelScheduledNotificationAsync")
    @js.native
    def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.createCategoryAsync")
    @js.native
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = js.native
    @JSImport("expo/build/deprecated.web", "Notifications.createCategoryAsync")
    @js.native
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType], previewPlaceholder: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.createChannelAndroidAsync")
    @js.native
    def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.deleteCategoryAsync")
    @js.native
    def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.deleteChannelAndroidAsync")
    @js.native
    def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.dismissAllNotificationsAsync")
    @js.native
    def dismissAllNotificationsAsync(): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.dismissNotificationAsync")
    @js.native
    def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.getBadgeNumberAsync")
    @js.native
    def getBadgeNumberAsync(): js.Promise[Double] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.getDevicePushTokenAsync")
    @js.native
    def getDevicePushTokenAsync(config: GcmSenderId): js.Promise[Type] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.getExpoPushTokenAsync")
    @js.native
    def getExpoPushTokenAsync(): js.Promise[String] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.presentLocalNotificationAsync")
    @js.native
    def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.scheduleLocalNotificationAsync")
    @js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    @JSImport("expo/build/deprecated.web", "Notifications.scheduleLocalNotificationAsync")
    @js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification, options: IntervalMs): js.Promise[LocalNotificationId] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.scheduleNotificationWithCalendarAsync")
    @js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = js.native
    @JSImport("expo/build/deprecated.web", "Notifications.scheduleNotificationWithCalendarAsync")
    @js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Day): js.Promise[String] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.scheduleNotificationWithTimerAsync")
    @js.native
    def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Interval): js.Promise[String] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications.setBadgeNumberAsync")
    @js.native
    def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/deprecated.web", "Notifications._setInitialNotification")
    @js.native
    def setInitialNotification(notification: Notification): Unit = js.native
  }
}
