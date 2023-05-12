package typings.ethers

import typings.ethers.typesWordlistsWordlistOwlaMod.WordlistOwlA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsLangFrMod {
  
  @JSImport("ethers/types/wordlists/lang-fr", "LangFr")
  @js.native
  /**
    *  Creates a new instance of the French language Wordlist.
    *
    *  This should be unnecessary most of the time as the exported
    *  [[langFr]] should suffice.
    *
    *  @_ignore:
    */
  open class LangFr () extends WordlistOwlA
  /* static members */
  object LangFr {
    
    @JSImport("ethers/types/wordlists/lang-fr", "LangFr")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangFr``, creating it
      *  if this is the first time being called.
      */
    inline def wordlist(): LangFr = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[LangFr]
  }
}
