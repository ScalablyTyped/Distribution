package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.MISSING_ARGUMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingArgumentError
  extends StObject
     with EthersError[MISSING_ARGUMENT] {
  
  /**
    *  The number of arguments received.
    */
  var count: Double
  
  /**
    *  The number of arguments expected.
    */
  var expectedCount: Double
}
object MissingArgumentError {
  
  inline def apply(code: ErrorCode, count: Double, expectedCount: Double, message: String, name: String): MissingArgumentError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], expectedCount = expectedCount.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingArgumentError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MissingArgumentError] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setExpectedCount(value: Double): Self = StObject.set(x, "expectedCount", value.asInstanceOf[js.Any])
  }
}
