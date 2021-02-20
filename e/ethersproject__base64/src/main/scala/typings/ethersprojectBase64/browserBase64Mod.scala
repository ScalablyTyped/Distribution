package typings.ethersprojectBase64

import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserBase64Mod {
  
  @JSImport("@ethersproject/base64/lib/browser-base64", "decode")
  @js.native
  def decode(textData: String): Uint8Array = js.native
  
  @JSImport("@ethersproject/base64/lib/browser-base64", "encode")
  @js.native
  def encode(data: BytesLike): String = js.native
}
