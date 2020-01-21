package typings.ethers

import typings.ethers.typesMod.Arrayish
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/base64", JSImport.Namespace)
@js.native
object base64Mod extends js.Object {
  def decode(textData: String): Uint8Array = js.native
  def encode(data: Arrayish): String = js.native
}

