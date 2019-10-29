package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.HDNode
import typings.ethers.distTypesUtilsTypesMod.MinimalProvider
import typings.ethers.distTypesUtilsTypesMod.ProgressCallback
import typings.ethers.distTypesUtilsTypesMod.Wordlist
import typings.ethers.ethersStrings.`m/44_quote/60_quote/0_quote/0/0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet", JSImport.Namespace)
@js.native
object distTypesWalletMod extends js.Object {
  @js.native
  class SigningKey protected ()
    extends typings.ethers.distTypesWalletSigningDashKeyMod.SigningKey {
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
  }
  
  @js.native
  class Wallet protected ()
    extends typings.ethers.distTypesWalletWalletMod.Wallet {
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
    def this(privateKey: typings.ethers.distTypesWalletSigningDashKeyMod.SigningKey) = this()
    def this(privateKey: Arrayish, provider: MinimalProvider) = this()
    def this(privateKey: HDNode, provider: MinimalProvider) = this()
    def this(privateKey: typings.ethers.distTypesWalletSigningDashKeyMod.SigningKey, provider: MinimalProvider) = this()
  }
  
  @js.native
  object HDNode extends js.Object {
    val defaultPath: `m/44_quote/60_quote/0_quote/0/0` = js.native
    def entropyToMnemonic(entropy: Arrayish): String = js.native
    def entropyToMnemonic(entropy: Arrayish, wordlist: Wordlist): String = js.native
    def fromMnemonic(mnemonic: String): typings.ethers.distTypesUtilsTypesMod.HDNode = js.native
    def fromMnemonic(mnemonic: String, wordlist: Wordlist): typings.ethers.distTypesUtilsTypesMod.HDNode = js.native
    def fromSeed(seed: Arrayish): typings.ethers.distTypesUtilsTypesMod.HDNode = js.native
    def isValidMnemonic(mnemonic: String): Boolean = js.native
    def isValidMnemonic(mnemonic: String, wordlist: Wordlist): Boolean = js.native
    def mnemonicToEntropy(mnemonic: String): String = js.native
    def mnemonicToEntropy(mnemonic: String, wordlist: Wordlist): String = js.native
    def mnemonicToSeed(mnemonic: String): String = js.native
    def mnemonicToSeed(mnemonic: String, password: String): String = js.native
  }
  
  /* static members */
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
  
}

