package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesWordlistsMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalletMnemonicMod {
  
  @JSImport("ethers/types/wallet/mnemonic", "Mnemonic")
  @js.native
  open class Mnemonic protected () extends StObject {
    /**
      *  @private
      */
    def this(guard: Any, entropy: String, phrase: String) = this()
    def this(guard: Any, entropy: String, phrase: String, password: String) = this()
    def this(guard: Any, entropy: String, phrase: String, password: String, wordlist: Wordlist) = this()
    def this(guard: Any, entropy: String, phrase: String, password: Null, wordlist: Wordlist) = this()
    def this(guard: Any, entropy: String, phrase: String, password: Unit, wordlist: Wordlist) = this()
    
    /**
      *  Returns the seed for the mnemonic.
      */
    def computeSeed(): String = js.native
    
    /**
      *  The underlying entropy which the mnemonic encodes.
      */
    val entropy: String = js.native
    
    /**
      *  The password used for this mnemonic. If no password is used this
      *  is the empty string (i.e. ``""``) as per the specification.
      */
    val password: String = js.native
    
    /**
      *  The mnemonic phrase of 12, 15, 18, 21 or 24 words.
      *
      *  Use the [[wordlist]] ``split`` method to get the individual words.
      */
    val phrase: String = js.native
    
    /**
      *  The wordlist for this mnemonic.
      */
    val wordlist: Wordlist = js.native
  }
  /* static members */
  object Mnemonic {
    
    @JSImport("ethers/types/wallet/mnemonic", "Mnemonic")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns the phrase for %%mnemonic%%.
      */
    inline def entropyToPhrase(_entropy: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("entropyToPhrase")(_entropy.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def entropyToPhrase(_entropy: BytesLike, wordlist: Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToPhrase")(_entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *  Create a new **Mnemonic** from the %%entropy%%.
      *
      *  The default %%password%% is the empty string and the default
      *  wordlist is the [English wordlists](LangEn).
      */
    inline def fromEntropy(_entropy: BytesLike): Mnemonic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any]).asInstanceOf[Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: String): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: String, wordlist: Wordlist): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: Null, wordlist: Wordlist): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    inline def fromEntropy(_entropy: BytesLike, password: Unit, wordlist: Wordlist): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntropy")(_entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    
    /**
      *  Creates a new Mnemonic for the %%phrase%%.
      *
      *  The default %%password%% is the empty string and the default
      *  wordlist is the [English wordlists](LangEn).
      */
    inline def fromPhrase(phrase: String): Mnemonic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[Mnemonic]
    inline def fromPhrase(phrase: String, password: String): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    inline def fromPhrase(phrase: String, password: String, wordlist: Wordlist): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    inline def fromPhrase(phrase: String, password: Null, wordlist: Wordlist): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    inline def fromPhrase(phrase: String, password: Unit, wordlist: Wordlist): Mnemonic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPhrase")(phrase.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Mnemonic]
    
    /**
      *  Returns true if %%phrase%% is a valid [[link-bip-39]] phrase.
      *
      *  This checks all the provided words belong to the %%wordlist%%,
      *  that the length is valid and the checksum is correct.
      */
    inline def isValidMnemonic(phrase: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(phrase.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValidMnemonic(phrase: String, wordlist: Wordlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(phrase.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      *  Returns the entropy for %%phrase%%.
      */
    inline def phraseToEntropy(phrase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("phraseToEntropy")(phrase.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def phraseToEntropy(phrase: String, wordlist: Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("phraseToEntropy")(phrase.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
