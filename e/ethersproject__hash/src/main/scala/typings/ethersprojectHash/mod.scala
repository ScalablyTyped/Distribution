package typings.ethersprojectHash

import typings.ethersprojectBytes.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/hash", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val messagePrefix: /* "\\u0019Ethereum Signed Message:\n" */ String = js.native
  def hashMessage(message: String): String = js.native
  def hashMessage(message: Bytes): String = js.native
  def id(text: String): String = js.native
  def isValidName(name: String): Boolean = js.native
  def namehash(name: String): String = js.native
}

