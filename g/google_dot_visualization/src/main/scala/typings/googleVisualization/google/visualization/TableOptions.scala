package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.auto
import typings.googleVisualization.googleVisualizationStrings.both
import typings.googleVisualization.googleVisualizationStrings.next
import typings.googleVisualization.googleVisualizationStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOptions extends StObject {
  
  var allowHtml: js.UndefOr[Boolean] = js.native
  
  var alternatingRowStyle: js.UndefOr[Boolean] = js.native
  
  var cssClassNames: js.UndefOr[CssClassNames] = js.native
  
  var firstRowNumber: js.UndefOr[Double] = js.native
  
  var frozenColumns: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[String] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var pagingButtons: js.UndefOr[Double | both | prev | next | auto] = js.native
  
  var rtlTable: js.UndefOr[Boolean] = js.native
  
  var scrollLeftStartPosition: js.UndefOr[Double] = js.native
  
  var showRowNumber: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[String] = js.native
  
  var sortAscending: js.UndefOr[Boolean] = js.native
  
  var sortColumn: js.UndefOr[Double] = js.native
  
  var startPage: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object TableOptions {
  
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
    
    @scala.inline
    def setAlternatingRowStyle(value: Boolean): Self = StObject.set(x, "alternatingRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternatingRowStyleUndefined: Self = StObject.set(x, "alternatingRowStyle", js.undefined)
    
    @scala.inline
    def setCssClassNames(value: CssClassNames): Self = StObject.set(x, "cssClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassNamesUndefined: Self = StObject.set(x, "cssClassNames", js.undefined)
    
    @scala.inline
    def setFirstRowNumber(value: Double): Self = StObject.set(x, "firstRowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRowNumberUndefined: Self = StObject.set(x, "firstRowNumber", js.undefined)
    
    @scala.inline
    def setFrozenColumns(value: Double): Self = StObject.set(x, "frozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenColumnsUndefined: Self = StObject.set(x, "frozenColumns", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPagingButtons(value: Double | both | prev | next | auto): Self = StObject.set(x, "pagingButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingButtonsUndefined: Self = StObject.set(x, "pagingButtons", js.undefined)
    
    @scala.inline
    def setRtlTable(value: Boolean): Self = StObject.set(x, "rtlTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlTableUndefined: Self = StObject.set(x, "rtlTable", js.undefined)
    
    @scala.inline
    def setScrollLeftStartPosition(value: Double): Self = StObject.set(x, "scrollLeftStartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftStartPositionUndefined: Self = StObject.set(x, "scrollLeftStartPosition", js.undefined)
    
    @scala.inline
    def setShowRowNumber(value: Boolean): Self = StObject.set(x, "showRowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRowNumberUndefined: Self = StObject.set(x, "showRowNumber", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
    
    @scala.inline
    def setSortColumn(value: Double): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPageUndefined: Self = StObject.set(x, "startPage", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
