package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bip39Mod {
  
  @JSImport("ethereum-cryptography/bip39", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def entropyToMnemonic(entropy: Buffer, wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateMnemonic(wordlist: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(wordlist.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateMnemonic(wordlist: js.Array[String], strength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(wordlist.asInstanceOf[js.Any], strength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def mnemonicToSeed(mnemonic: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def mnemonicToSeed(mnemonic: String, passphrase: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def mnemonicToSeedSync(mnemonic: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeedSync")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def mnemonicToSeedSync(mnemonic: String, passphrase: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeedSync")(mnemonic.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateMnemonic")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
