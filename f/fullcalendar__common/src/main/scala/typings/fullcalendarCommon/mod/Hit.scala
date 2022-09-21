package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hit extends StObject {
  
  var componentId: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[ViewContext] = js.undefined
  
  var dateProfile: DateProfile
  
  var dateSpan: DateSpan
  
  var dayEl: HTMLElement
  
  var largeUnit: js.UndefOr[String] = js.undefined
  
  var layer: Double
  
  var rect: Rect
}
object Hit {
  
  inline def apply(dateProfile: DateProfile, dateSpan: DateSpan, dayEl: HTMLElement, layer: Double, rect: Rect): Hit = {
    val __obj = js.Dynamic.literal(dateProfile = dateProfile.asInstanceOf[js.Any], dateSpan = dateSpan.asInstanceOf[js.Any], dayEl = dayEl.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
  
  extension [Self <: Hit](x: Self) {
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    inline def setContext(value: ViewContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDateSpan(value: DateSpan): Self = StObject.set(x, "dateSpan", value.asInstanceOf[js.Any])
    
    inline def setDayEl(value: HTMLElement): Self = StObject.set(x, "dayEl", value.asInstanceOf[js.Any])
    
    inline def setLargeUnit(value: String): Self = StObject.set(x, "largeUnit", value.asInstanceOf[js.Any])
    
    inline def setLargeUnitUndefined: Self = StObject.set(x, "largeUnit", js.undefined)
    
    inline def setLayer(value: Double): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
