package typings.ethers.anon

import typings.ethers.ethersStrings.getTransactionCount
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressBlockTagMethod
  extends StObject
     with PerformActionRequest {
  
  var address: String
  
  var blockTag: typings.ethers.typesProvidersProviderMod.BlockTag
  
  var method: getTransactionCount
}
object AddressBlockTagMethod {
  
  inline def apply(address: String, blockTag: typings.ethers.typesProvidersProviderMod.BlockTag): AddressBlockTagMethod = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getTransactionCount")
    __obj.asInstanceOf[AddressBlockTagMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressBlockTagMethod] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBlockTag(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getTransactionCount): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
