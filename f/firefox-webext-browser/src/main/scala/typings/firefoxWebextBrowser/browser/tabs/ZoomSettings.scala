package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines how zoom changes in a tab are handled and at what scope. */
trait ZoomSettings extends StObject {
  
  /** Used to return the default zoom level for the current tab in calls to tabs.getZoomSettings. */
  var defaultZoomFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page; defaults to `automatic`.
    */
  var mode: js.UndefOr[ZoomSettingsMode] = js.undefined
  
  /**
    * Defines whether zoom changes will persist for the page's origin, or only take effect in this tab; defaults to `per-origin` when in `automatic` mode, and `per-tab` otherwise.
    */
  var scope: js.UndefOr[ZoomSettingsScope] = js.undefined
}
object ZoomSettings {
  
  inline def apply(): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomSettings]
  }
  
  extension [Self <: ZoomSettings](x: Self) {
    
    inline def setDefaultZoomFactor(value: Double): Self = StObject.set(x, "defaultZoomFactor", value.asInstanceOf[js.Any])
    
    inline def setDefaultZoomFactorUndefined: Self = StObject.set(x, "defaultZoomFactor", js.undefined)
    
    inline def setMode(value: ZoomSettingsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setScope(value: ZoomSettingsScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
