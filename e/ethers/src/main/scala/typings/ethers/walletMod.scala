package typings.ethers

import typings.ethers.ethersStrings.mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0
import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.HDNode
import typings.ethers.typesMod.MinimalProvider
import typings.ethers.typesMod.ProgressCallback
import typings.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet", JSImport.Namespace)
@js.native
object walletMod extends js.Object {
  @js.native
  class SigningKey protected ()
    extends typings.ethers.signingKeyMod.SigningKey {
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
  }
  
  @js.native
  class Wallet protected ()
    extends typings.ethers.walletWalletMod.Wallet {
    def this(privateKey: typings.ethers.signingKeyMod.SigningKey) = this()
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
    def this(privateKey: typings.ethers.signingKeyMod.SigningKey, provider: MinimalProvider) = this()
    def this(privateKey: Arrayish, provider: MinimalProvider) = this()
    def this(privateKey: HDNode, provider: MinimalProvider) = this()
  }
  
  @js.native
  object HDNode extends js.Object {
    val defaultPath: mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0 = js.native
    def entropyToMnemonic(entropy: Arrayish): String = js.native
    def entropyToMnemonic(entropy: Arrayish, wordlist: Wordlist): String = js.native
    def fromMnemonic(mnemonic: String): typings.ethers.typesMod.HDNode = js.native
    def fromMnemonic(mnemonic: String, wordlist: Wordlist): typings.ethers.typesMod.HDNode = js.native
    def fromSeed(seed: Arrayish): typings.ethers.typesMod.HDNode = js.native
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
    def createRandom(): typings.ethers.walletWalletMod.Wallet = js.native
    def createRandom(options: js.Any): typings.ethers.walletWalletMod.Wallet = js.native
    def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typings.ethers.walletWalletMod.Wallet] = js.native
    def fromMnemonic(mnemonic: String): typings.ethers.walletWalletMod.Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String): typings.ethers.walletWalletMod.Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typings.ethers.walletWalletMod.Wallet = js.native
  }
  
}

