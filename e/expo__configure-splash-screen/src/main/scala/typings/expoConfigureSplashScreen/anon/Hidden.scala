package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenStatusBarStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hidden extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[SplashScreenStatusBarStyleType] = js.undefined
}
object Hidden {
  
  inline def apply(): Hidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hidden]
  }
  
  extension [Self <: Hidden](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setStyle(value: SplashScreenStatusBarStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
