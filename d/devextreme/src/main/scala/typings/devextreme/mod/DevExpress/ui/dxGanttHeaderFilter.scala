package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttHeaderFilter extends StObject {
  
  /**
    * Specifies whether to enable searching in the header filter.
    */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the height of the popup window that contains values for filtering.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a delay in milliseconds between typing a search string and the search execution.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Contains properties that specify text for various elements of the popup window.
    */
  var texts: js.UndefOr[dxGanttHeaderFilterTexts] = js.undefined
  
  /**
    * Specifies whether to show header filter icons.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the popup window that contains values for filtering.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxGanttHeaderFilter {
  
  inline def apply(): dxGanttHeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttHeaderFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxGanttHeaderFilter] (val x: Self) extends AnyVal {
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setTexts(value: dxGanttHeaderFilterTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
