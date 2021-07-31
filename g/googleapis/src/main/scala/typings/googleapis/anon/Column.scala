package typings.googleapis.anon

import typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.SchemaReportApiColumnSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: js.UndefOr[SchemaReportApiColumnSpec] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Column {
  
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: SchemaReportApiColumnSpec): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
