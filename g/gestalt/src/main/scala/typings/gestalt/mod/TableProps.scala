package typings.gestalt.mod

import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.sm
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableProps extends StObject {
  
  var accessibilityLabel: String
  
  var borderStyle: js.UndefOr[sm | none] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  var stickyColumns: js.UndefOr[Double] = js.undefined
}
object TableProps {
  
  inline def apply(accessibilityLabel: String): TableProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: sm | none): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setStickyColumns(value: Double): Self = StObject.set(x, "stickyColumns", value.asInstanceOf[js.Any])
    
    inline def setStickyColumnsUndefined: Self = StObject.set(x, "stickyColumns", js.undefined)
  }
}
