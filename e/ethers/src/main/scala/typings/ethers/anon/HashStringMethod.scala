package typings.ethers.anon

import typings.ethers.ethersStrings.getTransactionResult
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashStringMethod
  extends StObject
     with PerformActionRequest {
  
  var hash: String
  
  var method: getTransactionResult
}
object HashStringMethod {
  
  inline def apply(hash: String): HashStringMethod = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = "getTransactionResult")
    __obj.asInstanceOf[HashStringMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashStringMethod] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getTransactionResult): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
