package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndExpr extends StObject {
  
  var colorExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var dataSource: js.UndefOr[
    js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  
  var endExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var progressExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var startExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var titleExpr: js.UndefOr[String | js.Function] = js.undefined
}
object EndExpr {
  
  inline def apply(): EndExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndExpr]
  }
  
  extension [Self <: EndExpr](x: Self) {
    
    inline def setColorExpr(value: String | js.Function): Self = StObject.set(x, "colorExpr", value.asInstanceOf[js.Any])
    
    inline def setColorExprUndefined: Self = StObject.set(x, "colorExpr", js.undefined)
    
    inline def setDataSource(value: js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setEndExpr(value: String | js.Function): Self = StObject.set(x, "endExpr", value.asInstanceOf[js.Any])
    
    inline def setEndExprUndefined: Self = StObject.set(x, "endExpr", js.undefined)
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setParentIdExpr(value: String | js.Function): Self = StObject.set(x, "parentIdExpr", value.asInstanceOf[js.Any])
    
    inline def setParentIdExprUndefined: Self = StObject.set(x, "parentIdExpr", js.undefined)
    
    inline def setProgressExpr(value: String | js.Function): Self = StObject.set(x, "progressExpr", value.asInstanceOf[js.Any])
    
    inline def setProgressExprUndefined: Self = StObject.set(x, "progressExpr", js.undefined)
    
    inline def setStartExpr(value: String | js.Function): Self = StObject.set(x, "startExpr", value.asInstanceOf[js.Any])
    
    inline def setStartExprUndefined: Self = StObject.set(x, "startExpr", js.undefined)
    
    inline def setTitleExpr(value: String | js.Function): Self = StObject.set(x, "titleExpr", value.asInstanceOf[js.Any])
    
    inline def setTitleExprUndefined: Self = StObject.set(x, "titleExpr", js.undefined)
  }
}
