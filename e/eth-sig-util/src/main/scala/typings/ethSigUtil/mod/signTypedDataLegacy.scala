package typings.ethSigUtil.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eth-sig-util", "signTypedDataLegacy")
@js.native
object signTypedDataLegacy extends js.Object {
  
  def apply(privateKey: Buffer, message: MessageData[EIP712LegacyData]): String = js.native
}
