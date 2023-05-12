package typings.ethers.anon

import typings.ethers.ethersStrings.getBalance
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressBlockTag
  extends StObject
     with PerformActionRequest {
  
  var address: String
  
  var blockTag: typings.ethers.typesProvidersProviderMod.BlockTag
  
  var method: getBalance
}
object AddressBlockTag {
  
  inline def apply(address: String, blockTag: typings.ethers.typesProvidersProviderMod.BlockTag): AddressBlockTag = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getBalance")
    __obj.asInstanceOf[AddressBlockTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressBlockTag] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBlockTag(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getBalance): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
