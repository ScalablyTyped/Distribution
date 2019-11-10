package typings.ethereumjsDashUtil.distSignatureMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/signature", "toRpcSig")
@js.native
object toRpcSig extends js.Object {
  def apply(v: Double, r: Buffer, s: Buffer): String = js.native
  def apply(v: Double, r: Buffer, s: Buffer, chainId: Double): String = js.native
}

