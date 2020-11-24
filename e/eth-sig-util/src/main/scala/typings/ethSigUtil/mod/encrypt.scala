package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eth-sig-util", "encrypt")
@js.native
object encrypt extends js.Object {
  
  def apply(receiverPublicKey: String, data: MessageData[String], version: EncryptionType): EncryptedData = js.native
}
