package typings.ethers

import typings.ethers.typesWordlistsWordlistMod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsWordlistOwlMod {
  
  @JSImport("ethers/types/wordlists/wordlist-owl", "WordlistOwl")
  @js.native
  open class WordlistOwl protected () extends Wordlist {
    /**
      *  Creates a new Wordlist for %%locale%% using the OWL %%data%%
      *  and validated against the %%checksum%%.
      */
    def this(locale: String, data: String, checksum: String) = this()
    
    def _data: String = js.native
    
    def _decodeWords(): js.Array[String] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
