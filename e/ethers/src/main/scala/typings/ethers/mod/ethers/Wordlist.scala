package typings.ethers.mod.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.Wordlist")
@js.native
abstract class Wordlist protected ()
  extends typings.ethers.ethersMod.Wordlist {
  def this(locale: String) = this()
}
/* static members */
@JSImport("ethers", "ethers.Wordlist")
@js.native
object Wordlist extends js.Object {
  
  def check(wordlist: typings.ethersprojectWordlists.wordlistMod.Wordlist): String = js.native
  
  def register(lang: typings.ethersprojectWordlists.wordlistMod.Wordlist): Unit = js.native
  def register(lang: typings.ethersprojectWordlists.wordlistMod.Wordlist, name: String): Unit = js.native
}
