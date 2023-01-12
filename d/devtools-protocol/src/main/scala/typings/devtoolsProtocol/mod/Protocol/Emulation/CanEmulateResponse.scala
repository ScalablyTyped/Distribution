package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanEmulateResponse extends StObject {
  
  /**
    * True if emulation is supported.
    */
  var result: Boolean
}
object CanEmulateResponse {
  
  inline def apply(result: Boolean): CanEmulateResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanEmulateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanEmulateResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
