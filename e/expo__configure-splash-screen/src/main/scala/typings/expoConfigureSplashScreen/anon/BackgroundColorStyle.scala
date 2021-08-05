package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import typings.expoConfigureSplashScreen.constantsMod.SplashScreenStatusBarStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorStyle extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var style: js.UndefOr[SplashScreenStatusBarStyleType] = js.undefined
}
object BackgroundColorStyle {
  
  inline def apply(): BackgroundColorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorStyle]
  }
  
  extension [Self <: BackgroundColorStyle](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setStyle(value: SplashScreenStatusBarStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
