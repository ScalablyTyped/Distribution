package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorDarkMode extends StObject {
  
  var backgroundColor: Color
  
  var darkMode: js.UndefOr[`1`] = js.undefined
}
object BackgroundColorDarkMode {
  
  inline def apply(backgroundColor: Color): BackgroundColorDarkMode = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorDarkMode]
  }
  
  extension [Self <: BackgroundColorDarkMode](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setDarkMode(value: `1`): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
    
    inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
  }
}
