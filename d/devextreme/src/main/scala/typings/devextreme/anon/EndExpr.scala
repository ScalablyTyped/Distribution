package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndExpr extends js.Object {
  
  var colorExpr: js.UndefOr[String | js.Function] = js.native
  
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  
  var endExpr: js.UndefOr[String | js.Function] = js.native
  
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  
  var parentIdExpr: js.UndefOr[String | js.Function] = js.native
  
  var progressExpr: js.UndefOr[String | js.Function] = js.native
  
  var startExpr: js.UndefOr[String | js.Function] = js.native
  
  var titleExpr: js.UndefOr[String | js.Function] = js.native
}
object EndExpr {
  
  @scala.inline
  def apply(): EndExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndExpr]
  }
  
  @scala.inline
  implicit class EndExprOps[Self <: EndExpr] (val x: Self) extends AnyVal {
    
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
    def setEndExpr(value: String | js.Function): Self = this.set("endExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndExpr: Self = this.set("endExpr", js.undefined)
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    
    @scala.inline
    def setParentIdExpr(value: String | js.Function): Self = this.set("parentIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIdExpr: Self = this.set("parentIdExpr", js.undefined)
    
    @scala.inline
    def setProgressExpr(value: String | js.Function): Self = this.set("progressExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressExpr: Self = this.set("progressExpr", js.undefined)
    
    @scala.inline
    def setStartExpr(value: String | js.Function): Self = this.set("startExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartExpr: Self = this.set("startExpr", js.undefined)
    
    @scala.inline
    def setTitleExpr(value: String | js.Function): Self = this.set("titleExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleExpr: Self = this.set("titleExpr", js.undefined)
  }
}
