package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorStatusBar extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var statusBar: js.UndefOr[`1`] = js.native
}
object BackgroundColorStatusBar {
  
  @scala.inline
  def apply(): BackgroundColorStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorStatusBar]
  }
  
  @scala.inline
  implicit class BackgroundColorStatusBarMutableBuilder[Self <: BackgroundColorStatusBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setStatusBar(value: `1`): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
