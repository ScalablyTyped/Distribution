package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "getEncryptionPublicKey")
@js.native
object getEncryptionPublicKey extends js.Object {
  def apply(privateKey: String): String = js.native
  def apply(privateKey: Buffer): String = js.native
}

