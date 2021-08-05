package typings.expo

import typings.expo.anon.Day
import typings.expo.anon.GcmSenderId
import typings.expo.anon.Interval
import typings.expo.anon.IntervalMs
import typings.expo.anon.Type
import typings.expo.notificationsTypesMod.ActionType
import typings.expo.notificationsTypesMod.Channel
import typings.expo.notificationsTypesMod.LocalNotification
import typings.expo.notificationsTypesMod.LocalNotificationId
import typings.expo.notificationsTypesMod.Notification
import typings.fbemitter.mod.EventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @JSImport("expo/build/Notifications/Notifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("expo/build/Notifications/Notifications", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addListener(listener: js.Function1[/* notification */ Notification, js.Any]): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(listener.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
    
    inline def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAllScheduledNotificationsAsync")().asInstanceOf[js.Promise[Unit]]
    
    inline def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelScheduledNotificationAsync")(notificationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCategoryAsync")(categoryId.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def createCategoryAsync(categoryId: String, actions: js.Array[ActionType], previewPlaceholder: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCategoryAsync")(categoryId.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], previewPlaceholder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createChannelAndroidAsync")(id.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCategoryAsync")(categoryId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteChannelAndroidAsync")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def dismissAllNotificationsAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAllNotificationsAsync")().asInstanceOf[js.Promise[Unit]]
    
    inline def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotificationAsync")(notificationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def getBadgeNumberAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeNumberAsync")().asInstanceOf[js.Promise[Double]]
    
    inline def getDevicePushTokenAsync(config: GcmSenderId): js.Promise[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicePushTokenAsync")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Type]]
    
    inline def getExpoPushTokenAsync(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpoPushTokenAsync")().asInstanceOf[js.Promise[String]]
    
    inline def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = ^.asInstanceOf[js.Dynamic].applyDynamic("presentLocalNotificationAsync")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalNotificationId]]
    
    inline def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleLocalNotificationAsync")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalNotificationId]]
    inline def scheduleLocalNotificationAsync(notification: LocalNotification, options: IntervalMs): js.Promise[LocalNotificationId] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleLocalNotificationAsync")(notification.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LocalNotificationId]]
    
    inline def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleNotificationWithCalendarAsync")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Day): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleNotificationWithCalendarAsync")(notification.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Interval): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleNotificationWithTimerAsync")(notification.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def setBadgeNumberAsync(number: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeNumberAsync")(number.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def setInitialNotification(notification: Notification): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setInitialNotification")(notification.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def emitNotification(notification: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitNotification")(notification.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
