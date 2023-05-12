package typings.ethers

import typings.ethers.typesWordlistsWordlistOwlMod.WordlistOwl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsLangPtMod {
  
  @JSImport("ethers/types/wordlists/lang-pt", "LangPt")
  @js.native
  /**
    *  Creates a new instance of the Portuguese language Wordlist.
    *
    *  This should be unnecessary most of the time as the exported
    *  [[langPt]] should suffice.
    *
    *  @_ignore:
    */
  open class LangPt () extends WordlistOwl
  /* static members */
  object LangPt {
    
    @JSImport("ethers/types/wordlists/lang-pt", "LangPt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangPt``, creating it
      *  if this is the first time being called.
      */
    inline def wordlist(): LangPt = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[LangPt]
  }
}
