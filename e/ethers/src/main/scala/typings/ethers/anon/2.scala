package typings.ethers.anon

import typings.ethers.ethersStrings.getGasPrice
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with PerformActionRequest {
  
  var method: getGasPrice
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(method = "getGasPrice")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: getGasPrice): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
