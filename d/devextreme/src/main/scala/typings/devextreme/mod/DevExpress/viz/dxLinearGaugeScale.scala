package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLinearGaugeScale
  extends StObject
     with BaseGaugeScale {
  
  /**
    * Specifies the orientation of scale ticks. Applies only if the geometry.orientation property is &apos;vertical&apos;.
    */
  var horizontalOrientation: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Specifies common properties for scale labels.
    */
  @JSName("label")
  var label_dxLinearGaugeScale: js.UndefOr[dxLinearGaugeScaleLabel] = js.undefined
  
  /**
    * Specifies the orientation of scale ticks. Applies only if the geometry.orientation property is &apos;horizontal&apos;.
    */
  var verticalOrientation: js.UndefOr[VerticalAlignment] = js.undefined
}
object dxLinearGaugeScale {
  
  inline def apply(): dxLinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxLinearGaugeScale] (val x: Self) extends AnyVal {
    
    inline def setHorizontalOrientation(value: HorizontalAlignment): Self = StObject.set(x, "horizontalOrientation", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOrientationUndefined: Self = StObject.set(x, "horizontalOrientation", js.undefined)
    
    inline def setLabel(value: dxLinearGaugeScaleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setVerticalOrientation(value: VerticalAlignment): Self = StObject.set(x, "verticalOrientation", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientationUndefined: Self = StObject.set(x, "verticalOrientation", js.undefined)
  }
}
