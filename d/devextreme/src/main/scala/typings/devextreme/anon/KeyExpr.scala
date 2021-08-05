package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyExpr extends StObject {
  
  var dataSource: js.UndefOr[
    js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var predecessorIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var successorIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var typeExpr: js.UndefOr[String | js.Function] = js.undefined
}
object KeyExpr {
  
  inline def apply(): KeyExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyExpr]
  }
  
  extension [Self <: KeyExpr](x: Self) {
    
    inline def setDataSource(value: js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setPredecessorIdExpr(value: String | js.Function): Self = StObject.set(x, "predecessorIdExpr", value.asInstanceOf[js.Any])
    
    inline def setPredecessorIdExprUndefined: Self = StObject.set(x, "predecessorIdExpr", js.undefined)
    
    inline def setSuccessorIdExpr(value: String | js.Function): Self = StObject.set(x, "successorIdExpr", value.asInstanceOf[js.Any])
    
    inline def setSuccessorIdExprUndefined: Self = StObject.set(x, "successorIdExpr", js.undefined)
    
    inline def setTypeExpr(value: String | js.Function): Self = StObject.set(x, "typeExpr", value.asInstanceOf[js.Any])
    
    inline def setTypeExprUndefined: Self = StObject.set(x, "typeExpr", js.undefined)
  }
}
