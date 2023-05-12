package typings.ethers.anon

import typings.ethers.ethersStrings.call
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockTag
  extends StObject
     with PerformActionRequest {
  
  var blockTag: typings.ethers.typesProvidersProviderMod.BlockTag
  
  var method: call
  
  var transaction: PerformActionTransaction
}
object BlockTag {
  
  inline def apply(blockTag: typings.ethers.typesProvidersProviderMod.BlockTag, transaction: PerformActionTransaction): BlockTag = {
    val __obj = js.Dynamic.literal(blockTag = blockTag.asInstanceOf[js.Any], method = "call", transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockTag] (val x: Self) extends AnyVal {
    
    inline def setBlockTag(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: call): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: PerformActionTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
