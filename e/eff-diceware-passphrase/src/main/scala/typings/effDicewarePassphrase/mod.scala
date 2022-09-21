package typings.effDicewarePassphrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate a list of `count` words, randomly shuffled and without replacement.
    *
    * @example
    * import generatePassphrase = require('eff-diceware-passphrase')
    *
    * generatePassphrase(8) // List of 8 words
    */
  inline def apply(count: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(count.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("eff-diceware-passphrase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convenience function for generating a password with at least `mimimum` bits of entropy.
    *
    * @example
    * import generatePassphrase = require('eff-diceware-passphrase')
    *
    * generatePassphrase.entropy(100) // List of words with at least 100 bits of entropy
    */
  inline def entropy(minimum: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("entropy")(minimum.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Like `Array.prototype.includes`.
    *
    * @returns `true` if part of `generatePassphrase.words` or `false` if not found.
    */
  inline def includes(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Like `Array.prototype.indexOf`.
    *
    * @returns The index in `generatePassphrase.words` or `-1` if not found.
    */
  inline def indexOf(word: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(word.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Can be used to slice the list for eg. autocomplete.
    *
    * @returns The index of the first occurrence of the `prefix`, or the end of the wordlist if no prefixes match.
    */
  inline def indexOfPrefix(prefix: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfPrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Sorted array of all words in the Diceware list.
    */
  @JSImport("eff-diceware-passphrase", "words")
  @js.native
  val words: js.Array[String] = js.native
}
