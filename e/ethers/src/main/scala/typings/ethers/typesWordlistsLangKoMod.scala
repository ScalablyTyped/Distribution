package typings.ethers

import typings.ethers.typesWordlistsWordlistMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsLangKoMod {
  
  @JSImport("ethers/types/wordlists/lang-ko", "LangKo")
  @js.native
  /**
    *  Creates a new instance of the Korean language Wordlist.
    *
    *  This should be unnecessary most of the time as the exported
    *  [[langKo]] should suffice.
    *
    *  @_ignore:
    */
  open class LangKo () extends Wordlist
  /* static members */
  object LangKo {
    
    @JSImport("ethers/types/wordlists/lang-ko", "LangKo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangKo``, creating it
      *  if this is the first time being called.
      */
    inline def wordlist(): LangKo = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[LangKo]
  }
}
