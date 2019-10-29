package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/types", "HDNode")
@js.native
abstract class HDNode () extends js.Object {
  val chainCode: String = js.native
  val depth: Double = js.native
  val index: Double = js.native
  val mnemonic: String = js.native
  val path: String = js.native
  val privateKey: String = js.native
  val publicKey: String = js.native
  def derivePath(path: String): HDNode = js.native
}

