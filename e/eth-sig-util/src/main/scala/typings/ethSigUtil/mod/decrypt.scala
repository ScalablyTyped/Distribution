package typings.ethSigUtil.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eth-sig-util", "decrypt")
@js.native
object decrypt extends js.Object {
  
  def apply(encryptedData: EncryptedData, receiverPrivateKey: String): String = js.native
  def apply(encryptedData: EncryptedData, receiverPrivateKey: Buffer): String = js.native
}
