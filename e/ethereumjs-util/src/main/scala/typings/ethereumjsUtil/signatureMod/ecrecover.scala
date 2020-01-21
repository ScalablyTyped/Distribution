package typings.ethereumjsUtil.signatureMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/signature", "ecrecover")
@js.native
object ecrecover extends js.Object {
  def apply(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  def apply(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = js.native
}

