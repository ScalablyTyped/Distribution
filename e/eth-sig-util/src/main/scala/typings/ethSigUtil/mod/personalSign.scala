package typings.ethSigUtil.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "personalSign")
@js.native
object personalSign extends js.Object {
  def apply(privateKey: Buffer, message: MessageData[_]): String = js.native
}

