package typings.ethers

import typings.ethers.typesWordlistsWordlistMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsLangJaMod {
  
  @JSImport("ethers/types/wordlists/lang-ja", "LangJa")
  @js.native
  /**
    *  Creates a new instance of the Japanese language Wordlist.
    *
    *  This should be unnecessary most of the time as the exported
    *  [[langJa]] should suffice.
    *
    *  @_ignore:
    */
  open class LangJa () extends Wordlist
  /* static members */
  object LangJa {
    
    @JSImport("ethers/types/wordlists/lang-ja", "LangJa")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangJa``, creating it
      *  if this is the first time being called.
      */
    inline def wordlist(): LangJa = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[LangJa]
  }
}
