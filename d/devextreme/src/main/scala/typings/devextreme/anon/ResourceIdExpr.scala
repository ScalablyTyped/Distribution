package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceIdExpr extends StObject {
  
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  
  var resourceIdExpr: js.UndefOr[String | js.Function] = js.native
  
  var taskIdExpr: js.UndefOr[String | js.Function] = js.native
}
object ResourceIdExpr {
  
  @scala.inline
  def apply(): ResourceIdExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdExpr]
  }
  
  @scala.inline
  implicit class ResourceIdExprMutableBuilder[Self <: ResourceIdExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    @scala.inline
    def setResourceIdExpr(value: String | js.Function): Self = StObject.set(x, "resourceIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdExprUndefined: Self = StObject.set(x, "resourceIdExpr", js.undefined)
    
    @scala.inline
    def setTaskIdExpr(value: String | js.Function): Self = StObject.set(x, "taskIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdExprUndefined: Self = StObject.set(x, "taskIdExpr", js.undefined)
  }
}
