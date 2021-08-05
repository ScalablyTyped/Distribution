package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pointsOptions
  extends StObject
     with seriesTypeBase {
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var symbol: js.UndefOr[js.Any] = js.undefined
}
object pointsOptions {
  
  inline def apply(): pointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pointsOptions]
  }
  
  extension [Self <: pointsOptions](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSymbol(value: js.Any): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
