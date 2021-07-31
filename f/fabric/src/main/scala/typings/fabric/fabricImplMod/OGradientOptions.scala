package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OGradientOptions extends StObject {
  
  var colorStops: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var gradientTransform: js.UndefOr[js.Any] = js.undefined
  
  var r1: js.UndefOr[Double] = js.undefined
  
  var r2: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var x1: js.UndefOr[Double] = js.undefined
  
  var x2: js.UndefOr[Double] = js.undefined
  
  var y1: js.UndefOr[Double] = js.undefined
  
  var y2: js.UndefOr[Double] = js.undefined
}
object OGradientOptions {
  
  @scala.inline
  def apply(): OGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OGradientOptions]
  }
  
  @scala.inline
  implicit class OGradientOptionsMutableBuilder[Self <: OGradientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorStops(value: StringDictionary[String]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStopsUndefined: Self = StObject.set(x, "colorStops", js.undefined)
    
    @scala.inline
    def setGradientTransform(value: js.Any): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    @scala.inline
    def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR1Undefined: Self = StObject.set(x, "r1", js.undefined)
    
    @scala.inline
    def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2Undefined: Self = StObject.set(x, "r2", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
