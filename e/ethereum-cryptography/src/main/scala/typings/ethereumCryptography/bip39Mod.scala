package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bip39Mod {
  
  @JSImport("ethereum-cryptography/bip39", "entropyToMnemonic")
  @js.native
  def entropyToMnemonic(entropy: Buffer, wordlist: js.Array[String]): String = js.native
  
  @JSImport("ethereum-cryptography/bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(wordlist: js.Array[String]): String = js.native
  @JSImport("ethereum-cryptography/bip39", "generateMnemonic")
  @js.native
  def generateMnemonic(wordlist: js.Array[String], strength: Double): String = js.native
  
  @JSImport("ethereum-cryptography/bip39", "mnemonicToEntropy")
  @js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): Buffer = js.native
  
  @JSImport("ethereum-cryptography/bip39", "mnemonicToSeed")
  @js.native
  def mnemonicToSeed(mnemonic: String): js.Promise[Buffer] = js.native
  @JSImport("ethereum-cryptography/bip39", "mnemonicToSeed")
  @js.native
  def mnemonicToSeed(mnemonic: String, passphrase: String): js.Promise[Buffer] = js.native
  
  @JSImport("ethereum-cryptography/bip39", "mnemonicToSeedSync")
  @js.native
  def mnemonicToSeedSync(mnemonic: String): Buffer = js.native
  @JSImport("ethereum-cryptography/bip39", "mnemonicToSeedSync")
  @js.native
  def mnemonicToSeedSync(mnemonic: String, passphrase: String): Buffer = js.native
  
  @JSImport("ethereum-cryptography/bip39", "validateMnemonic")
  @js.native
  def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = js.native
}
