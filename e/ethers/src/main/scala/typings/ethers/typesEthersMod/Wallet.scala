package typings.ethers.typesEthersMod

import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "Wallet")
@js.native
open class Wallet protected ()
  extends typings.ethers.typesWalletMod.Wallet {
  /**
    *  Create a new wallet for the %%privateKey%%, optionally connected
    *  to %%provider%%.
    */
  def this(key: String) = this()
  def this(key: typings.ethers.typesCryptoMod.SigningKey) = this()
  def this(key: String, provider: Provider) = this()
  def this(key: typings.ethers.typesCryptoMod.SigningKey, provider: Provider) = this()
}
/* static members */
object Wallet {
  
  @JSImport("ethers/types/ethers", "Wallet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Creates a new random [[HDNodeWallet]] using the avavilable
    *  [cryptographic random source](randomBytes).
    *
    *  If there is no crytographic random source, this will throw.
    */
  inline def createRandom(): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")().asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def createRandom(provider: Provider): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(provider.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  
  inline def fromEncryptedJson(json: String, password: String): js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ]]
  inline def fromEncryptedJson(json: String, password: String, progress: ProgressCallback): js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ]]
  /**
    *  Creates (asynchronously) a **Wallet** by decrypting the %%json%%
    *  with %%password%%.
    *
    *  If %%progress%% is provided, it is called periodically during
    *  decryption so that any UI can be updated.
    */
  inline def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array): js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ]]
  inline def fromEncryptedJson(json: String, password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJson")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet
  ]]
  
  inline def fromEncryptedJsonSync(json: String, password: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet]
  /**
    *  Creates a **Wallet** by decrypting the %%json%% with %%password%%.
    *
    *  The [[fromEncryptedJson]] method is preferred, as this method
    *  will lock up and freeze the UI during decryption, which may take
    *  some time.
    */
  inline def fromEncryptedJsonSync(json: String, password: js.typedarray.Uint8Array): typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncryptedJsonSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet | typings.ethers.typesWalletWalletMod.Wallet]
  
  /**
    *  Creates a [[HDNodeWallet]] for %%phrase%%.
    */
  inline def fromPhrase(phrase: String): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
  inline def fromPhrase(phrase: String, provider: Provider): typings.ethers.typesWalletHdwalletMod.HDNodeWallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletHdwalletMod.HDNodeWallet]
}
