package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeInfo extends StObject {
  
  var borderBottom: Double
  
  var borderLeft: Double
  
  var borderRight: Double
  
  var borderTop: Double
  
  var paddingBottom: js.UndefOr[Double] = js.undefined
  
  var paddingLeft: js.UndefOr[Double] = js.undefined
  
  var paddingRight: js.UndefOr[Double] = js.undefined
  
  var paddingTop: js.UndefOr[Double] = js.undefined
  
  var scrollbarBottom: Double
  
  var scrollbarLeft: Double
  
  var scrollbarRight: Double
}
object EdgeInfo {
  
  inline def apply(
    borderBottom: Double,
    borderLeft: Double,
    borderRight: Double,
    borderTop: Double,
    scrollbarBottom: Double,
    scrollbarLeft: Double,
    scrollbarRight: Double
  ): EdgeInfo = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], borderLeft = borderLeft.asInstanceOf[js.Any], borderRight = borderRight.asInstanceOf[js.Any], borderTop = borderTop.asInstanceOf[js.Any], scrollbarBottom = scrollbarBottom.asInstanceOf[js.Any], scrollbarLeft = scrollbarLeft.asInstanceOf[js.Any], scrollbarRight = scrollbarRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeInfo] (val x: Self) extends AnyVal {
    
    inline def setBorderBottom(value: Double): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderLeft(value: Double): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderRight(value: Double): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderTop(value: Double): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setScrollbarBottom(value: Double): Self = StObject.set(x, "scrollbarBottom", value.asInstanceOf[js.Any])
    
    inline def setScrollbarLeft(value: Double): Self = StObject.set(x, "scrollbarLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollbarRight(value: Double): Self = StObject.set(x, "scrollbarRight", value.asInstanceOf[js.Any])
  }
}
