package typings.ethers.anon

import typings.ethers.ethersStrings.getCode
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockTagMethod
  extends StObject
     with PerformActionRequest {
  
  var address: String
  
  var blockTag: typings.ethers.typesProvidersProviderMod.BlockTag
  
  var method: getCode
}
object BlockTagMethod {
  
  inline def apply(address: String, blockTag: typings.ethers.typesProvidersProviderMod.BlockTag): BlockTagMethod = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getCode")
    __obj.asInstanceOf[BlockTagMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockTagMethod] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBlockTag(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getCode): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
