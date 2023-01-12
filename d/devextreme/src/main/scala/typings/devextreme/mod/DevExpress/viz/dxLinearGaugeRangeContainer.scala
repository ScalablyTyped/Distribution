package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.End
import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLinearGaugeRangeContainer
  extends StObject
     with BaseGaugeRangeContainer {
  
  /**
    * Specifies the orientation of the range container. Applies only if the geometry.orientation property is &apos;vertical&apos;.
    */
  var horizontalOrientation: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Specifies the orientation of the range container. Applies only if the geometry.orientation property is &apos;horizontal&apos;.
    */
  var verticalOrientation: js.UndefOr[VerticalAlignment] = js.undefined
  
  /**
    * Specifies the width of the range container&apos;s start and end boundaries in the LinearGauge UI component.
    */
  var width: js.UndefOr[End | Double] = js.undefined
}
object dxLinearGaugeRangeContainer {
  
  inline def apply(): dxLinearGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeRangeContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxLinearGaugeRangeContainer] (val x: Self) extends AnyVal {
    
    inline def setHorizontalOrientation(value: HorizontalAlignment): Self = StObject.set(x, "horizontalOrientation", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOrientationUndefined: Self = StObject.set(x, "horizontalOrientation", js.undefined)
    
    inline def setVerticalOrientation(value: VerticalAlignment): Self = StObject.set(x, "verticalOrientation", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientationUndefined: Self = StObject.set(x, "verticalOrientation", js.undefined)
    
    inline def setWidth(value: End | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
