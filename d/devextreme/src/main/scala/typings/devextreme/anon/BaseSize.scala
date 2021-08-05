package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSize extends StObject {
  
  var baseSize: js.UndefOr[Double | auto] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var screen: js.UndefOr[String] = js.undefined
  
  var shrink: js.UndefOr[Double] = js.undefined
}
object BaseSize {
  
  inline def apply(): BaseSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSize]
  }
  
  extension [Self <: BaseSize](x: Self) {
    
    inline def setBaseSize(value: Double | auto): Self = StObject.set(x, "baseSize", value.asInstanceOf[js.Any])
    
    inline def setBaseSizeUndefined: Self = StObject.set(x, "baseSize", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    inline def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
