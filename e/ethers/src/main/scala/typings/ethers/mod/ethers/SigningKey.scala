package typings.ethers.mod.ethers

import typings.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.SigningKey")
@js.native
class SigningKey protected ()
  extends typings.ethers.ethersMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typings.ethers.typesMod.HDNode) = this()
}

