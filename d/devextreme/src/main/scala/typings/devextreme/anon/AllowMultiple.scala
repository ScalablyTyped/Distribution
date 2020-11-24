package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowMultiple extends js.Object {
  
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
  implicit class AllowMultipleOps[Self <: AllowMultiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    
    @scala.inline
    def setColorExpr(value: String): Self = this.set("colorExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorExpr: Self = this.set("colorExpr", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(
      value: String | js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
    ): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDisplayExprFunction1(value: /* resource */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* resource */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    
    @scala.inline
    def setFieldExpr(value: String): Self = this.set("fieldExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldExpr: Self = this.set("fieldExpr", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setUseColorAsDefault(value: Boolean): Self = this.set("useColorAsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseColorAsDefault: Self = this.set("useColorAsDefault", js.undefined)
    
    @scala.inline
    def setValueExpr(value: String | js.Function): Self = this.set("valueExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpr: Self = this.set("valueExpr", js.undefined)
  }
}
