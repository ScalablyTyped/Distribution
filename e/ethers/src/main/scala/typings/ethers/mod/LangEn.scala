package typings.ethers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "LangEn")
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
  extends typings.ethers.typesEthersMod.LangEn
/* static members */
object LangEn {
  
  @JSImport("ethers", "LangEn")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns a singleton instance of a ``LangEn``, creating it
    *  if this is the first time being called.
    */
  inline def wordlist(): typings.ethers.typesWordlistsLangEnMod.LangEn = ^.asInstanceOf[js.Dynamic].applyDynamic("wordlist")().asInstanceOf[typings.ethers.typesWordlistsLangEnMod.LangEn]
}
