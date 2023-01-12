package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackTraceId extends StObject {
  
  var debuggerId: js.UndefOr[UniqueDebuggerId] = js.undefined
  
  var id: String
}
object StackTraceId {
  
  inline def apply(id: String): StackTraceId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackTraceId] (val x: Self) extends AnyVal {
    
    inline def setDebuggerId(value: UniqueDebuggerId): Self = StObject.set(x, "debuggerId", value.asInstanceOf[js.Any])
    
    inline def setDebuggerIdUndefined: Self = StObject.set(x, "debuggerId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
