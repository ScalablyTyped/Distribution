package typings.ethSigUtil.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "signTypedData")
@js.native
object signTypedData extends js.Object {
  def apply(privateKey: Buffer, msgParams: MessageData[EIP712TypedData]): String = js.native
}

