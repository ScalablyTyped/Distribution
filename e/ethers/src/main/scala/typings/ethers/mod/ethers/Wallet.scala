package typings.ethers.mod.ethers

import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.MinimalProvider
import typings.ethers.typesMod.ProgressCallback
import typings.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.Wallet")
@js.native
class Wallet protected ()
  extends typings.ethers.ethersMod.Wallet {
  def this(privateKey: typings.ethers.signingKeyMod.SigningKey) = this()
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typings.ethers.typesMod.HDNode) = this()
  def this(privateKey: typings.ethers.signingKeyMod.SigningKey, provider: MinimalProvider) = this()
  def this(privateKey: Arrayish, provider: MinimalProvider) = this()
  def this(privateKey: typings.ethers.typesMod.HDNode, provider: MinimalProvider) = this()
}

/* static members */
@JSImport("ethers", "ethers.Wallet")
@js.native
object Wallet extends js.Object {
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typings.ethers.walletWalletMod.Wallet = js.native
  def createRandom(options: js.Any): typings.ethers.walletWalletMod.Wallet = js.native
  def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typings.ethers.walletWalletMod.Wallet] = js.native
  def fromMnemonic(mnemonic: String): typings.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typings.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typings.ethers.walletWalletMod.Wallet = js.native
}

