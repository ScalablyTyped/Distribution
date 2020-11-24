package typings.ethers.ethersMod

import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import typings.ethersprojectSigningKey.mod.SigningKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "Wallet")
@js.native
class Wallet protected ()
  extends typings.ethersprojectWallet.mod.Wallet {
  def this(privateKey: ExternallyOwnedAccount) = this()
  def this(privateKey: BytesLike) = this()
  def this(privateKey: SigningKey) = this()
  def this(privateKey: ExternallyOwnedAccount, provider: Provider) = this()
  def this(privateKey: BytesLike, provider: Provider) = this()
  def this(privateKey: SigningKey, provider: Provider) = this()
}
/* static members */
@JSImport("ethers/lib/ethers", "Wallet")
@js.native
object Wallet extends js.Object {
  
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typings.ethersprojectWallet.mod.Wallet = js.native
  def createRandom(options: js.Any): typings.ethersprojectWallet.mod.Wallet = js.native
  
  def fromEncryptedJson(json: String, password: String): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[typings.ethersprojectWallet.mod.Wallet] = js.native
  
  def fromEncryptedJsonSync(json: String, password: String): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromEncryptedJsonSync(json: String, password: Bytes): typings.ethersprojectWallet.mod.Wallet = js.native
  
  def fromMnemonic(mnemonic: String): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(
    mnemonic: String,
    path: js.UndefOr[scala.Nothing],
    wordlist: typings.ethersprojectWordlists.mod.Wordlist
  ): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typings.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: typings.ethersprojectWordlists.mod.Wordlist): typings.ethersprojectWallet.mod.Wallet = js.native
}
