package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkMode extends StObject {
  
  var backgroundColor: Color
  
  var darkMode: js.UndefOr[BackgroundColorStatusBar] = js.undefined
  
  var statusBar: js.UndefOr[`1`] = js.undefined
}
object DarkMode {
  
  @scala.inline
  def apply(backgroundColor: Color): DarkMode = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkMode]
  }
  
  @scala.inline
  implicit class DarkModeMutableBuilder[Self <: DarkMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkMode(value: BackgroundColorStatusBar): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
    
    @scala.inline
    def setStatusBar(value: `1`): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
