package typings.ethers.anon

import typings.ethers.ethersStrings.broadcastTransaction
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method
  extends StObject
     with PerformActionRequest {
  
  var method: broadcastTransaction
  
  var signedTransaction: String
}
object Method {
  
  inline def apply(signedTransaction: String): Method = {
    val __obj = js.Dynamic.literal(method = "broadcastTransaction", signedTransaction = signedTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: broadcastTransaction): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setSignedTransaction(value: String): Self = StObject.set(x, "signedTransaction", value.asInstanceOf[js.Any])
  }
}
