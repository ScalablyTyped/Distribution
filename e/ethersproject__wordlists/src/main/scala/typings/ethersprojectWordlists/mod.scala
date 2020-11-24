package typings.ethersprojectWordlists

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectLogger.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/wordlists", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val logger: Logger = js.native
  
  @js.native
  abstract class Wordlist protected ()
    extends typings.ethersprojectWordlists.wordlistMod.Wordlist {
    def this(locale: String) = this()
  }
  /* static members */
  @js.native
  object Wordlist extends js.Object {
    
    def check(wordlist: typings.ethersprojectWordlists.wordlistMod.Wordlist): String = js.native
    
    def register(lang: typings.ethersprojectWordlists.wordlistMod.Wordlist): Unit = js.native
    def register(lang: typings.ethersprojectWordlists.wordlistMod.Wordlist, name: String): Unit = js.native
  }
  
  @js.native
  object wordlists
    extends /* locale */ StringDictionary[typings.ethersprojectWordlists.wordlistMod.Wordlist]
}
