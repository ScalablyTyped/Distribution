package typings.ethers.anon

import typings.ethers.ethersStrings.getBlock
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockHashIncludeTransactions
  extends StObject
     with PerformActionRequest {
  
  var blockHash: String
  
  var includeTransactions: Boolean
  
  var method: getBlock
}
object BlockHashIncludeTransactions {
  
  inline def apply(blockHash: String, includeTransactions: Boolean): BlockHashIncludeTransactions = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], includeTransactions = includeTransactions.asInstanceOf[js.Any], method = "getBlock")
    __obj.asInstanceOf[BlockHashIncludeTransactions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockHashIncludeTransactions] (val x: Self) extends AnyVal {
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setIncludeTransactions(value: Boolean): Self = StObject.set(x, "includeTransactions", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getBlock): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
