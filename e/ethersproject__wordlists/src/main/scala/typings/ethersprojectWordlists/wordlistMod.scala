package typings.ethersprojectWordlists

import typings.ethersprojectLogger.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordlistMod {
  
  @JSImport("@ethersproject/wordlists/lib/wordlist", "Wordlist")
  @js.native
  abstract class Wordlist protected () extends StObject {
    def this(locale: String) = this()
    
    def getWord(index: Double): String = js.native
    
    def getWordIndex(word: String): Double = js.native
    
    def join(words: js.Array[String]): String = js.native
    
    val locale: String = js.native
    
    def split(mnemonic: String): js.Array[String] = js.native
  }
  /* static members */
  object Wordlist {
    
    @JSImport("@ethersproject/wordlists/lib/wordlist", "Wordlist.check")
    @js.native
    def check(wordlist: Wordlist): String = js.native
    
    @JSImport("@ethersproject/wordlists/lib/wordlist", "Wordlist.register")
    @js.native
    def register(lang: Wordlist): Unit = js.native
    @JSImport("@ethersproject/wordlists/lib/wordlist", "Wordlist.register")
    @js.native
    def register(lang: Wordlist, name: String): Unit = js.native
  }
  
  @JSImport("@ethersproject/wordlists/lib/wordlist", "logger")
  @js.native
  val logger: Logger = js.native
}
