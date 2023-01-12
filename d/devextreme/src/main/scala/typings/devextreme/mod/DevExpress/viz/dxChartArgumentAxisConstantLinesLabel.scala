package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartArgumentAxisConstantLinesLabel
  extends StObject
     with dxChartCommonAxisSettingsConstantLineStyleLabel {
  
  /**
    * Aligns constant line labels in the horizontal direction.
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Specifies the text of a constant line label. By default, equals to the value of the constant line.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Aligns constant line labels in the vertical direction.
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment] = js.undefined
}
object dxChartArgumentAxisConstantLinesLabel {
  
  inline def apply(): dxChartArgumentAxisConstantLinesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisConstantLinesLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartArgumentAxisConstantLinesLabel] (val x: Self) extends AnyVal {
    
    inline def setHorizontalAlignment(value: HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
