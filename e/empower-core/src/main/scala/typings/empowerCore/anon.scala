package typings.empowerCore

import typings.empowerCore.mod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OriginalMessage extends StObject {
    
    var originalMessage: String
    
    var powerAssertContext: Any
  }
  object OriginalMessage {
    
    inline def apply(originalMessage: String, powerAssertContext: Any): OriginalMessage = {
      val __obj = js.Dynamic.literal(originalMessage = originalMessage.asInstanceOf[js.Any], powerAssertContext = powerAssertContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalMessage]
    }
    
    extension [Self <: OriginalMessage](x: Self) {
      
      inline def setOriginalMessage(value: String): Self = StObject.set(x, "originalMessage", value.asInstanceOf[js.Any])
      
      inline def setPowerAssertContext(value: Any): Self = StObject.set(x, "powerAssertContext", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<std.Omit<empower-core.empower-core.Options, 'modifyMessageBeforeAssert'>> */
  trait RequiredOmitOptionsmodify extends StObject {
    
    var bindReceiver: Boolean
    
    var destructive: Boolean
    
    def onError(event: Any): Any
    @JSName("onError")
    var onError_Original: js.Function1[/* event */ Any, Any]
    
    def onSuccess(event: Any): Any
    @JSName("onSuccess")
    var onSuccess_Original: js.Function1[/* event */ Any, Any]
    
    var patterns: js.Array[Pattern]
    
    var wrapOnlyPatterns: js.Array[Pattern]
  }
  object RequiredOmitOptionsmodify {
    
    inline def apply(
      bindReceiver: Boolean,
      destructive: Boolean,
      onError: /* event */ Any => Any,
      onSuccess: /* event */ Any => Any,
      patterns: js.Array[Pattern],
      wrapOnlyPatterns: js.Array[Pattern]
    ): RequiredOmitOptionsmodify = {
      val __obj = js.Dynamic.literal(bindReceiver = bindReceiver.asInstanceOf[js.Any], destructive = destructive.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onSuccess = js.Any.fromFunction1(onSuccess), patterns = patterns.asInstanceOf[js.Any], wrapOnlyPatterns = wrapOnlyPatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOmitOptionsmodify]
    }
    
    extension [Self <: RequiredOmitOptionsmodify](x: Self) {
      
      inline def setBindReceiver(value: Boolean): Self = StObject.set(x, "bindReceiver", value.asInstanceOf[js.Any])
      
      inline def setDestructive(value: Boolean): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: /* event */ Any => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: /* event */ Any => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setWrapOnlyPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "wrapOnlyPatterns", value.asInstanceOf[js.Any])
      
      inline def setWrapOnlyPatternsVarargs(value: Pattern*): Self = StObject.set(x, "wrapOnlyPatterns", js.Array(value*))
    }
  }
}
