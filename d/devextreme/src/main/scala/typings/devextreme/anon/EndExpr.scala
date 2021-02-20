package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndExpr extends StObject {
  
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
  implicit class EndExprMutableBuilder[Self <: EndExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorExpr(value: String | js.Function): Self = StObject.set(x, "colorExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorExprUndefined: Self = StObject.set(x, "colorExpr", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setEndExpr(value: String | js.Function): Self = StObject.set(x, "endExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndExprUndefined: Self = StObject.set(x, "endExpr", js.undefined)
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    @scala.inline
    def setParentIdExpr(value: String | js.Function): Self = StObject.set(x, "parentIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdExprUndefined: Self = StObject.set(x, "parentIdExpr", js.undefined)
    
    @scala.inline
    def setProgressExpr(value: String | js.Function): Self = StObject.set(x, "progressExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressExprUndefined: Self = StObject.set(x, "progressExpr", js.undefined)
    
    @scala.inline
    def setStartExpr(value: String | js.Function): Self = StObject.set(x, "startExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartExprUndefined: Self = StObject.set(x, "startExpr", js.undefined)
    
    @scala.inline
    def setTitleExpr(value: String | js.Function): Self = StObject.set(x, "titleExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleExprUndefined: Self = StObject.set(x, "titleExpr", js.undefined)
  }
}
