package typings.dexie.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieError
  extends StObject
     with Error {
  
  var inner: Any
  
  @JSName("stack")
  var stack_DexieError: String
}
object DexieError {
  
  inline def apply(inner: Any, message: String, name: String, stack: String): DexieError = {
    val __obj = js.Dynamic.literal(inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DexieError]
  }
  
  extension [Self <: DexieError](x: Self) {
    
    inline def setInner(value: Any): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
