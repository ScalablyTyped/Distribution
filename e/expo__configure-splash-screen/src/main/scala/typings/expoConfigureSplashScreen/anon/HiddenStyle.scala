package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HiddenStyle extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object HiddenStyle {
  
  inline def apply(): HiddenStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenStyle]
  }
  
  extension [Self <: HiddenStyle](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
