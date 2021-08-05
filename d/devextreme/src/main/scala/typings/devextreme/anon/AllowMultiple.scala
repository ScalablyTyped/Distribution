package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowMultiple extends StObject {
  
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  
  var colorExpr: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[
    String | js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* resource */ js.Any, String])] = js.undefined
  
  var fieldExpr: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var useColorAsDefault: js.UndefOr[Boolean] = js.undefined
  
  var valueExpr: js.UndefOr[String | js.Function] = js.undefined
}
object AllowMultiple {
  
  inline def apply(): AllowMultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMultiple]
  }
  
  extension [Self <: AllowMultiple](x: Self) {
    
    inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    inline def setColorExpr(value: String): Self = StObject.set(x, "colorExpr", value.asInstanceOf[js.Any])
    
    inline def setColorExprUndefined: Self = StObject.set(x, "colorExpr", js.undefined)
    
    inline def setDataSource(
      value: String | js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
    ): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setDisplayExpr(value: String | (js.Function1[/* resource */ js.Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* resource */ js.Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setFieldExpr(value: String): Self = StObject.set(x, "fieldExpr", value.asInstanceOf[js.Any])
    
    inline def setFieldExprUndefined: Self = StObject.set(x, "fieldExpr", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setUseColorAsDefault(value: Boolean): Self = StObject.set(x, "useColorAsDefault", value.asInstanceOf[js.Any])
    
    inline def setUseColorAsDefaultUndefined: Self = StObject.set(x, "useColorAsDefault", js.undefined)
    
    inline def setValueExpr(value: String | js.Function): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
