package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorTableResizing extends StObject {
  
  /**
    * Enables users to resize tables.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The minimum column width.
    */
  var minColumnWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum row height.
    */
  var minRowHeight: js.UndefOr[Double] = js.undefined
}
object dxHtmlEditorTableResizing {
  
  inline def apply(): dxHtmlEditorTableResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorTableResizing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorTableResizing] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
    
    inline def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    
    inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
  }
}
