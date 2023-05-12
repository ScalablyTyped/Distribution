package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.UNSUPPORTED_OPERATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedOperationError
  extends StObject
     with EthersError[UNSUPPORTED_OPERATION] {
  
  /**
    *  The attempted operation.
    */
  var operation: String
}
object UnsupportedOperationError {
  
  inline def apply(code: ErrorCode, message: String, name: String, operation: String): UnsupportedOperationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsupportedOperationError] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
