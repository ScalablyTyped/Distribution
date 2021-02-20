package typings.ethersprojectJsonWallets

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectJsonWallets.keystoreMod.EncryptOptions
import typings.ethersprojectJsonWallets.keystoreMod.KeystoreAccount
import typings.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/json-wallets", "decryptCrowdsale")
  @js.native
  def decryptCrowdsale(json: String, password: String): ExternallyOwnedAccount = js.native
  @JSImport("@ethersproject/json-wallets", "decryptCrowdsale")
  @js.native
  def decryptCrowdsale(json: String, password: Bytes): ExternallyOwnedAccount = js.native
  
  @JSImport("@ethersproject/json-wallets", "decryptJsonWallet")
  @js.native
  def decryptJsonWallet(json: String, password: String): js.Promise[ExternallyOwnedAccount] = js.native
  @JSImport("@ethersproject/json-wallets", "decryptJsonWallet")
  @js.native
  def decryptJsonWallet(json: String, password: String, progressCallback: ProgressCallback): js.Promise[ExternallyOwnedAccount] = js.native
  @JSImport("@ethersproject/json-wallets", "decryptJsonWallet")
  @js.native
  def decryptJsonWallet(json: String, password: Bytes): js.Promise[ExternallyOwnedAccount] = js.native
  @JSImport("@ethersproject/json-wallets", "decryptJsonWallet")
  @js.native
  def decryptJsonWallet(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[ExternallyOwnedAccount] = js.native
  
  @JSImport("@ethersproject/json-wallets", "decryptJsonWalletSync")
  @js.native
  def decryptJsonWalletSync(json: String, password: String): ExternallyOwnedAccount = js.native
  @JSImport("@ethersproject/json-wallets", "decryptJsonWalletSync")
  @js.native
  def decryptJsonWalletSync(json: String, password: Bytes): ExternallyOwnedAccount = js.native
  
  @JSImport("@ethersproject/json-wallets", "decryptKeystore")
  @js.native
  def decryptKeystore(json: String, password: String): js.Promise[KeystoreAccount] = js.native
  @JSImport("@ethersproject/json-wallets", "decryptKeystore")
  @js.native
  def decryptKeystore(json: String, password: String, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = js.native
  @JSImport("@ethersproject/json-wallets", "decryptKeystore")
  @js.native
  def decryptKeystore(json: String, password: Bytes): js.Promise[KeystoreAccount] = js.native
  @JSImport("@ethersproject/json-wallets", "decryptKeystore")
  @js.native
  def decryptKeystore(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = js.native
  
  @JSImport("@ethersproject/json-wallets", "decryptKeystoreSync")
  @js.native
  def decryptKeystoreSync(json: String, password: String): KeystoreAccount = js.native
  @JSImport("@ethersproject/json-wallets", "decryptKeystoreSync")
  @js.native
  def decryptKeystoreSync(json: String, password: Bytes): KeystoreAccount = js.native
  
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(account: ExternallyOwnedAccount, password: String): js.Promise[String] = js.native
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: String,
    options: js.UndefOr[scala.Nothing],
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(account: ExternallyOwnedAccount, password: String, options: EncryptOptions): js.Promise[String] = js.native
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: String,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(account: ExternallyOwnedAccount, password: Bytes): js.Promise[String] = js.native
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: js.UndefOr[scala.Nothing],
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(account: ExternallyOwnedAccount, password: Bytes, options: EncryptOptions): js.Promise[String] = js.native
  @JSImport("@ethersproject/json-wallets", "encryptKeystore")
  @js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  
  @JSImport("@ethersproject/json-wallets", "getJsonWalletAddress")
  @js.native
  def getJsonWalletAddress(json: String): String = js.native
  
  @JSImport("@ethersproject/json-wallets", "isCrowdsaleWallet")
  @js.native
  def isCrowdsaleWallet(json: String): Boolean = js.native
  
  @JSImport("@ethersproject/json-wallets", "isKeystoreWallet")
  @js.native
  def isKeystoreWallet(json: String): Boolean = js.native
}
