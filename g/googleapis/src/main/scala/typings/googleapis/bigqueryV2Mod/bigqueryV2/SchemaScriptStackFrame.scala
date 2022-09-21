package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScriptStackFrame extends StObject {
  
  /**
    * [Output-only] One-based end column.
    */
  var endColumn: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output-only] One-based end line.
    */
  var endLine: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output-only] Name of the active procedure, empty if in a top-level script.
    */
  var procedureId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] One-based start column.
    */
  var startColumn: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output-only] One-based start line.
    */
  var startLine: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output-only] Text of the current statement/expression.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaScriptStackFrame {
  
  inline def apply(): SchemaScriptStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptStackFrame]
  }
  
  extension [Self <: SchemaScriptStackFrame](x: Self) {
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnNull: Self = StObject.set(x, "endColumn", null)
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineNull: Self = StObject.set(x, "endLine", null)
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setProcedureId(value: String): Self = StObject.set(x, "procedureId", value.asInstanceOf[js.Any])
    
    inline def setProcedureIdNull: Self = StObject.set(x, "procedureId", null)
    
    inline def setProcedureIdUndefined: Self = StObject.set(x, "procedureId", js.undefined)
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnNull: Self = StObject.set(x, "startColumn", null)
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartLineNull: Self = StObject.set(x, "startLine", null)
    
    inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
