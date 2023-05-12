package typings.ethers.anon

import typings.ethers.typesTransactionMod.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessListGasPrice extends StObject {
  
  var accessList: typings.ethers.typesTransactionMod.AccessList
  
  var gasPrice: js.BigInt
  
  var `type`: typings.ethers.ethersInts.`1`
}
object AccessListGasPrice {
  
  inline def apply(accessList: typings.ethers.typesTransactionMod.AccessList, gasPrice: js.BigInt): AccessListGasPrice = {
    val __obj = js.Dynamic.literal(accessList = accessList.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[AccessListGasPrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessListGasPrice] (val x: Self) extends AnyVal {
    
    inline def setAccessList(value: typings.ethers.typesTransactionMod.AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
    
    inline def setAccessListVarargs(value: AccessListEntry*): Self = StObject.set(x, "accessList", js.Array(value*))
    
    inline def setGasPrice(value: js.BigInt): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.ethers.ethersInts.`1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
