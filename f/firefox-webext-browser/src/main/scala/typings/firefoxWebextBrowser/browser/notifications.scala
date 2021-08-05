package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `notifications`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object notifications {
  
  trait CreateNotificationOptions extends StObject {
    
    /** A URL to the app icon mask. */
    var appIconMaskUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Text and icons for up to two notification action buttons.
      * @deprecated Unsupported on Firefox at this time.
      */
    var buttons: js.UndefOr[js.Array[CreateNotificationOptionsButtons]] = js.undefined
    
    /** Alternate notification content with a lower-weight font. */
    var contextMessage: js.UndefOr[String] = js.undefined
    
    /** A timestamp associated with the notification, in milliseconds past the epoch. */
    var eventTime: js.UndefOr[Double] = js.undefined
    
    /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
    var iconUrl: js.UndefOr[String] = js.undefined
    
    /** A URL to the image thumbnail for image-type notifications. */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
      */
    var isClickable: js.UndefOr[Boolean] = js.undefined
    
    /** Items for multi-item notifications. */
    var items: js.UndefOr[js.Array[NotificationItem]] = js.undefined
    
    /** Main notification content. */
    var message: String
    
    /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
    var priority: js.UndefOr[Double] = js.undefined
    
    /** Current progress ranges from 0 to 100. */
    var progress: js.UndefOr[Double] = js.undefined
    
    /** Title of the notification (e.g. sender name for email). */
    var title: String
    
    /** Which type of notification to display. */
    var `type`: TemplateType
  }
  object CreateNotificationOptions {
    
    inline def apply(message: String, title: String, `type`: TemplateType): CreateNotificationOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateNotificationOptions]
    }
    
    extension [Self <: CreateNotificationOptions](x: Self) {
      
      inline def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
      
      inline def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
      
      inline def setButtons(value: js.Array[CreateNotificationOptionsButtons]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: CreateNotificationOptionsButtons*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      inline def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
      
      inline def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
      
      inline def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
      
      inline def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
      
      inline def setItems(value: js.Array[NotificationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: NotificationItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateNotificationOptionsButtons extends StObject {
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object CreateNotificationOptionsButtons {
    
    inline def apply(title: String): CreateNotificationOptionsButtons = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateNotificationOptionsButtons]
    }
    
    extension [Self <: CreateNotificationOptionsButtons](x: Self) {
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationItem extends StObject {
    
    /** Additional details about this item. */
    var message: String
    
    /** Title of one item of a list notification. */
    var title: String
  }
  object NotificationItem {
    
    inline def apply(message: String, title: String): NotificationItem = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationItem]
    }
    
    extension [Self <: NotificationItem](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied
  */
  trait PermissionLevel extends StObject
  object PermissionLevel {
    
    inline def denied: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied = "denied".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied]
    
    inline def granted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted = "granted".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted]
  }
  
  /* notifications types */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.basic
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.list
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.progress
  */
  trait TemplateType extends StObject
  object TemplateType {
    
    inline def basic: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.basic = "basic".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.basic]
    
    inline def image: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = "image".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image]
    
    inline def list: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.list = "list".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.list]
    
    inline def progress: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.progress = "progress".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.progress]
  }
  
  trait UpdateNotificationOptions extends StObject {
    
    /** A URL to the app icon mask. */
    var appIconMaskUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Text and icons for up to two notification action buttons.
      * @deprecated Unsupported on Firefox at this time.
      */
    var buttons: js.UndefOr[js.Array[UpdateNotificationOptionsButtons]] = js.undefined
    
    /** Alternate notification content with a lower-weight font. */
    var contextMessage: js.UndefOr[String] = js.undefined
    
    /** A timestamp associated with the notification, in milliseconds past the epoch. */
    var eventTime: js.UndefOr[Double] = js.undefined
    
    /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
    var iconUrl: js.UndefOr[String] = js.undefined
    
    /** A URL to the image thumbnail for image-type notifications. */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
      */
    var isClickable: js.UndefOr[Boolean] = js.undefined
    
    /** Items for multi-item notifications. */
    var items: js.UndefOr[js.Array[NotificationItem]] = js.undefined
    
    /** Main notification content. */
    var message: js.UndefOr[String] = js.undefined
    
    /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
    var priority: js.UndefOr[Double] = js.undefined
    
    /** Current progress ranges from 0 to 100. */
    var progress: js.UndefOr[Double] = js.undefined
    
    /** Title of the notification (e.g. sender name for email). */
    var title: js.UndefOr[String] = js.undefined
    
    /** Which type of notification to display. */
    var `type`: js.UndefOr[TemplateType] = js.undefined
  }
  object UpdateNotificationOptions {
    
    inline def apply(): UpdateNotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNotificationOptions]
    }
    
    extension [Self <: UpdateNotificationOptions](x: Self) {
      
      inline def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
      
      inline def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
      
      inline def setButtons(value: js.Array[UpdateNotificationOptionsButtons]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: UpdateNotificationOptionsButtons*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      inline def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
      
      inline def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
      
      inline def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
      
      inline def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
      
      inline def setItems(value: js.Array[NotificationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: NotificationItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait UpdateNotificationOptionsButtons extends StObject {
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object UpdateNotificationOptionsButtons {
    
    inline def apply(title: String): UpdateNotificationOptionsButtons = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateNotificationOptionsButtons]
    }
    
    extension [Self <: UpdateNotificationOptionsButtons](x: Self) {
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
