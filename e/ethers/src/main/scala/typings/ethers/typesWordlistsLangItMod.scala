package typings.ethers

import typings.ethers.typesWordlistsWordlistOwlMod.WordlistOwl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsLangItMod {
  
  @JSImport("ethers/types/wordlists/lang-it", "LangIt")
  @js.native
  /**
    *  Creates a new instance of the Italian language Wordlist.
    *
    *  This should be unnecessary most of the time as the exported
    *  [[langIt]] should suffice.
    *
    *  @_ignore:
    */
  open class LangIt () extends WordlistOwl
  /* static members */
  object LangIt {
    
    @JSImport("ethers/types/wordlists/lang-it", "LangIt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a singleton instance of a ``LangIt``, creating it
      *  if this is the first time being called.
      */
    inline def wordlist(): LangIt = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[LangIt]
  }
}
