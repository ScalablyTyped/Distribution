package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorStatusBar extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var statusBar: js.UndefOr[`1`] = js.undefined
}
object BackgroundColorStatusBar {
  
  inline def apply(): BackgroundColorStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorStatusBar]
  }
  
  extension [Self <: BackgroundColorStatusBar](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setStatusBar(value: `1`): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
