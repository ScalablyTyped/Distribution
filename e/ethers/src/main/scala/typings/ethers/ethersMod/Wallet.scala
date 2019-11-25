package typings.ethers.ethersMod

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.MinimalProvider
import typings.ethers.distTypesUtilsTypesMod.ProgressCallback
import typings.ethers.distTypesUtilsTypesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "Wallet")
@js.native
class Wallet protected ()
  extends typings.ethers.distTypesEthersMod.Wallet {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typings.ethers.distTypesUtilsTypesMod.HDNode) = this()
  def this(privateKey: typings.ethers.distTypesWalletSigningDashKeyMod.SigningKey) = this()
  def this(privateKey: Arrayish, provider: MinimalProvider) = this()
  def this(privateKey: typings.ethers.distTypesUtilsTypesMod.HDNode, provider: MinimalProvider) = this()
  def this(privateKey: typings.ethers.distTypesWalletSigningDashKeyMod.SigningKey, provider: MinimalProvider) = this()
}

/* static members */
@JSImport("ethers", "Wallet")
@js.native
object Wallet extends js.Object {
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typings.ethers.distTypesWalletWalletMod.Wallet = js.native
  def createRandom(options: js.Any): typings.ethers.distTypesWalletWalletMod.Wallet = js.native
  def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typings.ethers.distTypesWalletWalletMod.Wallet] = js.native
  def fromMnemonic(mnemonic: String): typings.ethers.distTypesWalletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typings.ethers.distTypesWalletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typings.ethers.distTypesWalletWalletMod.Wallet = js.native
}

