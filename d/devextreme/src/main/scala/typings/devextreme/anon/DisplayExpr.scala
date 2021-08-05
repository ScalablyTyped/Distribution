package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.data.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayExpr extends StObject {
  
  var allowClearing: js.UndefOr[Boolean] = js.undefined
  
  var dataSource: js.UndefOr[js.Array[js.Any] | DataSourceOptions | Store] = js.undefined
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.undefined
  
  var valueExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String | Double | Boolean])] = js.undefined
}
object DisplayExpr {
  
  inline def apply(): DisplayExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayExpr]
  }
  
  extension [Self <: DisplayExpr](x: Self) {
    
    inline def setAllowClearing(value: Boolean): Self = StObject.set(x, "allowClearing", value.asInstanceOf[js.Any])
    
    inline def setAllowClearingUndefined: Self = StObject.set(x, "allowClearing", js.undefined)
    
    inline def setDataSource(value: js.Array[js.Any] | DataSourceOptions | Store): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setDisplayExpr(value: String | (js.Function1[/* data */ js.Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* data */ js.Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setValueExpr(value: String | (js.Function1[/* data */ js.Any, String | Double | Boolean])): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprFunction1(value: /* data */ js.Any => String | Double | Boolean): Self = StObject.set(x, "valueExpr", js.Any.fromFunction1(value))
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
