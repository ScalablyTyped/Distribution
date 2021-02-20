package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.data.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayExpr extends StObject {
  
  var allowClearing: js.UndefOr[Boolean] = js.native
  
  var dataSource: js.UndefOr[js.Array[_] | DataSourceOptions | Store] = js.native
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.native
  
  var valueExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String | Double | Boolean])] = js.native
}
object DisplayExpr {
  
  @scala.inline
  def apply(): DisplayExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayExpr]
  }
  
  @scala.inline
  implicit class DisplayExprMutableBuilder[Self <: DisplayExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowClearing(value: Boolean): Self = StObject.set(x, "allowClearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClearingUndefined: Self = StObject.set(x, "allowClearing", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSourceOptions | Store): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* data */ js.Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayExprFunction1(value: /* data */ js.Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    @scala.inline
    def setValueExpr(value: String | (js.Function1[/* data */ js.Any, String | Double | Boolean])): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExprFunction1(value: /* data */ js.Any => String | Double | Boolean): Self = StObject.set(x, "valueExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
