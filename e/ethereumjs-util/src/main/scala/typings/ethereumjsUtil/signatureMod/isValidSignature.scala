package typings.ethereumjsUtil.signatureMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-util/dist/signature", "isValidSignature")
@js.native
object isValidSignature extends js.Object {
  
  def apply(v: Double, r: Buffer, s: Buffer): Boolean = js.native
  def apply(v: Double, r: Buffer, s: Buffer, homesteadOrLater: js.UndefOr[scala.Nothing], chainId: Double): Boolean = js.native
  def apply(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = js.native
  def apply(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: Double): Boolean = js.native
}
