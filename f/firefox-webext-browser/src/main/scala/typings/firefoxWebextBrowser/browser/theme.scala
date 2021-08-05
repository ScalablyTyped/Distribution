package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The theme API allows customizing of visual elements of the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object theme {
  
  /* theme types */
  /** Info provided in the onUpdated listener. */
  trait ThemeUpdateInfo extends StObject {
    
    /** The new theme after update */
    var theme: js.Object
    
    /** The id of the window the theme has been applied to */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object ThemeUpdateInfo {
    
    inline def apply(theme: js.Object): ThemeUpdateInfo = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeUpdateInfo]
    }
    
    extension [Self <: ThemeUpdateInfo](x: Self) {
      
      inline def setTheme(value: js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
