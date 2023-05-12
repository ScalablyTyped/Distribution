package typings.ethers.anon

import typings.ethers.typesTransactionMod.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxFeePerGas extends StObject {
  
  var accessList: typings.ethers.typesTransactionMod.AccessList
  
  var maxFeePerGas: Null
  
  var maxPriorityFeePerGas: Null
}
object MaxFeePerGas {
  
  inline def apply(
    accessList: typings.ethers.typesTransactionMod.AccessList,
    maxFeePerGas: Null,
    maxPriorityFeePerGas: Null
  ): MaxFeePerGas = {
    val __obj = js.Dynamic.literal(accessList = accessList.asInstanceOf[js.Any], maxFeePerGas = maxFeePerGas.asInstanceOf[js.Any], maxPriorityFeePerGas = maxPriorityFeePerGas.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxFeePerGas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxFeePerGas] (val x: Self) extends AnyVal {
    
    inline def setAccessList(value: typings.ethers.typesTransactionMod.AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
    
    inline def setAccessListVarargs(value: AccessListEntry*): Self = StObject.set(x, "accessList", js.Array(value*))
    
    inline def setMaxFeePerGas(value: Null): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGas(value: Null): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
  }
}
