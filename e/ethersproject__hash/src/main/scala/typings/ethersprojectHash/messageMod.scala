package typings.ethersprojectHash

import typings.ethersprojectBytes.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/hash/lib/message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  
  def hashMessage(message: String): String = js.native
  def hashMessage(message: Bytes): String = js.native
  
  val messagePrefix: /* "\\u0019Ethereum Signed Message:\n" */ String = js.native
}
