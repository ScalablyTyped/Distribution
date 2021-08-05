package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdExpr extends StObject {
  
  var dataSource: js.UndefOr[
    js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var resourceIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var taskIdExpr: js.UndefOr[String | js.Function] = js.undefined
}
object ResourceIdExpr {
  
  inline def apply(): ResourceIdExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdExpr]
  }
  
  extension [Self <: ResourceIdExpr](x: Self) {
    
    inline def setDataSource(value: js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setResourceIdExpr(value: String | js.Function): Self = StObject.set(x, "resourceIdExpr", value.asInstanceOf[js.Any])
    
    inline def setResourceIdExprUndefined: Self = StObject.set(x, "resourceIdExpr", js.undefined)
    
    inline def setTaskIdExpr(value: String | js.Function): Self = StObject.set(x, "taskIdExpr", value.asInstanceOf[js.Any])
    
    inline def setTaskIdExprUndefined: Self = StObject.set(x, "taskIdExpr", js.undefined)
  }
}
