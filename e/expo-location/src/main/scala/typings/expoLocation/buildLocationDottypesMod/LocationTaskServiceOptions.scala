package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationTaskServiceOptions extends StObject {
  
  /**
    * Boolean value whether to destroy the foreground service if the app is killed.
    */
  var killServiceOnDestroy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Subtitle of the foreground service notification.
    */
  var notificationBody: String
  
  /**
    * Color of the foreground service notification. Accepts `#RRGGBB` and `#AARRGGBB` hex formats.
    */
  var notificationColor: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the foreground service notification.
    */
  var notificationTitle: String
}
object LocationTaskServiceOptions {
  
  inline def apply(notificationBody: String, notificationTitle: String): LocationTaskServiceOptions = {
    val __obj = js.Dynamic.literal(notificationBody = notificationBody.asInstanceOf[js.Any], notificationTitle = notificationTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationTaskServiceOptions]
  }
  
  extension [Self <: LocationTaskServiceOptions](x: Self) {
    
    inline def setKillServiceOnDestroy(value: Boolean): Self = StObject.set(x, "killServiceOnDestroy", value.asInstanceOf[js.Any])
    
    inline def setKillServiceOnDestroyUndefined: Self = StObject.set(x, "killServiceOnDestroy", js.undefined)
    
    inline def setNotificationBody(value: String): Self = StObject.set(x, "notificationBody", value.asInstanceOf[js.Any])
    
    inline def setNotificationColor(value: String): Self = StObject.set(x, "notificationColor", value.asInstanceOf[js.Any])
    
    inline def setNotificationColorUndefined: Self = StObject.set(x, "notificationColor", js.undefined)
    
    inline def setNotificationTitle(value: String): Self = StObject.set(x, "notificationTitle", value.asInstanceOf[js.Any])
  }
}
