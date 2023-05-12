package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.BUFFER_OVERRUN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferOverrunError
  extends StObject
     with EthersError[BUFFER_OVERRUN] {
  
  /**
    *  The buffer that was overrun.
    */
  var buffer: js.typedarray.Uint8Array
  
  /**
    *  The length of the buffer.
    */
  var length: Double
  
  /**
    *  The offset that was requested.
    */
  var offset: Double
}
object BufferOverrunError {
  
  inline def apply(
    buffer: js.typedarray.Uint8Array,
    code: ErrorCode,
    length: Double,
    message: String,
    name: String,
    offset: Double
  ): BufferOverrunError = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOverrunError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferOverrunError] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
