package typings.fabric.anon

import typings.fabric.fabricImplMod.IGradientOptionsColorStops
import typings.fabric.fabricImplMod.IGradientOptionsCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStops extends StObject {
  
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.undefined
  
  var coords: js.UndefOr[IGradientOptionsCoords] = js.undefined
  
  var gradientUnits: js.UndefOr[Any] = js.undefined
  
  var offsetX: js.UndefOr[Any] = js.undefined
  
  var offsetY: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ColorStops {
  
  inline def apply(): ColorStops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStops]
  }
  
  extension [Self <: ColorStops](x: Self) {
    
    inline def setColorStops(value: IGradientOptionsColorStops): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsUndefined: Self = StObject.set(x, "colorStops", js.undefined)
    
    inline def setColorStopsVarargs(value: Offset*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setCoords(value: IGradientOptionsCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setGradientUnits(value: Any): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
