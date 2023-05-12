package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsWordlistMod {
  
  /* note: abstract class */ @JSImport("ethers/types/wordlists/wordlist", "Wordlist")
  @js.native
  open class Wordlist protected () extends StObject {
    /**
      *  Creates a new Wordlist instance.
      *
      *  Sub-classes MUST call this if they provide their own constructor,
      *  passing in the locale string of the language.
      *
      *  Generally there is no need to create instances of a Wordlist,
      *  since each language-specific Wordlist creates an instance and
      *  there is no state kept internally, so they are safe to share.
      */
    def this(locale: String) = this()
    
    /**
      *  Maps an 11-bit value into its coresponding word in the list.
      *
      *  Sub-classes MUST override this.
      */
    def getWord(index: Double): String = js.native
    
    /**
      *  Maps a word to its corresponding 11-bit value.
      *
      *  Sub-classes MUST override this.
      */
    def getWordIndex(word: String): Double = js.native
    
    /**
      *  Sub-classes may override this to provider a language-specific
      *  method for joining %%words%% into a phrase.
      *
      *  By default, %%words%% are joined by a single space.
      */
    def join(words: js.Array[String]): String = js.native
    
    var locale: String = js.native
    
    /**
      *  Sub-classes may override this to provide a language-specific
      *  method for spliting %%phrase%% into individual words.
      *
      *  By default, %%phrase%% is split using any sequences of
      *  white-space as defined by regular expressions (i.e. ``/\s+/``).
      */
    def split(phrase: String): js.Array[String] = js.native
  }
}
