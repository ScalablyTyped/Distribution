package typings.fabric.anon

import typings.fabric.fabricImplMod.IGradientOptionsColorStops
import typings.fabric.fabricImplMod.IGradientOptionsCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStops extends StObject {
  
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.undefined
  
  var coords: js.UndefOr[IGradientOptionsCoords] = js.undefined
  
  var gradientUnits: js.UndefOr[js.Any] = js.undefined
  
  var offsetX: js.UndefOr[js.Any] = js.undefined
  
  var offsetY: js.UndefOr[js.Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ColorStops {
  
  @scala.inline
  def apply(): ColorStops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStops]
  }
  
  @scala.inline
  implicit class ColorStopsMutableBuilder[Self <: ColorStops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorStops(value: IGradientOptionsColorStops): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStopsUndefined: Self = StObject.set(x, "colorStops", js.undefined)
    
    @scala.inline
    def setColorStopsVarargs(value: Color*): Self = StObject.set(x, "colorStops", js.Array(value :_*))
    
    @scala.inline
    def setCoords(value: IGradientOptionsCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    @scala.inline
    def setGradientUnits(value: js.Any): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
    
    @scala.inline
    def setOffsetX(value: js.Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: js.Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
