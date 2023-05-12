package typings.ethers

import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesProvidersMod.AbstractSigner
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalletBaseWalletMod {
  
  @JSImport("ethers/types/wallet/base-wallet", "BaseWallet")
  @js.native
  open class BaseWallet protected () extends AbstractSigner[Null | Provider] {
    /**
      *  Creates a new BaseWallet for %%privateKey%%, optionally
      *  connected to %%provider%%.
      *
      *  If %%provider%% is not specified, only offline methods can
      *  be used.
      */
    def this(privateKey: SigningKey) = this()
    def this(privateKey: SigningKey, provider: Provider) = this()
    
    /**
      *  The wallet address.
      */
    val address: String = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The private key for this wallet.
      */
    def privateKey: String = js.native
    
    /**
      *  Returns the signature for %%message%% signed with this wallet.
      */
    def signMessageSync(message: String): String = js.native
    def signMessageSync(message: js.typedarray.Uint8Array): String = js.native
    
    /**
      *  The [[SigningKey]] used for signing payloads.
      */
    def signingKey: SigningKey = js.native
  }
}
