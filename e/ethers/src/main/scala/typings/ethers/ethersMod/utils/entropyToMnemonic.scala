package typings.ethers.ethersMod.utils

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "utils.entropyToMnemonic")
@js.native
object entropyToMnemonic extends js.Object {
  
  def apply(entropy: BytesLike): String = js.native
  def apply(entropy: BytesLike, wordlist: String): String = js.native
  def apply(entropy: BytesLike, wordlist: Wordlist): String = js.native
}
