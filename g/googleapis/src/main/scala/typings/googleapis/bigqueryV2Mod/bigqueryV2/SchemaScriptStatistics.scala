package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScriptStatistics extends StObject {
  
  /**
    * [Output-only] Whether this child job was a statement or expression.
    */
  var evaluationKind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Stack trace showing the line/column/procedure name of each frame on the stack at the point where the current evaluation happened. The leaf frame is first, the primary script is last. Never empty.
    */
  var stackFrames: js.UndefOr[js.Array[SchemaScriptStackFrame]] = js.undefined
}
object SchemaScriptStatistics {
  
  inline def apply(): SchemaScriptStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptStatistics]
  }
  
  extension [Self <: SchemaScriptStatistics](x: Self) {
    
    inline def setEvaluationKind(value: String): Self = StObject.set(x, "evaluationKind", value.asInstanceOf[js.Any])
    
    inline def setEvaluationKindNull: Self = StObject.set(x, "evaluationKind", null)
    
    inline def setEvaluationKindUndefined: Self = StObject.set(x, "evaluationKind", js.undefined)
    
    inline def setStackFrames(value: js.Array[SchemaScriptStackFrame]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    inline def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
    
    inline def setStackFramesVarargs(value: SchemaScriptStackFrame*): Self = StObject.set(x, "stackFrames", js.Array(value*))
  }
}
