package typings.ethersprojectWordlists

import typings.ethersprojectLogger.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/wordlists/lib/wordlist", JSImport.Namespace)
@js.native
object wordlistMod extends js.Object {
  
  val logger: Logger = js.native
  
  @js.native
  abstract class Wordlist protected () extends js.Object {
    def this(locale: String) = this()
    
    def getWord(index: Double): String = js.native
    
    def getWordIndex(word: String): Double = js.native
    
    def join(words: js.Array[String]): String = js.native
    
    val locale: String = js.native
    
    def split(mnemonic: String): js.Array[String] = js.native
  }
  /* static members */
  @js.native
  object Wordlist extends js.Object {
    
    def check(wordlist: Wordlist): String = js.native
    
    def register(lang: Wordlist): Unit = js.native
    def register(lang: Wordlist, name: String): Unit = js.native
  }
}
