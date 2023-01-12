package typings.domWebcodecs

import typings.std.ColorSpaceConversion
import typings.std.PremultiplyAlpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDecoderInit extends StObject {
  
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined
  
  var data: ImageBufferSource
  
  var desiredHeight: js.UndefOr[Double] = js.undefined
  
  var desiredWidth: js.UndefOr[Double] = js.undefined
  
  var preferAnimation: js.UndefOr[Boolean] = js.undefined
  
  var premultiplyAlpha: js.UndefOr[PremultiplyAlpha] = js.undefined
  
  var `type`: String
}
object ImageDecoderInit {
  
  inline def apply(data: ImageBufferSource, `type`: String): ImageDecoderInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDecoderInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDecoderInit] (val x: Self) extends AnyVal {
    
    inline def setColorSpaceConversion(value: ColorSpaceConversion): Self = StObject.set(x, "colorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceConversionUndefined: Self = StObject.set(x, "colorSpaceConversion", js.undefined)
    
    inline def setData(value: ImageBufferSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDesiredHeight(value: Double): Self = StObject.set(x, "desiredHeight", value.asInstanceOf[js.Any])
    
    inline def setDesiredHeightUndefined: Self = StObject.set(x, "desiredHeight", js.undefined)
    
    inline def setDesiredWidth(value: Double): Self = StObject.set(x, "desiredWidth", value.asInstanceOf[js.Any])
    
    inline def setDesiredWidthUndefined: Self = StObject.set(x, "desiredWidth", js.undefined)
    
    inline def setPreferAnimation(value: Boolean): Self = StObject.set(x, "preferAnimation", value.asInstanceOf[js.Any])
    
    inline def setPreferAnimationUndefined: Self = StObject.set(x, "preferAnimation", js.undefined)
    
    inline def setPremultiplyAlpha(value: PremultiplyAlpha): Self = StObject.set(x, "premultiplyAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultiplyAlphaUndefined: Self = StObject.set(x, "premultiplyAlpha", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
