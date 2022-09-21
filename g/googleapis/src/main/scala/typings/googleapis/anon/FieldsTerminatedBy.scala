package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsTerminatedBy extends StObject {
  
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  var escapeCharacter: js.UndefOr[String] = js.undefined
  
  var fieldsTerminatedBy: js.UndefOr[String] = js.undefined
  
  var linesTerminatedBy: js.UndefOr[String] = js.undefined
  
  var quoteCharacter: js.UndefOr[String] = js.undefined
  
  var table: js.UndefOr[String] = js.undefined
}
object FieldsTerminatedBy {
  
  inline def apply(): FieldsTerminatedBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsTerminatedBy]
  }
  
  extension [Self <: FieldsTerminatedBy](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setEscapeCharacter(value: String): Self = StObject.set(x, "escapeCharacter", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharacterUndefined: Self = StObject.set(x, "escapeCharacter", js.undefined)
    
    inline def setFieldsTerminatedBy(value: String): Self = StObject.set(x, "fieldsTerminatedBy", value.asInstanceOf[js.Any])
    
    inline def setFieldsTerminatedByUndefined: Self = StObject.set(x, "fieldsTerminatedBy", js.undefined)
    
    inline def setLinesTerminatedBy(value: String): Self = StObject.set(x, "linesTerminatedBy", value.asInstanceOf[js.Any])
    
    inline def setLinesTerminatedByUndefined: Self = StObject.set(x, "linesTerminatedBy", js.undefined)
    
    inline def setQuoteCharacter(value: String): Self = StObject.set(x, "quoteCharacter", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharacterUndefined: Self = StObject.set(x, "quoteCharacter", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
