package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorDarkMode extends StObject {
  
  var backgroundColor: Color = js.native
  
  var darkMode: js.UndefOr[`1`] = js.native
}
object BackgroundColorDarkMode {
  
  @scala.inline
  def apply(backgroundColor: Color): BackgroundColorDarkMode = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorDarkMode]
  }
  
  @scala.inline
  implicit class BackgroundColorDarkModeMutableBuilder[Self <: BackgroundColorDarkMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkMode(value: `1`): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
  }
}
