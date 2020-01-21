package typings.ethers.mod

import typings.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typings.ethers.ethersMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typings.ethers.typesMod.HDNode) = this()
}

