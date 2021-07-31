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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedWebMod {
  
  object Linking {
    
    @JSImport("expo/build/deprecated.web", "Linking")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addEventListener(`type`: String, handler: URLListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def canOpenURL(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canOpenURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getInitialURL(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialURL")().asInstanceOf[js.Promise[String | Null]]
    
    @scala.inline
    def makeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")().asInstanceOf[String]
    @scala.inline
    def makeUrl(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def makeUrl(path: String, queryParams: QueryParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")(path.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def makeUrl(path: Unit, queryParams: QueryParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")(path.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def openSettings(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSettings")().asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def openURL(url: String): js.Promise[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true`]]
    
    @scala.inline
    def parse(url: String): ParsedURL = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[ParsedURL]
    
    @scala.inline
    def parseInitialURLAsync(): js.Promise[ParsedURL] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInitialURLAsync")().asInstanceOf[js.Promise[ParsedURL]]
    
    @scala.inline
    def removeEventListener(`type`: String, handler: URLListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def sendIntent(action: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendIntent")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendIntent")(action.asInstanceOf[js.Any], extras.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def useUrl(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useUrl")().asInstanceOf[String | Null]
  }
  
  object Notifications {
    
    @JSImport("expo/build/deprecated.web", "Notifications")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addListener(listener: js.Function1[/* notification */ Notification, js.Any]): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(listener.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
    
    @scala.inline
    def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAllScheduledNotificationsAsync")().asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelScheduledNotificationAsync")(notificationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCategoryAsync")(categoryId.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType], previewPlaceholder: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCategoryAsync")(categoryId.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], previewPlaceholder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createChannelAndroidAsync")(id.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCategoryAsync")(categoryId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteChannelAndroidAsync")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def dismissAllNotificationsAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAllNotificationsAsync")().asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotificationAsync")(notificationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def getBadgeNumberAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeNumberAsync")().asInstanceOf[js.Promise[Double]]
    
    @scala.inline
    def getDevicePushTokenAsync(config: GcmSenderId): js.Promise[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicePushTokenAsync")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Type]]
    
    @scala.inline
    def getExpoPushTokenAsync(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpoPushTokenAsync")().asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = ^.asInstanceOf[js.Dynamic].applyDynamic("presentLocalNotificationAsync")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalNotificationId]]
    
    @scala.inline
    def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleLocalNotificationAsync")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalNotificationId]]
    @scala.inline
    def scheduleLocalNotificationAsync(notification: LocalNotification, options: IntervalMs): js.Promise[LocalNotificationId] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleLocalNotificationAsync")(notification.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LocalNotificationId]]
    
    @scala.inline
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleNotificationWithCalendarAsync")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    @scala.inline
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Day): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleNotificationWithCalendarAsync")(notification.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Interval): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleNotificationWithTimerAsync")(notification.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def setBadgeNumberAsync(number: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeNumberAsync")(number.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def setInitialNotification(notification: Notification): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setInitialNotification")(notification.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
