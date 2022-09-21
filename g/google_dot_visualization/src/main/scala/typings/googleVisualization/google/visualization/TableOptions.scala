package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.auto
import typings.googleVisualization.googleVisualizationStrings.both
import typings.googleVisualization.googleVisualizationStrings.next
import typings.googleVisualization.googleVisualizationStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOptions extends StObject {
  
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  
  var alternatingRowStyle: js.UndefOr[Boolean] = js.undefined
  
  var cssClassNames: js.UndefOr[CssClassNames] = js.undefined
  
  var firstRowNumber: js.UndefOr[Double] = js.undefined
  
  var frozenColumns: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var page: js.UndefOr[String] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var pagingButtons: js.UndefOr[Double | both | prev | next | auto] = js.undefined
  
  var rtlTable: js.UndefOr[Boolean] = js.undefined
  
  var scrollLeftStartPosition: js.UndefOr[Double] = js.undefined
  
  var showRowNumber: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[String] = js.undefined
  
  var sortAscending: js.UndefOr[Boolean] = js.undefined
  
  var sortColumn: js.UndefOr[Double] = js.undefined
  
  var startPage: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object TableOptions {
  
  inline def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  extension [Self <: TableOptions](x: Self) {
    
    inline def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
    
    inline def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
    
    inline def setAlternatingRowStyle(value: Boolean): Self = StObject.set(x, "alternatingRowStyle", value.asInstanceOf[js.Any])
    
    inline def setAlternatingRowStyleUndefined: Self = StObject.set(x, "alternatingRowStyle", js.undefined)
    
    inline def setCssClassNames(value: CssClassNames): Self = StObject.set(x, "cssClassNames", value.asInstanceOf[js.Any])
    
    inline def setCssClassNamesUndefined: Self = StObject.set(x, "cssClassNames", js.undefined)
    
    inline def setFirstRowNumber(value: Double): Self = StObject.set(x, "firstRowNumber", value.asInstanceOf[js.Any])
    
    inline def setFirstRowNumberUndefined: Self = StObject.set(x, "firstRowNumber", js.undefined)
    
    inline def setFrozenColumns(value: Double): Self = StObject.set(x, "frozenColumns", value.asInstanceOf[js.Any])
    
    inline def setFrozenColumnsUndefined: Self = StObject.set(x, "frozenColumns", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPagingButtons(value: Double | both | prev | next | auto): Self = StObject.set(x, "pagingButtons", value.asInstanceOf[js.Any])
    
    inline def setPagingButtonsUndefined: Self = StObject.set(x, "pagingButtons", js.undefined)
    
    inline def setRtlTable(value: Boolean): Self = StObject.set(x, "rtlTable", value.asInstanceOf[js.Any])
    
    inline def setRtlTableUndefined: Self = StObject.set(x, "rtlTable", js.undefined)
    
    inline def setScrollLeftStartPosition(value: Double): Self = StObject.set(x, "scrollLeftStartPosition", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftStartPositionUndefined: Self = StObject.set(x, "scrollLeftStartPosition", js.undefined)
    
    inline def setShowRowNumber(value: Boolean): Self = StObject.set(x, "showRowNumber", value.asInstanceOf[js.Any])
    
    inline def setShowRowNumberUndefined: Self = StObject.set(x, "showRowNumber", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
    
    inline def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
    
    inline def setSortColumn(value: Double): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
    
    inline def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
    
    inline def setStartPageUndefined: Self = StObject.set(x, "startPage", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
