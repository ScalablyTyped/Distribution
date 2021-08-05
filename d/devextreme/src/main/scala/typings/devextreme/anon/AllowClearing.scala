package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.data.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowClearing extends StObject {
  
  var allowClearing: js.UndefOr[Boolean] = js.undefined
  
  var dataSource: js.UndefOr[
    js.Array[js.Any] | DataSourceOptions | Store | (js.Function1[/* options */ DataKey, js.Array[js.Any] | DataSourceOptions | Store])
  ] = js.undefined
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.undefined
  
  var valueExpr: js.UndefOr[String] = js.undefined
}
object AllowClearing {
  
  inline def apply(): AllowClearing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowClearing]
  }
  
  extension [Self <: AllowClearing](x: Self) {
    
    inline def setAllowClearing(value: Boolean): Self = StObject.set(x, "allowClearing", value.asInstanceOf[js.Any])
    
    inline def setAllowClearingUndefined: Self = StObject.set(x, "allowClearing", js.undefined)
    
    inline def setDataSource(
      value: js.Array[js.Any] | DataSourceOptions | Store | (js.Function1[/* options */ DataKey, js.Array[js.Any] | DataSourceOptions | Store])
    ): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceFunction1(value: /* options */ DataKey => js.Array[js.Any] | DataSourceOptions | Store): Self = StObject.set(x, "dataSource", js.Any.fromFunction1(value))
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setDisplayExpr(value: String | (js.Function1[/* data */ js.Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* data */ js.Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setValueExpr(value: String): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
