package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "recoverTypedSignatureLegacy")
@js.native
object recoverTypedSignatureLegacy extends js.Object {
  def apply(message: SignedMessageData[EIP712LegacyData]): String = js.native
}

