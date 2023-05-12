package typings.ethers.anon

import typings.ethers.typesTransactionMod.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessListMaxFeePerGas extends StObject {
  
  var accessList: typings.ethers.typesTransactionMod.AccessList
  
  var maxFeePerGas: js.BigInt
  
  var maxPriorityFeePerGas: js.BigInt
  
  var `type`: typings.ethers.ethersInts.`2`
}
object AccessListMaxFeePerGas {
  
  inline def apply(
    accessList: typings.ethers.typesTransactionMod.AccessList,
    maxFeePerGas: js.BigInt,
    maxPriorityFeePerGas: js.BigInt
  ): AccessListMaxFeePerGas = {
    val __obj = js.Dynamic.literal(accessList = accessList.asInstanceOf[js.Any], maxFeePerGas = maxFeePerGas.asInstanceOf[js.Any], maxPriorityFeePerGas = maxPriorityFeePerGas.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[AccessListMaxFeePerGas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessListMaxFeePerGas] (val x: Self) extends AnyVal {
    
    inline def setAccessList(value: typings.ethers.typesTransactionMod.AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
    
    inline def setAccessListVarargs(value: AccessListEntry*): Self = StObject.set(x, "accessList", js.Array(value*))
    
    inline def setMaxFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.ethers.ethersInts.`2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
