package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GasPrice extends StObject {
  
  var gasPrice: js.BigInt
  
  var `type`: typings.ethers.ethersInts.`0`
}
object GasPrice {
  
  inline def apply(gasPrice: js.BigInt): GasPrice = {
    val __obj = js.Dynamic.literal(gasPrice = gasPrice.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0)
    __obj.asInstanceOf[GasPrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GasPrice] (val x: Self) extends AnyVal {
    
    inline def setGasPrice(value: js.BigInt): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.ethers.ethersInts.`0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
