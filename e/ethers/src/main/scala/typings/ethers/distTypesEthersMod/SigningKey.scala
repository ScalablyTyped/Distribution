package typings.ethers.distTypesEthersMod

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.HDNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typings.ethers.distTypesWalletMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: HDNode) = this()
}

