package typings.expo

import typings.expo.anon.ChannelId
import typings.expo.anon.DisplayInForeground
import typings.expo.anon.Placeholder
import typings.expo.expoStrings.received
import typings.expo.expoStrings.selected
import typings.std.NotificationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsTypesMod {
  
  @js.native
  trait ActionType extends StObject {
    
    var actionId: String = js.native
    
    var buttonTitle: String = js.native
    
    var doNotOpenInForeground: js.UndefOr[Boolean] = js.native
    
    var isAuthenticationRequired: js.UndefOr[Boolean] = js.native
    
    var isDestructive: js.UndefOr[Boolean] = js.native
    
    var textInput: js.UndefOr[Placeholder] = js.native
  }
  object ActionType {
    
    @scala.inline
    def apply(actionId: String, buttonTitle: String): ActionType = {
      val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], buttonTitle = buttonTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionType]
    }
    
    @scala.inline
    implicit class ActionTypeMutableBuilder[Self <: ActionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTitle(value: String): Self = StObject.set(x, "buttonTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotOpenInForeground(value: Boolean): Self = StObject.set(x, "doNotOpenInForeground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotOpenInForegroundUndefined: Self = StObject.set(x, "doNotOpenInForeground", js.undefined)
      
      @scala.inline
      def setIsAuthenticationRequired(value: Boolean): Self = StObject.set(x, "isAuthenticationRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuthenticationRequiredUndefined: Self = StObject.set(x, "isAuthenticationRequired", js.undefined)
      
      @scala.inline
      def setIsDestructive(value: Boolean): Self = StObject.set(x, "isDestructive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDestructiveUndefined: Self = StObject.set(x, "isDestructive", js.undefined)
      
      @scala.inline
      def setTextInput(value: Placeholder): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
    }
  }
  
  @js.native
  trait Channel extends StObject {
    
    var badge: js.UndefOr[Boolean] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var priority: js.UndefOr[String] = js.native
    
    var sound: js.UndefOr[Boolean] = js.native
    
    var vibrate: js.UndefOr[Boolean | js.Array[Double]] = js.native
  }
  object Channel {
    
    @scala.inline
    def apply(name: String): Channel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setVibrate(value: Boolean | js.Array[Double]): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
      
      @scala.inline
      def setVibrateVarargs(value: Double*): Self = StObject.set(x, "vibrate", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LocalNotification extends StObject {
    
    var android: js.UndefOr[ChannelId] = js.native
    
    var body: js.UndefOr[String] = js.native
    
    var categoryId: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var ios: js.UndefOr[DisplayInForeground] = js.native
    
    var title: String = js.native
    
    var web: js.UndefOr[NotificationOptions] = js.native
  }
  object LocalNotification {
    
    @scala.inline
    def apply(title: String): LocalNotification = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalNotification]
    }
    
    @scala.inline
    implicit class LocalNotificationMutableBuilder[Self <: LocalNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: ChannelId): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setIos(value: DisplayInForeground): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeb(value: NotificationOptions): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    }
  }
  
  type LocalNotificationId = String | Double
  
  @js.native
  trait Notification extends StObject {
    
    var data: js.Any = js.native
    
    var isMultiple: Boolean = js.native
    
    var origin: selected | received = js.native
    
    var remote: Boolean = js.native
  }
  object Notification {
    
    @scala.inline
    def apply(data: js.Any, isMultiple: Boolean, origin: selected | received, remote: Boolean): Notification = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    @scala.inline
    implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultiple(value: Boolean): Self = StObject.set(x, "isMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: selected | received): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
