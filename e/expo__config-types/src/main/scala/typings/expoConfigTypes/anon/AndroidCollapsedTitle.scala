package typings.expoConfigTypes.anon

import typings.expoConfigTypes.expoConfigTypesStrings.collapse
import typings.expoConfigTypes.expoConfigTypesStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidCollapsedTitle extends StObject {
  
  /**
    * If `androidMode` is set to `collapse`, this title is used for the collapsed notification message. For example, `'#{unread_notifications} new interactions'`.
    */
  var androidCollapsedTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Show each push notification individually (`default`) or collapse into one (`collapse`).
    */
  var androidMode: js.UndefOr[default | collapse] = js.undefined
  
  /**
    * (Android only) Tint color for the push notification image when it appears in the notification tray. Defaults to `#ffffff`
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * (Android only) Local path or remote URL to an image to use as the icon for push notifications. 96x96 png grayscale with transparency. We recommend following [Google's design guidelines](https://material.io/design/iconography/product-icons.html#design-principles). If not provided, defaults to your app icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to display notifications when the app is in the foreground on iOS. `_displayInForeground` option in the individual push notification message overrides this option. [Learn more.](https://docs.expo.dev/push-notifications/receiving-notifications/#foreground-notification-behavior) Defaults to `false`.
    */
  var iosDisplayInForeground: js.UndefOr[Boolean] = js.undefined
}
object AndroidCollapsedTitle {
  
  inline def apply(): AndroidCollapsedTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidCollapsedTitle]
  }
  
  extension [Self <: AndroidCollapsedTitle](x: Self) {
    
    inline def setAndroidCollapsedTitle(value: String): Self = StObject.set(x, "androidCollapsedTitle", value.asInstanceOf[js.Any])
    
    inline def setAndroidCollapsedTitleUndefined: Self = StObject.set(x, "androidCollapsedTitle", js.undefined)
    
    inline def setAndroidMode(value: default | collapse): Self = StObject.set(x, "androidMode", value.asInstanceOf[js.Any])
    
    inline def setAndroidModeUndefined: Self = StObject.set(x, "androidMode", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIosDisplayInForeground(value: Boolean): Self = StObject.set(x, "iosDisplayInForeground", value.asInstanceOf[js.Any])
    
    inline def setIosDisplayInForegroundUndefined: Self = StObject.set(x, "iosDisplayInForeground", js.undefined)
  }
}
