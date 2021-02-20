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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  object default {
    
    @JSImport("expo/build/Notifications/Notifications", "default.addListener")
    @js.native
    def addListener(listener: js.Function1[/* notification */ Notification, _]): EventSubscription = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.cancelAllScheduledNotificationsAsync")
    @js.native
    def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.cancelScheduledNotificationAsync")
    @js.native
    def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.createCategoryAsync")
    @js.native
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = js.native
    @JSImport("expo/build/Notifications/Notifications", "default.createCategoryAsync")
    @js.native
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType], previewPlaceholder: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.createChannelAndroidAsync")
    @js.native
    def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.deleteCategoryAsync")
    @js.native
    def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.deleteChannelAndroidAsync")
    @js.native
    def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.dismissAllNotificationsAsync")
    @js.native
    def dismissAllNotificationsAsync(): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.dismissNotificationAsync")
    @js.native
    def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.getBadgeNumberAsync")
    @js.native
    def getBadgeNumberAsync(): js.Promise[Double] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.getDevicePushTokenAsync")
    @js.native
    def getDevicePushTokenAsync(config: GcmSenderId): js.Promise[Type] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.getExpoPushTokenAsync")
    @js.native
    def getExpoPushTokenAsync(): js.Promise[String] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.presentLocalNotificationAsync")
    @js.native
    def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.scheduleLocalNotificationAsync")
    @js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    @JSImport("expo/build/Notifications/Notifications", "default.scheduleLocalNotificationAsync")
    @js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification, options: IntervalMs): js.Promise[LocalNotificationId] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.scheduleNotificationWithCalendarAsync")
    @js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = js.native
    @JSImport("expo/build/Notifications/Notifications", "default.scheduleNotificationWithCalendarAsync")
    @js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Day): js.Promise[String] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.scheduleNotificationWithTimerAsync")
    @js.native
    def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Interval): js.Promise[String] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default.setBadgeNumberAsync")
    @js.native
    def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
    
    @JSImport("expo/build/Notifications/Notifications", "default._setInitialNotification")
    @js.native
    def setInitialNotification(notification: Notification): Unit = js.native
  }
  
  @JSImport("expo/build/Notifications/Notifications", "emitNotification")
  @js.native
  def emitNotification(notification: js.Any): Unit = js.native
}
