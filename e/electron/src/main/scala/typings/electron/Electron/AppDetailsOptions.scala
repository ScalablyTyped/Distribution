package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDetailsOptions extends StObject {
  
  /**
    * Index of the icon in `appIconPath`. Ignored when `appIconPath` is not set.
    * Default is `0`.
    */
  var appIconIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Window's Relaunch Icon.
    */
  var appIconPath: js.UndefOr[String] = js.undefined
  
  /**
    * Window's App User Model ID. It has to be set, otherwise the other options will
    * have no effect.
    */
  var appId: js.UndefOr[String] = js.undefined
  
  /**
    * Window's Relaunch Command.
    */
  var relaunchCommand: js.UndefOr[String] = js.undefined
  
  /**
    * Window's Relaunch Display Name.
    */
  var relaunchDisplayName: js.UndefOr[String] = js.undefined
}
object AppDetailsOptions {
  
  inline def apply(): AppDetailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetailsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppDetailsOptions] (val x: Self) extends AnyVal {
    
    inline def setAppIconIndex(value: Double): Self = StObject.set(x, "appIconIndex", value.asInstanceOf[js.Any])
    
    inline def setAppIconIndexUndefined: Self = StObject.set(x, "appIconIndex", js.undefined)
    
    inline def setAppIconPath(value: String): Self = StObject.set(x, "appIconPath", value.asInstanceOf[js.Any])
    
    inline def setAppIconPathUndefined: Self = StObject.set(x, "appIconPath", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setRelaunchCommand(value: String): Self = StObject.set(x, "relaunchCommand", value.asInstanceOf[js.Any])
    
    inline def setRelaunchCommandUndefined: Self = StObject.set(x, "relaunchCommand", js.undefined)
    
    inline def setRelaunchDisplayName(value: String): Self = StObject.set(x, "relaunchDisplayName", value.asInstanceOf[js.Any])
    
    inline def setRelaunchDisplayNameUndefined: Self = StObject.set(x, "relaunchDisplayName", js.undefined)
  }
}
