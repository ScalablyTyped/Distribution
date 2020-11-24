package typings.ethers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "Wordlist")
@js.native
abstract class Wordlist protected ()
  extends typings.ethersprojectWordlists.mod.Wordlist {
  def this(locale: String) = this()
}
/* static members */
@JSImport("ethers", "Wordlist")
@js.native
object Wordlist extends js.Object {
  
  def check(wordlist: typings.ethersprojectWordlists.wordlistMod.Wordlist): String = js.native
  
  def register(lang: typings.ethersprojectWordlists.wordlistMod.Wordlist): Unit = js.native
  def register(lang: typings.ethersprojectWordlists.wordlistMod.Wordlist, name: String): Unit = js.native
}
