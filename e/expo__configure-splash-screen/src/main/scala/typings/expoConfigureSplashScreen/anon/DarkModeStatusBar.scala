package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkModeStatusBar extends StObject {
  
  var darkMode: js.UndefOr[`5`] = js.undefined
  
  var statusBar: js.UndefOr[BackgroundColorHidden] = js.undefined
}
object DarkModeStatusBar {
  
  @scala.inline
  def apply(): DarkModeStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkModeStatusBar]
  }
  
  @scala.inline
  implicit class DarkModeStatusBarMutableBuilder[Self <: DarkModeStatusBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDarkMode(value: `5`): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
    
    @scala.inline
    def setStatusBar(value: BackgroundColorHidden): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
