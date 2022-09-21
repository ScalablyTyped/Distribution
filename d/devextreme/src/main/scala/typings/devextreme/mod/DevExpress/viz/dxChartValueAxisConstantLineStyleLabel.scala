package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxisConstantLineStyleLabel
  extends StObject
     with dxChartCommonAxisSettingsConstantLineStyleLabel {
  
  /**
    * Aligns constant line labels in the horizontal direction.
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Aligns constant line labels in the vertical direction.
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment] = js.undefined
}
object dxChartValueAxisConstantLineStyleLabel {
  
  inline def apply(): dxChartValueAxisConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisConstantLineStyleLabel]
  }
  
  extension [Self <: dxChartValueAxisConstantLineStyleLabel](x: Self) {
    
    inline def setHorizontalAlignment(value: HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
