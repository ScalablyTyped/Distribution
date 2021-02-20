package typings.ecmarkup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmErrorReporterTypeMod {
  
  @js.native
  trait LintingError extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var message: String = js.native
    
    var ruleId: String = js.native
  }
  object LintingError {
    
    @scala.inline
    def apply(column: Double, line: Double, message: String, ruleId: String): LintingError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintingError]
    }
    
    @scala.inline
    implicit class LintingErrorMutableBuilder[Self <: LintingError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    }
  }
  
  type Reporter = js.Function1[/* lintingError */ LintingError, Unit]
}
