package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eth-sig-util", "encryptSafely")
@js.native
object encryptSafely extends js.Object {
  
  def apply(receiverPublicKey: String, data: MessageData[_], version: EncryptionType): EncryptedData = js.native
}
