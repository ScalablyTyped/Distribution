package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageFilters extends StObject {
  
  val contrast: js.UndefOr[Double] = js.undefined
  
  val exposure: js.UndefOr[Double] = js.undefined
  
  val highlights: js.UndefOr[Double] = js.undefined
  
  val saturation: js.UndefOr[Double] = js.undefined
  
  val shadows: js.UndefOr[Double] = js.undefined
  
  val temperature: js.UndefOr[Double] = js.undefined
  
  val tint: js.UndefOr[Double] = js.undefined
}
object ImageFilters {
  
  @scala.inline
  def apply(): ImageFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageFilters]
  }
  
  @scala.inline
  implicit class ImageFiltersMutableBuilder[Self <: ImageFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    @scala.inline
    def setExposure(value: Double): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureUndefined: Self = StObject.set(x, "exposure", js.undefined)
    
    @scala.inline
    def setHighlights(value: Double): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    @scala.inline
    def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    @scala.inline
    def setShadows(value: Double): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperatureUndefined: Self = StObject.set(x, "temperature", js.undefined)
    
    @scala.inline
    def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
  }
}
