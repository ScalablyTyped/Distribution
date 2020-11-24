package typings.ethers.utilsMod

import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/utils", "base64")
@js.native
object base64 extends js.Object {
  
  def decode(textData: String): Uint8Array = js.native
  
  def encode(data: BytesLike): String = js.native
}
