package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.INVALID_ARGUMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidArgumentError
  extends StObject
     with EthersError[INVALID_ARGUMENT] {
  
  /**
    *  The name of the argument.
    */
  var argument: String
  
  /**
    *  The value that was provided.
    */
  var value: Any
}
object InvalidArgumentError {
  
  inline def apply(argument: String, code: ErrorCode, message: String, name: String, value: Any): InvalidArgumentError = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidArgumentError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidArgumentError] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
