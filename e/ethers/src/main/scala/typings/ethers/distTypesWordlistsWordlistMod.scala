package typings.ethers

import typings.ethers.distTypesWordlistsWordlistMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wordlists/wordlist", JSImport.Namespace)
@js.native
object distTypesWordlistsWordlistMod extends js.Object {
  @js.native
  abstract class Wordlist protected ()
    extends typings.ethers.distTypesUtilsTypesMod.Wordlist {
    def this(locale: String) = this()
    /* CompleteClass */
    override var locale: String = js.native
    /* CompleteClass */
    override def getWord(index: Double): String = js.native
    /* CompleteClass */
    override def getWordIndex(word: String): Double = js.native
    /* CompleteClass */
    override def join(words: js.Array[String]): String = js.native
    /* CompleteClass */
    override def split(mnemonic: String): js.Array[String] = js.native
  }
  
  def check(wordlist: typings.ethers.distTypesUtilsTypesMod.Wordlist): String = js.native
  def register(lang: Wordlist): Unit = js.native
  def register(lang: Wordlist, name: String): Unit = js.native
}

