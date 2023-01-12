package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.FilterLookupDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowClearing extends StObject {
  
  /**
    * Specifies whether to display the Clear button in the lookup field while it is being edited.
    */
  var allowClearing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the lookup data source.
    */
  var dataSource: js.UndefOr[FilterLookupDataSource[Any] | Null] = js.undefined
  
  /**
    * Specifies the data field whose values should be displayed.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ Any, String])] = js.undefined
  
  /**
    * Specifies the data field whose values should be replaced with values from the displayExpr field.
    */
  var valueExpr: js.UndefOr[String | (js.Function1[/* data */ Any, String | Double | Boolean])] = js.undefined
}
object AllowClearing {
  
  inline def apply(): AllowClearing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowClearing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowClearing] (val x: Self) extends AnyVal {
    
    inline def setAllowClearing(value: Boolean): Self = StObject.set(x, "allowClearing", value.asInstanceOf[js.Any])
    
    inline def setAllowClearingUndefined: Self = StObject.set(x, "allowClearing", js.undefined)
    
    inline def setDataSource(value: FilterLookupDataSource[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDisplayExpr(value: String | (js.Function1[/* data */ Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* data */ Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setValueExpr(value: String | (js.Function1[/* data */ Any, String | Double | Boolean])): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprFunction1(value: /* data */ Any => String | Double | Boolean): Self = StObject.set(x, "valueExpr", js.Any.fromFunction1(value))
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
