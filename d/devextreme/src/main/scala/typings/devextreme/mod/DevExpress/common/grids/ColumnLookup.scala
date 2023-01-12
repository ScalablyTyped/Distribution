package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.anon.Data
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.FilterLookupDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnLookup extends StObject {
  
  /**
    * Specifies whether to display the Clear button in lookup column cells while they are being edited.
    */
  var allowClearing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var calculateCellValue: js.UndefOr[js.Function1[/* rowData */ Any, Any]] = js.undefined
  
  /**
    * Specifies the data source for the lookup column.
    */
  var dataSource: js.UndefOr[
    FilterLookupDataSource[Any] | (js.Function1[/* options */ Data, FilterLookupDataSource[Any]]) | Null
  ] = js.undefined
  
  /**
    * Specifies the data source field whose values must be displayed.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ Any, String])] = js.undefined
  
  /**
    * Specifies the data field whose values should be replaced with values from the displayExpr field.
    */
  var valueExpr: js.UndefOr[String] = js.undefined
}
object ColumnLookup {
  
  inline def apply(): ColumnLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnLookup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnLookup] (val x: Self) extends AnyVal {
    
    inline def setAllowClearing(value: Boolean): Self = StObject.set(x, "allowClearing", value.asInstanceOf[js.Any])
    
    inline def setAllowClearingUndefined: Self = StObject.set(x, "allowClearing", js.undefined)
    
    inline def setCalculateCellValue(value: /* rowData */ Any => Any): Self = StObject.set(x, "calculateCellValue", js.Any.fromFunction1(value))
    
    inline def setCalculateCellValueUndefined: Self = StObject.set(x, "calculateCellValue", js.undefined)
    
    inline def setDataSource(
      value: FilterLookupDataSource[Any] | (js.Function1[/* options */ Data, FilterLookupDataSource[Any]])
    ): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceFunction1(value: /* options */ Data => FilterLookupDataSource[Any]): Self = StObject.set(x, "dataSource", js.Any.fromFunction1(value))
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDisplayExpr(value: String | (js.Function1[/* data */ Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* data */ Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setValueExpr(value: String): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
