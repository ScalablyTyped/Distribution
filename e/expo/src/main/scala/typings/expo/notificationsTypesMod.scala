package typings.expo

import typings.expo.anon.ChannelId
import typings.expo.anon.DisplayInForeground
import typings.expo.anon.Placeholder
import typings.expo.expoStrings.received
import typings.expo.expoStrings.selected
import typings.std.NotificationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsTypesMod {
  
  trait ActionType extends StObject {
    
    var actionId: String
    
    var buttonTitle: String
    
    var doNotOpenInForeground: js.UndefOr[Boolean] = js.undefined
    
    var isAuthenticationRequired: js.UndefOr[Boolean] = js.undefined
    
    var isDestructive: js.UndefOr[Boolean] = js.undefined
    
    var textInput: js.UndefOr[Placeholder] = js.undefined
  }
  object ActionType {
    
    inline def apply(actionId: String, buttonTitle: String): ActionType = {
      val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], buttonTitle = buttonTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionType]
    }
    
    extension [Self <: ActionType](x: Self) {
      
      inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
      
      inline def setButtonTitle(value: String): Self = StObject.set(x, "buttonTitle", value.asInstanceOf[js.Any])
      
      inline def setDoNotOpenInForeground(value: Boolean): Self = StObject.set(x, "doNotOpenInForeground", value.asInstanceOf[js.Any])
      
      inline def setDoNotOpenInForegroundUndefined: Self = StObject.set(x, "doNotOpenInForeground", js.undefined)
      
      inline def setIsAuthenticationRequired(value: Boolean): Self = StObject.set(x, "isAuthenticationRequired", value.asInstanceOf[js.Any])
      
      inline def setIsAuthenticationRequiredUndefined: Self = StObject.set(x, "isAuthenticationRequired", js.undefined)
      
      inline def setIsDestructive(value: Boolean): Self = StObject.set(x, "isDestructive", value.asInstanceOf[js.Any])
      
      inline def setIsDestructiveUndefined: Self = StObject.set(x, "isDestructive", js.undefined)
      
      inline def setTextInput(value: Placeholder): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
      
      inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
    }
  }
  
  trait Channel extends StObject {
    
    var badge: js.UndefOr[Boolean] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var priority: js.UndefOr[String] = js.undefined
    
    var sound: js.UndefOr[Boolean] = js.undefined
    
    var vibrate: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  }
  object Channel {
    
    inline def apply(name: String): Channel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setVibrate(value: Boolean | js.Array[Double]): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
      
      inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
      
      inline def setVibrateVarargs(value: Double*): Self = StObject.set(x, "vibrate", js.Array(value :_*))
    }
  }
  
  trait LocalNotification extends StObject {
    
    var android: js.UndefOr[ChannelId] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var categoryId: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var ios: js.UndefOr[DisplayInForeground] = js.undefined
    
    var title: String
    
    var web: js.UndefOr[NotificationOptions] = js.undefined
  }
  object LocalNotification {
    
    inline def apply(title: String): LocalNotification = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalNotification]
    }
    
    extension [Self <: LocalNotification](x: Self) {
      
      inline def setAndroid(value: ChannelId): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
      
      inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIos(value: DisplayInForeground): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setWeb(value: NotificationOptions): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    }
  }
  
  type LocalNotificationId = String | Double
  
  trait Notification extends StObject {
    
    var data: js.Any
    
    var isMultiple: Boolean
    
    var origin: selected | received
    
    var remote: Boolean
  }
  object Notification {
    
    inline def apply(data: js.Any, isMultiple: Boolean, origin: selected | received, remote: Boolean): Notification = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsMultiple(value: Boolean): Self = StObject.set(x, "isMultiple", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: selected | received): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
