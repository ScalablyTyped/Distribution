package typings.ethersprojectBase64

import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/base64/lib/base64", JSImport.Namespace)
@js.native
object base64Mod extends js.Object {
  
  def decode(textData: String): Uint8Array = js.native
  
  def encode(data: BytesLike): String = js.native
}
