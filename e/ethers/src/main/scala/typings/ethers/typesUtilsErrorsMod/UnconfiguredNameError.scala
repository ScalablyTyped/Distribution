package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.UNCONFIGURED_NAME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnconfiguredNameError
  extends StObject
     with EthersError[UNCONFIGURED_NAME] {
  
  /**
    *  The ENS name that was requested
    */
  var value: String
}
object UnconfiguredNameError {
  
  inline def apply(code: ErrorCode, message: String, name: String, value: String): UnconfiguredNameError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnconfiguredNameError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnconfiguredNameError] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
