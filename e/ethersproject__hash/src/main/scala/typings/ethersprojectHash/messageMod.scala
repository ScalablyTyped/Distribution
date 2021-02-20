package typings.ethersprojectHash

import typings.ethersprojectBytes.mod.Bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("@ethersproject/hash/lib/message", "hashMessage")
  @js.native
  def hashMessage(message: String): String = js.native
  @JSImport("@ethersproject/hash/lib/message", "hashMessage")
  @js.native
  def hashMessage(message: Bytes): String = js.native
  
  @JSImport("@ethersproject/hash/lib/message", "messagePrefix")
  @js.native
  val messagePrefix: /* "\\u0019Ethereum Signed Message:\n" */ String = js.native
}
