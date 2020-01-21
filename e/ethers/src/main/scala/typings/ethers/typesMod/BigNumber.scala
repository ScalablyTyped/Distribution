package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/types", "BigNumber")
@js.native
abstract class BigNumber () extends js.Object {
  def add(other: BigNumberish): BigNumber = js.native
  def div(other: BigNumberish): BigNumber = js.native
  def eq(other: BigNumberish): Boolean = js.native
  def fromTwos(value: Double): BigNumber = js.native
  def gt(other: BigNumberish): Boolean = js.native
  def gte(other: BigNumberish): Boolean = js.native
  def isZero(): Boolean = js.native
  def lt(other: BigNumberish): Boolean = js.native
  def lte(other: BigNumberish): Boolean = js.native
  def maskn(value: Double): BigNumber = js.native
  def mod(other: BigNumberish): BigNumber = js.native
  def mul(other: BigNumberish): BigNumber = js.native
  def pow(other: BigNumberish): BigNumber = js.native
  def sub(other: BigNumberish): BigNumber = js.native
  def toHexString(): String = js.native
  def toNumber(): Double = js.native
  def toTwos(value: Double): BigNumber = js.native
}

