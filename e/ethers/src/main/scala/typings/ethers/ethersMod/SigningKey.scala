package typings.ethers.ethersMod

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typings.ethers.distTypesEthersMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typings.ethers.distTypesUtilsTypesMod.HDNode) = this()
}

