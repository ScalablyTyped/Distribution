package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndExpr extends StObject {
  
  /**
    * Specifies the data field that provides tasks&apos; color.
    */
  var colorExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Binds the UI component to the data source which contains tasks.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies the data field that provides tasks&apos; end dates.
    */
  var endExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides keys for tasks.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides tasks&apos; parent IDs.
    */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides tasks&apos; progress.
    */
  var progressExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides tasks&apos; start dates.
    */
  var startExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides task titles.
    */
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
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
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
