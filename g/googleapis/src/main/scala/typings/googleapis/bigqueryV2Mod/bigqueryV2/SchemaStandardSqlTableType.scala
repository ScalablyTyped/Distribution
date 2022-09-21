package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStandardSqlTableType extends StObject {
  
  /**
    * The columns in this table type
    */
  var columns: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.undefined
}
object SchemaStandardSqlTableType {
  
  inline def apply(): SchemaStandardSqlTableType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlTableType]
  }
  
  extension [Self <: SchemaStandardSqlTableType](x: Self) {
    
    inline def setColumns(value: js.Array[SchemaStandardSqlField]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SchemaStandardSqlField*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
