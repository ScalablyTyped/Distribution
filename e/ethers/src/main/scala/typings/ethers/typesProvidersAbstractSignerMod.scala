package typings.ethers

import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesProvidersSignerMod.Signer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersAbstractSignerMod {
  
  /* note: abstract class */ @JSImport("ethers/types/providers/abstract-signer", "AbstractSigner")
  @js.native
  open class AbstractSigner[P /* <: Null | Provider */] ()
    extends StObject
       with Signer {
    def this(provider: P) = this()
    
    @JSName("call")
    def call_MAbstractSigner(tx: TransactionRequest): js.Promise[String] = js.native
    
    @JSName("estimateGas")
    def estimateGas_MAbstractSigner(tx: TransactionRequest): js.Promise[js.BigInt] = js.native
    
    /**
      *  Get the object address.
      */
    /* CompleteClass */
    override def getAddress(): js.Promise[String] = js.native
    
    /* CompleteClass */
    var provider: Null | Provider = js.native
    @JSName("provider")
    val provider_AbstractSigner: P = js.native
    
    /**
      *  Resolve to the address for the ENS %%name%%.
      *
      *  Resolves to ``null`` if the name is unconfigued. Use
      *  [[resolveAddress]] (passing this object as %%resolver%%) to
      *  throw for names that are unconfigured.
      */
    /* CompleteClass */
    override def resolveName(name: String): js.Promise[Null | String] = js.native
    @JSName("resolveName")
    def resolveName_MAbstractSigner(name: String): js.Promise[Null | String] = js.native
    
    @JSName("sendTransaction")
    def sendTransaction_MAbstractSigner(tx: TransactionRequest): js.Promise[TransactionResponse] = js.native
  }
  
  @JSImport("ethers/types/providers/abstract-signer", "VoidSigner")
  @js.native
  open class VoidSigner protected () extends AbstractSigner[Null | Provider] {
    def this(address: String) = this()
    def this(address: String, provider: Provider) = this()
    
    val address: String = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
