package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bip39Mod {
  
  @JSImport("ethereum-cryptography/bip39", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def entropyToMnemonic(entropy: js.typedarray.Uint8Array, wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateMnemonic(wordlist: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(wordlist.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateMnemonic(wordlist: js.Array[String], strength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(wordlist.asInstanceOf[js.Any], strength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def mnemonicToSeed(mnemonic: String): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def mnemonicToSeed(mnemonic: String, passphrase: String): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def mnemonicToSeedSync(mnemonic: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeedSync")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def mnemonicToSeedSync(mnemonic: String, passphrase: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeedSync")(mnemonic.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateMnemonic")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
