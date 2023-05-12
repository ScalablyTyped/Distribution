package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.BAD_DATA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadDataError
  extends StObject
     with EthersError[BAD_DATA] {
  
  /**
    *  The data.
    */
  var value: Any
}
object BadDataError {
  
  inline def apply(code: ErrorCode, message: String, name: String, value: Any): BadDataError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadDataError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BadDataError] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
