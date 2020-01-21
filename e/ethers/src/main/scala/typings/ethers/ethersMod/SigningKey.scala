package typings.ethers.ethersMod

import typings.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typings.ethers.walletMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typings.ethers.typesMod.HDNode) = this()
}

