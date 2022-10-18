package typings.ethersprojectWordlists

import typings.ethersprojectLogger.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWordlistMod {
  
  /* note: abstract class */ @JSImport("@ethersproject/wordlists/lib/wordlist", "Wordlist")
  @js.native
  open class Wordlist protected () extends StObject {
    def this(locale: String) = this()
    
    def getWord(index: Double): String = js.native
    
    def getWordIndex(word: String): Double = js.native
    
    def join(words: js.Array[String]): String = js.native
    
    val locale: String = js.native
    
    def split(mnemonic: String): js.Array[String] = js.native
  }
  /* static members */
  object Wordlist {
    
    @JSImport("@ethersproject/wordlists/lib/wordlist", "Wordlist")
    @js.native
    val ^ : js.Any = js.native
    
    inline def check(wordlist: Wordlist): String = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(wordlist.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def register(lang: Wordlist): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(lang.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def register(lang: Wordlist, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(lang.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@ethersproject/wordlists/lib/wordlist", "logger")
  @js.native
  val logger: Logger = js.native
}
