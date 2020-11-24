package typings.ethersprojectJsonWallets

import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectJsonWallets.keystoreMod.EncryptOptions
import typings.ethersprojectJsonWallets.keystoreMod.KeystoreAccount
import typings.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decryptCrowdsale(json: String, password: String): ExternallyOwnedAccount = js.native
  def decryptCrowdsale(json: String, password: Bytes): ExternallyOwnedAccount = js.native
  
  def decryptJsonWallet(json: String, password: String): js.Promise[ExternallyOwnedAccount] = js.native
  def decryptJsonWallet(json: String, password: String, progressCallback: ProgressCallback): js.Promise[ExternallyOwnedAccount] = js.native
  def decryptJsonWallet(json: String, password: Bytes): js.Promise[ExternallyOwnedAccount] = js.native
  def decryptJsonWallet(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[ExternallyOwnedAccount] = js.native
  
  def decryptJsonWalletSync(json: String, password: String): ExternallyOwnedAccount = js.native
  def decryptJsonWalletSync(json: String, password: Bytes): ExternallyOwnedAccount = js.native
  
  def decryptKeystore(json: String, password: String): js.Promise[KeystoreAccount] = js.native
  def decryptKeystore(json: String, password: String, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = js.native
  def decryptKeystore(json: String, password: Bytes): js.Promise[KeystoreAccount] = js.native
  def decryptKeystore(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[KeystoreAccount] = js.native
  
  def decryptKeystoreSync(json: String, password: String): KeystoreAccount = js.native
  def decryptKeystoreSync(json: String, password: Bytes): KeystoreAccount = js.native
  
  def encryptKeystore(account: ExternallyOwnedAccount, password: String): js.Promise[String] = js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: String,
    options: js.UndefOr[scala.Nothing],
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def encryptKeystore(account: ExternallyOwnedAccount, password: String, options: EncryptOptions): js.Promise[String] = js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: String,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def encryptKeystore(account: ExternallyOwnedAccount, password: Bytes): js.Promise[String] = js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: js.UndefOr[scala.Nothing],
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def encryptKeystore(account: ExternallyOwnedAccount, password: Bytes, options: EncryptOptions): js.Promise[String] = js.native
  def encryptKeystore(
    account: ExternallyOwnedAccount,
    password: Bytes,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  
  def getJsonWalletAddress(json: String): String = js.native
  
  def isCrowdsaleWallet(json: String): Boolean = js.native
  
  def isKeystoreWallet(json: String): Boolean = js.native
}
