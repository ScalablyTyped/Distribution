package typings.ethers.ethersMod.utils

import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.SignatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "utils.verifyMessage")
@js.native
object verifyMessage extends js.Object {
  
  def apply(message: String, signature: SignatureLike): String = js.native
  def apply(message: Bytes, signature: SignatureLike): String = js.native
}
