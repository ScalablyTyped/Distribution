package typings.empower

import typings.empowerCore.mod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<empower.empower.Options> */
  trait RequiredOptions extends StObject {
    
    var bindReceiver: Boolean
    
    var destructive: Boolean
    
    var modifyMessageOnRethrow: Boolean
    
    def onSuccess(event: Any): Any
    @JSName("onSuccess")
    var onSuccess_Original: js.Function1[/* event */ Any, Any]
    
    var patterns: js.Array[Pattern]
    
    var saveContextOnRethrow: Boolean
    
    var wrapOnlyPatterns: js.Array[Pattern]
  }
  object RequiredOptions {
    
    inline def apply(
      bindReceiver: Boolean,
      destructive: Boolean,
      modifyMessageOnRethrow: Boolean,
      onSuccess: /* event */ Any => Any,
      patterns: js.Array[Pattern],
      saveContextOnRethrow: Boolean,
      wrapOnlyPatterns: js.Array[Pattern]
    ): RequiredOptions = {
      val __obj = js.Dynamic.literal(bindReceiver = bindReceiver.asInstanceOf[js.Any], destructive = destructive.asInstanceOf[js.Any], modifyMessageOnRethrow = modifyMessageOnRethrow.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction1(onSuccess), patterns = patterns.asInstanceOf[js.Any], saveContextOnRethrow = saveContextOnRethrow.asInstanceOf[js.Any], wrapOnlyPatterns = wrapOnlyPatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredOptions] (val x: Self) extends AnyVal {
      
      inline def setBindReceiver(value: Boolean): Self = StObject.set(x, "bindReceiver", value.asInstanceOf[js.Any])
      
      inline def setDestructive(value: Boolean): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
      
      inline def setModifyMessageOnRethrow(value: Boolean): Self = StObject.set(x, "modifyMessageOnRethrow", value.asInstanceOf[js.Any])
      
      inline def setOnSuccess(value: /* event */ Any => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setSaveContextOnRethrow(value: Boolean): Self = StObject.set(x, "saveContextOnRethrow", value.asInstanceOf[js.Any])
      
      inline def setWrapOnlyPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "wrapOnlyPatterns", value.asInstanceOf[js.Any])
      
      inline def setWrapOnlyPatternsVarargs(value: Pattern*): Self = StObject.set(x, "wrapOnlyPatterns", js.Array(value*))
    }
  }
}
