package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorVariables extends StObject {
  
  /**
    * Specifies a collection of variables available for a user.
    */
  var dataSource: js.UndefOr[(DataSourceLike[String, Any]) | Null] = js.undefined
  
  /**
    * Specifies the special character(s) that should surround the variables.
    */
  var escapeChar: js.UndefOr[String | js.Array[String]] = js.undefined
}
object dxHtmlEditorVariables {
  
  inline def apply(): dxHtmlEditorVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorVariables] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSourceLike[String, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: String*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setEscapeChar(value: String | js.Array[String]): Self = StObject.set(x, "escapeChar", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharUndefined: Self = StObject.set(x, "escapeChar", js.undefined)
    
    inline def setEscapeCharVarargs(value: String*): Self = StObject.set(x, "escapeChar", js.Array(value*))
  }
}
