package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorExpr extends js.Object {
  
  var colorExpr: js.UndefOr[String | js.Function] = js.native
  
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  
  var textExpr: js.UndefOr[String | js.Function] = js.native
}
object ColorExpr {
  
  @scala.inline
  def apply(): ColorExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorExpr]
  }
  
  @scala.inline
  implicit class ColorExprOps[Self <: ColorExpr] (val x: Self) extends AnyVal {
    
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
    def setColorExpr(value: String | js.Function): Self = this.set("colorExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorExpr: Self = this.set("colorExpr", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    
    @scala.inline
    def setTextExpr(value: String | js.Function): Self = this.set("textExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextExpr: Self = this.set("textExpr", js.undefined)
  }
}
