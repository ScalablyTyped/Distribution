package typings.ethersprojectJsonWallets

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectJsonWallets.libKeystoreMod.EncryptOptions
import typings.ethersprojectJsonWallets.libKeystoreMod.KeystoreAccount
import typings.ethersprojectJsonWallets.libKeystoreMod.ProgressCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/json-wallets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptCrowdsale(json: String, password: String): ExternallyOwnedAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsale")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[ExternallyOwnedAccount]
  inline def decryptCrowdsale(json: String, password: Bytes): ExternallyOwnedAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsale")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[ExternallyOwnedAccount]
  
  inline def decryptJsonWallet(json: String, password: String): js.Promise[ExternallyOwnedAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptJsonWallet")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExternallyOwnedAccount]]
  inline def decryptJsonWallet(json: String, password: String, progressCallback: ProgressCallback): js.Promise[ExternallyOwnedAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptJsonWallet")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExternallyOwnedAccount]]
  inline def decryptJsonWallet(json: String, password: Bytes): js.Promise[ExternallyOwnedAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptJsonWallet")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExternallyOwnedAccount]]
  inline def decryptJsonWallet(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[ExternallyOwnedAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptJsonWallet")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExternallyOwnedAccount]]
  
  inline def decryptJsonWalletSync(json: String, password: String): ExternallyOwnedAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptJsonWalletSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[ExternallyOwnedAccount]
  inline def decryptJsonWalletSync(json: String, password: Bytes): ExternallyOwnedAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptJsonWalletSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[ExternallyOwnedAccount]
  
  inline def decryptKeystore(json: String, password: String): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystore")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystore(json: String, password: String, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystore")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystore(json: String, password: Bytes): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystore")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  inline def decryptKeystore(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystore")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
  
  inline def decryptKeystoreSync(json: String, password: String): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  inline def decryptKeystoreSync(json: String, password: Bytes): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreSync")(json.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
  
  inline def encryptKeystore(account: ExternallyOwnedAccount, password: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: String,
    options: Unit,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystore(account: ExternallyOwnedAccount, password: String, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: String,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystore(account: ExternallyOwnedAccount, password: Bytes): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: Unit,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystore(account: ExternallyOwnedAccount, password: Bytes, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystore")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getJsonWalletAddress(json: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonWalletAddress")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isCrowdsaleWallet(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrowdsaleWallet")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKeystoreWallet(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeystoreWallet")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
