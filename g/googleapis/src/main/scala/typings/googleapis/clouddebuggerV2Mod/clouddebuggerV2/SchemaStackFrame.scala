package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStackFrame extends StObject {
  
  /**
    * Set of arguments passed to this function. Note that this might not be populated for all stack frames.
    */
  var arguments: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
  
  /**
    * Demangled function name at the call site.
    */
  var function: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of local variables at the stack frame location. Note that this might not be populated for all stack frames.
    */
  var locals: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
  
  /**
    * Source location of the call site.
    */
  var location: js.UndefOr[SchemaSourceLocation] = js.undefined
}
object SchemaStackFrame {
  
  inline def apply(): SchemaStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackFrame]
  }
  
  extension [Self <: SchemaStackFrame](x: Self) {
    
    inline def setArguments(value: js.Array[SchemaVariable]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: SchemaVariable*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionNull: Self = StObject.set(x, "function", null)
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setLocals(value: js.Array[SchemaVariable]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    inline def setLocalsVarargs(value: SchemaVariable*): Self = StObject.set(x, "locals", js.Array(value*))
    
    inline def setLocation(value: SchemaSourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
