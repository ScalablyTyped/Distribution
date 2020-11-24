package typings.ethers.mod.ethers

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.fixednumberMod.FixedFormat
import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.FixedNumber")
@js.native
class FixedNumber protected ()
  extends typings.ethers.ethersMod.FixedNumber {
  def this(constructorGuard: js.Any, hex: String, value: String) = this()
  def this(constructorGuard: js.Any, hex: String, value: String, format: FixedFormat) = this()
}
/* static members */
@JSImport("ethers", "ethers.FixedNumber")
@js.native
object FixedNumber extends js.Object {
  
  def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromBytes(value: BytesLike): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromString(value: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(
    value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
    decimals: js.UndefOr[BigNumberish],
    format: String
  ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(
    value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
    decimals: js.UndefOr[BigNumberish],
    format: FixedFormat
  ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber, decimals: BigNumberish): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
}
