package typings.ecmarkup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmErrorReporterTypeMod {
  
  trait LintingError extends StObject {
    
    var column: Double
    
    var line: Double
    
    var message: String
    
    var ruleId: String
  }
  object LintingError {
    
    inline def apply(column: Double, line: Double, message: String, ruleId: String): LintingError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintingError]
    }
    
    extension [Self <: LintingError](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    }
  }
  
  type Reporter = js.Function1[/* lintingError */ LintingError, Unit]
}
