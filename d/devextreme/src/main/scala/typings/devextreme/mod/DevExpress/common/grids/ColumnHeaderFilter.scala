package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.anon.Component
import typings.devextreme.mod.DevExpress.common.SearchMode
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.HeaderFilterGroupInterval
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.FilterLookupDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnHeaderFilter extends StObject {
  
  /**
    * Specifies whether searching is enabled in the header filter.
    */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the header filter&apos;s data source.
    */
  var dataSource: js.UndefOr[FilterLookupDataSource[Any] | (js.Function1[/* options */ Component, Unit])] = js.undefined
  
  /**
    * Specifies how the header filter combines values into groups. Does not apply if you specify a custom header filter data source.
    */
  var groupInterval: js.UndefOr[HeaderFilterGroupInterval | Double] = js.undefined
  
  /**
    * Specifies the height of the popup menu containing filtering values.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a comparison operation used to search header filter values.
    */
  var searchMode: js.UndefOr[SearchMode] = js.undefined
  
  /**
    * Specifies the width of the popup menu containing filtering values.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ColumnHeaderFilter {
  
  inline def apply(): ColumnHeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnHeaderFilter] (val x: Self) extends AnyVal {
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setDataSource(value: FilterLookupDataSource[Any] | (js.Function1[/* options */ Component, Unit])): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceFunction1(value: /* options */ Component => Unit): Self = StObject.set(x, "dataSource", js.Any.fromFunction1(value))
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setGroupInterval(value: HeaderFilterGroupInterval | Double): Self = StObject.set(x, "groupInterval", value.asInstanceOf[js.Any])
    
    inline def setGroupIntervalUndefined: Self = StObject.set(x, "groupInterval", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSearchMode(value: SearchMode): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
