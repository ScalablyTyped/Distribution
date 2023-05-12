package typings.ethers.anon

import typings.ethers.ethersStrings.getBlock
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeTransactions
  extends StObject
     with PerformActionRequest {
  
  var blockTag: typings.ethers.typesProvidersProviderMod.BlockTag
  
  var includeTransactions: Boolean
  
  var method: getBlock
}
object IncludeTransactions {
  
  inline def apply(blockTag: typings.ethers.typesProvidersProviderMod.BlockTag, includeTransactions: Boolean): IncludeTransactions = {
    val __obj = js.Dynamic.literal(blockTag = blockTag.asInstanceOf[js.Any], includeTransactions = includeTransactions.asInstanceOf[js.Any], method = "getBlock")
    __obj.asInstanceOf[IncludeTransactions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeTransactions] (val x: Self) extends AnyVal {
    
    inline def setBlockTag(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
    
    inline def setIncludeTransactions(value: Boolean): Self = StObject.set(x, "includeTransactions", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getBlock): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
