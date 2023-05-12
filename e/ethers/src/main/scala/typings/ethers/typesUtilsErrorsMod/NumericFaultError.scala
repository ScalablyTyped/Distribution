package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.NUMERIC_FAULT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericFaultError
  extends StObject
     with EthersError[NUMERIC_FAULT] {
  
  /**
    *  The fault reported.
    */
  var fault: String
  
  /**
    *  The attempted operation.
    */
  var operation: String
  
  /**
    *  The value the operation was attempted against.
    */
  var value: Any
}
object NumericFaultError {
  
  inline def apply(code: ErrorCode, fault: String, message: String, name: String, operation: String, value: Any): NumericFaultError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fault = fault.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericFaultError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericFaultError] (val x: Self) extends AnyVal {
    
    inline def setFault(value: String): Self = StObject.set(x, "fault", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
