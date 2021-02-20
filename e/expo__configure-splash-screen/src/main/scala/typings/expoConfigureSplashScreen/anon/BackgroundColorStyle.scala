package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import typings.expoConfigureSplashScreen.constantsMod.SplashScreenStatusBarStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorStyle extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var style: js.UndefOr[SplashScreenStatusBarStyleType] = js.native
}
object BackgroundColorStyle {
  
  @scala.inline
  def apply(): BackgroundColorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorStyle]
  }
  
  @scala.inline
  implicit class BackgroundColorStyleMutableBuilder[Self <: BackgroundColorStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setStyle(value: SplashScreenStatusBarStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
