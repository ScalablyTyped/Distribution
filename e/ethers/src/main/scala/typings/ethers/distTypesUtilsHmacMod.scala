package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.SupportedAlgorithms
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/hmac", JSImport.Namespace)
@js.native
object distTypesUtilsHmacMod extends js.Object {
  def computeHmac(algorithm: SupportedAlgorithms, key: Arrayish, data: Arrayish): Uint8Array = js.native
}

