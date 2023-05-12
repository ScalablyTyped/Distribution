package typings.ethers

import typings.ethers.typesProvidersAbstractSignerMod.AbstractSigner
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesProvidersSignerMod.Signer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersSignerNoncemanagerMod {
  
  @JSImport("ethers/types/providers/signer-noncemanager", "NonceManager")
  @js.native
  open class NonceManager protected () extends AbstractSigner[Null | Provider] {
    def this(signer: Signer) = this()
    
    def increment(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def reset(): Unit = js.native
    
    @JSName("sendTransaction")
    def sendTransaction_MNonceManager(tx: TransactionRequest): js.Promise[TransactionResponse] = js.native
    
    var signer: Signer = js.native
  }
}
