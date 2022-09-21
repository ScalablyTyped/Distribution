package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKioskCustomization extends StObject {
  
  /**
    * Specifies whether the Settings app is allowed in kiosk mode.
    */
  var deviceSettings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sets the behavior of a device in kiosk mode when a user presses and holds (long-presses) the Power button.
    */
  var powerButtonActions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies whether system info and notifications are disabled in kiosk mode.
    */
  var statusBar: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies whether system error dialogs for crashed or unresponsive apps are blocked in kiosk mode. When blocked, the system will force-stop the app as if the user chooses the "close app" option on the UI.
    */
  var systemErrorWarnings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies which navigation features are enabled (e.g. Home, Overview buttons) in kiosk mode.
    */
  var systemNavigation: js.UndefOr[String | Null] = js.undefined
}
object SchemaKioskCustomization {
  
  inline def apply(): SchemaKioskCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKioskCustomization]
  }
  
  extension [Self <: SchemaKioskCustomization](x: Self) {
    
    inline def setDeviceSettings(value: String): Self = StObject.set(x, "deviceSettings", value.asInstanceOf[js.Any])
    
    inline def setDeviceSettingsNull: Self = StObject.set(x, "deviceSettings", null)
    
    inline def setDeviceSettingsUndefined: Self = StObject.set(x, "deviceSettings", js.undefined)
    
    inline def setPowerButtonActions(value: String): Self = StObject.set(x, "powerButtonActions", value.asInstanceOf[js.Any])
    
    inline def setPowerButtonActionsNull: Self = StObject.set(x, "powerButtonActions", null)
    
    inline def setPowerButtonActionsUndefined: Self = StObject.set(x, "powerButtonActions", js.undefined)
    
    inline def setStatusBar(value: String): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    inline def setStatusBarNull: Self = StObject.set(x, "statusBar", null)
    
    inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    
    inline def setSystemErrorWarnings(value: String): Self = StObject.set(x, "systemErrorWarnings", value.asInstanceOf[js.Any])
    
    inline def setSystemErrorWarningsNull: Self = StObject.set(x, "systemErrorWarnings", null)
    
    inline def setSystemErrorWarningsUndefined: Self = StObject.set(x, "systemErrorWarnings", js.undefined)
    
    inline def setSystemNavigation(value: String): Self = StObject.set(x, "systemNavigation", value.asInstanceOf[js.Any])
    
    inline def setSystemNavigationNull: Self = StObject.set(x, "systemNavigation", null)
    
    inline def setSystemNavigationUndefined: Self = StObject.set(x, "systemNavigation", js.undefined)
  }
}
