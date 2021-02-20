package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `notifications`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object notifications {
  
  @js.native
  trait CreateNotificationOptions extends StObject {
    
    /** A URL to the app icon mask. */
    var appIconMaskUrl: js.UndefOr[String] = js.native
    
    /**
      * Text and icons for up to two notification action buttons.
      * @deprecated Unsupported on Firefox at this time.
      */
    var buttons: js.UndefOr[js.Array[CreateNotificationOptionsButtons]] = js.native
    
    /** Alternate notification content with a lower-weight font. */
    var contextMessage: js.UndefOr[String] = js.native
    
    /** A timestamp associated with the notification, in milliseconds past the epoch. */
    var eventTime: js.UndefOr[Double] = js.native
    
    /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
    var iconUrl: js.UndefOr[String] = js.native
    
    /** A URL to the image thumbnail for image-type notifications. */
    var imageUrl: js.UndefOr[String] = js.native
    
    /**
      * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
      */
    var isClickable: js.UndefOr[Boolean] = js.native
    
    /** Items for multi-item notifications. */
    var items: js.UndefOr[js.Array[NotificationItem]] = js.native
    
    /** Main notification content. */
    var message: String = js.native
    
    /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
    var priority: js.UndefOr[Double] = js.native
    
    /** Current progress ranges from 0 to 100. */
    var progress: js.UndefOr[Double] = js.native
    
    /** Title of the notification (e.g. sender name for email). */
    var title: String = js.native
    
    /** Which type of notification to display. */
    var `type`: TemplateType = js.native
  }
  object CreateNotificationOptions {
    
    @scala.inline
    def apply(message: String, title: String, `type`: TemplateType): CreateNotificationOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateNotificationOptions]
    }
    
    @scala.inline
    implicit class CreateNotificationOptionsMutableBuilder[Self <: CreateNotificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[CreateNotificationOptionsButtons]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: CreateNotificationOptionsButtons*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
      
      @scala.inline
      def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[NotificationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: NotificationItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateNotificationOptionsButtons extends StObject {
    
    var iconUrl: js.UndefOr[String] = js.native
    
    var title: String = js.native
  }
  object CreateNotificationOptionsButtons {
    
    @scala.inline
    def apply(title: String): CreateNotificationOptionsButtons = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateNotificationOptionsButtons]
    }
    
    @scala.inline
    implicit class CreateNotificationOptionsButtonsMutableBuilder[Self <: CreateNotificationOptionsButtons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotificationItem extends StObject {
    
    /** Additional details about this item. */
    var message: String = js.native
    
    /** Title of one item of a list notification. */
    var title: String = js.native
  }
  object NotificationItem {
    
    @scala.inline
    def apply(message: String, title: String): NotificationItem = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationItem]
    }
    
    @scala.inline
    implicit class NotificationItemMutableBuilder[Self <: NotificationItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied
  */
  trait PermissionLevel extends StObject
  object PermissionLevel {
    
    @scala.inline
    def denied: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied = "denied".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied]
    
    @scala.inline
    def granted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted = "granted".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted]
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
    
    @scala.inline
    def basic: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.basic = "basic".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.basic]
    
    @scala.inline
    def image: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = "image".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.image]
    
    @scala.inline
    def list: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.list = "list".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.list]
    
    @scala.inline
    def progress: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.progress = "progress".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.progress]
  }
  
  @js.native
  trait UpdateNotificationOptions extends StObject {
    
    /** A URL to the app icon mask. */
    var appIconMaskUrl: js.UndefOr[String] = js.native
    
    /**
      * Text and icons for up to two notification action buttons.
      * @deprecated Unsupported on Firefox at this time.
      */
    var buttons: js.UndefOr[js.Array[UpdateNotificationOptionsButtons]] = js.native
    
    /** Alternate notification content with a lower-weight font. */
    var contextMessage: js.UndefOr[String] = js.native
    
    /** A timestamp associated with the notification, in milliseconds past the epoch. */
    var eventTime: js.UndefOr[Double] = js.native
    
    /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
    var iconUrl: js.UndefOr[String] = js.native
    
    /** A URL to the image thumbnail for image-type notifications. */
    var imageUrl: js.UndefOr[String] = js.native
    
    /**
      * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
      */
    var isClickable: js.UndefOr[Boolean] = js.native
    
    /** Items for multi-item notifications. */
    var items: js.UndefOr[js.Array[NotificationItem]] = js.native
    
    /** Main notification content. */
    var message: js.UndefOr[String] = js.native
    
    /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
    var priority: js.UndefOr[Double] = js.native
    
    /** Current progress ranges from 0 to 100. */
    var progress: js.UndefOr[Double] = js.native
    
    /** Title of the notification (e.g. sender name for email). */
    var title: js.UndefOr[String] = js.native
    
    /** Which type of notification to display. */
    var `type`: js.UndefOr[TemplateType] = js.native
  }
  object UpdateNotificationOptions {
    
    @scala.inline
    def apply(): UpdateNotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNotificationOptions]
    }
    
    @scala.inline
    implicit class UpdateNotificationOptionsMutableBuilder[Self <: UpdateNotificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[UpdateNotificationOptionsButtons]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: UpdateNotificationOptionsButtons*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
      
      @scala.inline
      def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[NotificationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: NotificationItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait UpdateNotificationOptionsButtons extends StObject {
    
    var iconUrl: js.UndefOr[String] = js.native
    
    var title: String = js.native
  }
  object UpdateNotificationOptionsButtons {
    
    @scala.inline
    def apply(title: String): UpdateNotificationOptionsButtons = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateNotificationOptionsButtons]
    }
    
    @scala.inline
    implicit class UpdateNotificationOptionsButtonsMutableBuilder[Self <: UpdateNotificationOptionsButtons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
