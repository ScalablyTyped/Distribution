package typings.ethers

import typings.ethers.typesWordlistsWordlistOwlMod.WordlistOwl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsLangCzMod {
  
  @JSImport("ethers/types/wordlists/lang-cz", "LangCz")
  @js.native
  /**
    *  Creates a new instance of the Czech language Wordlist.
    *
    *  Using the constructor should be unnecessary, instead use the
    *  [[wordlist]] singleton method.
    *
    *  @_ignore:
    */
  open class LangCz () extends WordlistOwl
  /* static members */
  object LangCz {
    
    @JSImport("ethers/types/wordlists/lang-cz", "LangCz")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangCz``, creating it
      *  if this is the first time being called.
      */
    inline def wordlist(): LangCz = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[LangCz]
  }
}
