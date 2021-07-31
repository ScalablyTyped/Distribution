package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorHatching extends StObject {
  
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var hatching: js.UndefOr[Step] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object ColorHatching {
  
  @scala.inline
  def apply(): ColorHatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorHatching]
  }
  
  @scala.inline
  implicit class ColorHatchingMutableBuilder[Self <: ColorHatching] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHatching(value: Step): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
