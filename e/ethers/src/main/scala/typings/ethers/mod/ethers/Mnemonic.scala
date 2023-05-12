package typings.ethers.mod.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.Mnemonic")
@js.native
open class Mnemonic protected ()
  extends typings.ethers.typesEthersMod.Mnemonic {
  /**
    *  @private
    */
  def this(guard: Any, entropy: String, phrase: String) = this()
  def this(guard: Any, entropy: String, phrase: String, password: String) = this()
  def this(
    guard: Any,
    entropy: String,
    phrase: String,
    password: String,
    wordlist: typings.ethers.typesWordlistsMod.Wordlist
  ) = this()
  def this(
    guard: Any,
    entropy: String,
    phrase: String,
    password: Null,
    wordlist: typings.ethers.typesWordlistsMod.Wordlist
  ) = this()
  def this(
    guard: Any,
    entropy: String,
    phrase: String,
    password: Unit,
    wordlist: typings.ethers.typesWordlistsMod.Wordlist
  ) = this()
}
/* static members */
object Mnemonic {
  
  @JSImport("ethers", "ethers.Mnemonic")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns the phrase for %%mnemonic%%.
    */
  inline def entropyToPhrase(_entropy: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("entropyToPhrase")(_entropy.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def entropyToPhrase(_entropy: BytesLike, wordlist: typings.ethers.typesWordlistsMod.Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToPhrase")(_entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    *  Create a new **Mnemonic** from the %%entropy%%.
    *
    *  The default %%password%% is the empty string and the default
    *  wordlist is the [English wordlists](LangEn).
    */
  inline def fromEntropy(_entropy: BytesLike): typings.ethers.typesWalletMnemonicMod.Mnemonic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromEntropy(_entropy: BytesLike, password: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromEntropy(_entropy: BytesLike, password: String, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromEntropy(_entropy: BytesLike, password: Null, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromEntropy(_entropy: BytesLike, password: Unit, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  
  /**
    *  Creates a new Mnemonic for the %%phrase%%.
    *
    *  The default %%password%% is the empty string and the default
    *  wordlist is the [English wordlists](LangEn).
    */
  inline def fromPhrase(phrase: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromPhrase(phrase: String, password: String): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromPhrase(phrase: String, password: String, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromPhrase(phrase: String, password: Null, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  inline def fromPhrase(phrase: String, password: Unit, wordlist: typings.ethers.typesWordlistsMod.Wordlist): typings.ethers.typesWalletMnemonicMod.Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesWalletMnemonicMod.Mnemonic]
  
  /**
    *  Returns true if %%phrase%% is a valid [[link-bip-39]] phrase.
    *
    *  This checks all the provided words belong to the %%wordlist%%,
    *  that the length is valid and the checksum is correct.
    */
  inline def isValidMnemonic(phrase: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(phrase.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidMnemonic(phrase: String, wordlist: typings.ethers.typesWordlistsMod.Wordlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(phrase.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    *  Returns the entropy for %%phrase%%.
    */
  inline def phraseToEntropy(phrase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("phraseToEntropy")(phrase.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def phraseToEntropy(phrase: String, wordlist: typings.ethers.typesWordlistsMod.Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("phraseToEntropy")(phrase.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
}
