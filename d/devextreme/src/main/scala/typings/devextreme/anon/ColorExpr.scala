package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorExpr extends StObject {
  
  var colorExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var dataSource: js.UndefOr[
    js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var textExpr: js.UndefOr[String | js.Function] = js.undefined
}
object ColorExpr {
  
  @scala.inline
  def apply(): ColorExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorExpr]
  }
  
  @scala.inline
  implicit class ColorExprMutableBuilder[Self <: ColorExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorExpr(value: String | js.Function): Self = StObject.set(x, "colorExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorExprUndefined: Self = StObject.set(x, "colorExpr", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    @scala.inline
    def setTextExpr(value: String | js.Function): Self = StObject.set(x, "textExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextExprUndefined: Self = StObject.set(x, "textExpr", js.undefined)
  }
}
