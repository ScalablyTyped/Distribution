package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGradientOptions extends StObject {
  
  /**
    * Color stops object eg. {0:string; 1:string;
    */
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.undefined
  
  var coords: js.UndefOr[IGradientOptionsCoords] = js.undefined
  
  var gradientTransform: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Horizontal offset for aligning gradients coming from SVG when outside pathgroups
    * @type Number
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical offset for aligning gradients coming from SVG when outside pathgroups
    * @type Number
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object IGradientOptions {
  
  @scala.inline
  def apply(): IGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradientOptions]
  }
  
  @scala.inline
  implicit class IGradientOptionsMutableBuilder[Self <: IGradientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorStops(value: IGradientOptionsColorStops): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStopsUndefined: Self = StObject.set(x, "colorStops", js.undefined)
    
    @scala.inline
    def setColorStopsVarargs(value: typings.fabric.anon.Color*): Self = StObject.set(x, "colorStops", js.Array(value :_*))
    
    @scala.inline
    def setCoords(value: IGradientOptionsCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    @scala.inline
    def setGradientTransform(value: js.Any): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
