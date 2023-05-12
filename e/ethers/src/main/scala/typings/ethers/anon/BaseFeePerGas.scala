package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFeePerGas extends StObject {
  
  var baseFeePerGas: js.BigInt
}
object BaseFeePerGas {
  
  inline def apply(baseFeePerGas: js.BigInt): BaseFeePerGas = {
    val __obj = js.Dynamic.literal(baseFeePerGas = baseFeePerGas.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFeePerGas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFeePerGas] (val x: Self) extends AnyVal {
    
    inline def setBaseFeePerGas(value: js.BigInt): Self = StObject.set(x, "baseFeePerGas", value.asInstanceOf[js.Any])
  }
}
