package typings.ethereumCryptography

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-cryptography/bip39", JSImport.Namespace)
@js.native
object bip39Mod extends js.Object {
  
  def entropyToMnemonic(entropy: Buffer, wordlist: js.Array[String]): String = js.native
  
  def generateMnemonic(wordlist: js.Array[String]): String = js.native
  def generateMnemonic(wordlist: js.Array[String], strength: Double): String = js.native
  
  def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): Buffer = js.native
  
  def mnemonicToSeed(mnemonic: String): js.Promise[Buffer] = js.native
  def mnemonicToSeed(mnemonic: String, passphrase: String): js.Promise[Buffer] = js.native
  
  def mnemonicToSeedSync(mnemonic: String): Buffer = js.native
  def mnemonicToSeedSync(mnemonic: String, passphrase: String): Buffer = js.native
  
  def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = js.native
}
