package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowMultiple extends StObject {
  
  var allowMultiple: js.UndefOr[Boolean] = js.native
  
  var colorExpr: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[
    String | js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* resource */ js.Any, String])] = js.native
  
  var fieldExpr: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var useColorAsDefault: js.UndefOr[Boolean] = js.native
  
  var valueExpr: js.UndefOr[String | js.Function] = js.native
}
object AllowMultiple {
  
  @scala.inline
  def apply(): AllowMultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMultiple]
  }
  
  @scala.inline
  implicit class AllowMultipleMutableBuilder[Self <: AllowMultiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    @scala.inline
    def setColorExpr(value: String): Self = StObject.set(x, "colorExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorExprUndefined: Self = StObject.set(x, "colorExpr", js.undefined)
    
    @scala.inline
    def setDataSource(
      value: String | js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
    ): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* resource */ js.Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayExprFunction1(value: /* resource */ js.Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    @scala.inline
    def setFieldExpr(value: String): Self = StObject.set(x, "fieldExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldExprUndefined: Self = StObject.set(x, "fieldExpr", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setUseColorAsDefault(value: Boolean): Self = StObject.set(x, "useColorAsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseColorAsDefaultUndefined: Self = StObject.set(x, "useColorAsDefault", js.undefined)
    
    @scala.inline
    def setValueExpr(value: String | js.Function): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
