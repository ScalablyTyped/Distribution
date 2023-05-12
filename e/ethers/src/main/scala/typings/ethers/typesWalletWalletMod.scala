package typings.ethers

import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesWalletBaseWalletMod.BaseWallet
import typings.ethers.typesWalletHdwalletMod.HDNodeWallet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalletWalletMod {
  
  @JSImport("ethers/types/wallet/wallet", "Wallet")
  @js.native
  open class Wallet protected () extends BaseWallet {
    /**
      *  Create a new wallet for the %%privateKey%%, optionally connected
      *  to %%provider%%.
      */
    def this(key: String) = this()
    def this(key: SigningKey) = this()
    def this(key: String, provider: Provider) = this()
    def this(key: SigningKey, provider: Provider) = this()
    
    def encrypt(password: String): js.Promise[String] = js.native
    def encrypt(password: String, progressCallback: ProgressCallback): js.Promise[String] = js.native
    /**
      *  Resolves to a [JSON Keystore Wallet](json-wallets) encrypted with
      *  %%password%%.
      *
      *  If %%progressCallback%% is specified, it will receive periodic
      *  updates as the encryption process progreses.
      */
    def encrypt(password: js.typedarray.Uint8Array): js.Promise[String] = js.native
    def encrypt(password: js.typedarray.Uint8Array, progressCallback: ProgressCallback): js.Promise[String] = js.native
    
    def encryptSync(password: String): String = js.native
    /**
      *  Returns a [JSON Keystore Wallet](json-wallets) encryped with
      *  %%password%%.
      *
      *  It is preferred to use the [async version](encrypt) instead,
      *  which allows a [[ProgressCallback]] to keep the user informed.
      *
      *  This method will block the event loop (freezing all UI) until
      *  it is complete, which may be a non-trivial duration.
      */
    def encryptSync(password: js.typedarray.Uint8Array): String = js.native
  }
  /* static members */
  object Wallet {
    
    @JSImport("ethers/types/wallet/wallet", "Wallet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new random [[HDNodeWallet]] using the avavilable
      *  [cryptographic random source](randomBytes).
      *
      *  If there is no crytographic random source, this will throw.
      */
    inline def createRandom(): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[HDNodeWallet]
    inline def createRandom(provider: Provider): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(provider.asInstanceOf[js.Any]).asInstanceOf[HDNodeWallet]
    
    inline def fromEncryptedJson(json: String, password: String): js.Promise[HDNodeWallet | Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HDNodeWallet | Wallet]]
    inline def fromEncryptedJson(json: String, password: String, progress: ProgressCallback): js.Promise[HDNodeWallet | Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HDNodeWallet | Wallet]]
    /**
      *  Creates (asynchronously) a **Wallet** by decrypting the %%json%%
      *  with %%password%%.
      *
      *  If %%progress%% is provided, it is called periodically during
      *  decryption so that any UI can be updated.
      */
    inline def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array): js.Promise[HDNodeWallet | Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HDNodeWallet | Wallet]]
    inline def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[HDNodeWallet | Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HDNodeWallet | Wallet]]
    
    inline def fromEncryptedJsonSync(json: String, password: String): HDNodeWallet | Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet | Wallet]
    /**
      *  Creates a **Wallet** by decrypting the %%json%% with %%password%%.
      *
      *  The [[fromEncryptedJson]] method is preferred, as this method
      *  will lock up and freeze the UI during decryption, which may take
      *  some time.
      */
    inline def fromEncryptedJsonSync(json: String, password: js.typedarray.Uint8Array): HDNodeWallet | Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet | Wallet]
    
    /**
      *  Creates a [[HDNodeWallet]] for %%phrase%%.
      */
    inline def fromPhrase(phrase: String): HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[HDNodeWallet]
    inline def fromPhrase(phrase: String, provider: Provider): HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[HDNodeWallet]
  }
}
