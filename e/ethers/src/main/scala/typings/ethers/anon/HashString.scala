package typings.ethers.anon

import typings.ethers.ethersStrings.getTransactionReceipt
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashString
  extends StObject
     with PerformActionRequest {
  
  var hash: String
  
  var method: getTransactionReceipt
}
object HashString {
  
  inline def apply(hash: String): HashString = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = "getTransactionReceipt")
    __obj.asInstanceOf[HashString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashString] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getTransactionReceipt): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
