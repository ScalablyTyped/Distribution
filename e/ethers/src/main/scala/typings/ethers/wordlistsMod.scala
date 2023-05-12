package typings.ethers

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object wordlistsMod {
  
  @JSImport("ethers/wordlists", "LangEn")
  @js.native
  /**
    *  Creates a new instance of the English language Wordlist.
    *
    *  This should be unnecessary most of the time as the exported
    *  [[langEn]] should suffice.
    *
    *  @_ignore:
    */
  open class LangEn ()
    extends typings.ethers.typesWordlistsMod.LangEn
  /* static members */
  object LangEn {
    
    @JSImport("ethers/wordlists", "LangEn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangEn``, creating it
      *  if this is the first time being called.
      */
    inline def wordlist(): typings.ethers.typesWordlistsLangEnMod.LangEn = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[typings.ethers.typesWordlistsLangEnMod.LangEn]
  }
  
  /* note: abstract class */ @JSImport("ethers/wordlists", "Wordlist")
  @js.native
  open class Wordlist protected ()
    extends typings.ethers.typesWordlistsMod.Wordlist {
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
  }
  
  @JSImport("ethers/wordlists", "WordlistOwl")
  @js.native
  open class WordlistOwl protected ()
    extends typings.ethers.typesWordlistsMod.WordlistOwl {
    /**
      *  Creates a new Wordlist for %%locale%% using the OWL %%data%%
      *  and validated against the %%checksum%%.
      */
    def this(locale: String, data: String, checksum: String) = this()
  }
  
  @JSImport("ethers/wordlists", "WordlistOwlA")
  @js.native
  open class WordlistOwlA protected ()
    extends typings.ethers.typesWordlistsMod.WordlistOwlA {
    def this(locale: String, data: String, accent: String, checksum: String) = this()
  }
  
  @JSImport("ethers/wordlists", "wordlists")
  @js.native
  val wordlists: Record[String, typings.ethers.typesWordlistsWordlistMod.Wordlist] = js.native
}
