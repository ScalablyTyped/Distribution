package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerAddress extends StObject {
  
  var debuggerAddress: String
}
object DebuggerAddress {
  
  inline def apply(debuggerAddress: String): DebuggerAddress = {
    val __obj = js.Dynamic.literal(debuggerAddress = debuggerAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebuggerAddress] (val x: Self) extends AnyVal {
    
    inline def setDebuggerAddress(value: String): Self = StObject.set(x, "debuggerAddress", value.asInstanceOf[js.Any])
  }
}
