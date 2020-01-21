package typings.ethers

import typings.ethers.typesMod.BigNumber
import typings.ethers.typesMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/bignumber", JSImport.Namespace)
@js.native
object bignumberMod extends js.Object {
  val ConstantNegativeOne: BigNumber = js.native
  val ConstantOne: BigNumber = js.native
  val ConstantTwo: BigNumber = js.native
  val ConstantWeiPerEther: BigNumber = js.native
  val ConstantZero: BigNumber = js.native
  def bigNumberify(value: BigNumberish): BigNumber = js.native
}

