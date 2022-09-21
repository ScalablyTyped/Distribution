package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextOverflow extends StObject {
  
  /**
    * Specifies the font settings of the group labels.
    */
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Specifies what to do with labels that overflow their group headers: hide, truncated them with ellipsis, or leave them as they are.
    */
  var textOverflow: js.UndefOr[typings.devextreme.mod.DevExpress.common.charts.TextOverflow] = js.undefined
  
  /**
    * Changes the visibility of the group labels.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object TextOverflow {
  
  inline def apply(): TextOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOverflow]
  }
  
  extension [Self <: TextOverflow](x: Self) {
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setTextOverflow(value: typings.devextreme.mod.DevExpress.common.charts.TextOverflow): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
