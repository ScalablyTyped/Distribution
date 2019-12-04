package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/pbkdf2", JSImport.Namespace)
@js.native
object distTypesUtilsPbkdf2Mod extends js.Object {
  def pbkdf2(password: Arrayish, salt: Arrayish, iterations: Double, keylen: Double, hashAlgorithm: String): Uint8Array = js.native
}

