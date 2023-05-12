package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.NOT_IMPLEMENTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotImplementedError
  extends StObject
     with EthersError[NOT_IMPLEMENTED] {
  
  /**
    *  The attempted operation.
    */
  var operation: String
}
object NotImplementedError {
  
  inline def apply(code: ErrorCode, message: String, name: String, operation: String): NotImplementedError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotImplementedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotImplementedError] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
