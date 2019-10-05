package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "decryptSafely")
@js.native
object decryptSafely extends js.Object {
  def apply(encryptedData: EncryptedData, receiverPrivateKey: String): js.Any = js.native
  def apply(encryptedData: EncryptedData, receiverPrivateKey: Buffer): js.Any = js.native
}

