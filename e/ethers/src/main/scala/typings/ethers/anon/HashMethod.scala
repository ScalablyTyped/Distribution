package typings.ethers.anon

import typings.ethers.ethersStrings.getTransaction
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashMethod
  extends StObject
     with PerformActionRequest {
  
  var hash: String
  
  var method: getTransaction
}
object HashMethod {
  
  inline def apply(hash: String): HashMethod = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = "getTransaction")
    __obj.asInstanceOf[HashMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashMethod] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getTransaction): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
