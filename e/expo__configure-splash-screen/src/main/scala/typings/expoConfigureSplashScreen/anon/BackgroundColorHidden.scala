package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import typings.expoConfigureSplashScreen.constantsMod.SplashScreenStatusBarStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorHidden extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[SplashScreenStatusBarStyleType] = js.undefined
}
object BackgroundColorHidden {
  
  inline def apply(): BackgroundColorHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorHidden]
  }
  
  extension [Self <: BackgroundColorHidden](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setStyle(value: SplashScreenStatusBarStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
