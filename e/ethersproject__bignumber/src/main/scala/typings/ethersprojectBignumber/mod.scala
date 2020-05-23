package typings.ethersprojectBignumber

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/bignumber", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BigNumber protected ()
    extends typings.ethersprojectBignumber.bignumberMod.BigNumber {
    def this(constructorGuard: js.Any, hex: String) = this()
  }
  
  @js.native
  class FixedFormat protected ()
    extends typings.ethersprojectBignumber.fixednumberMod.FixedFormat {
    def this(constructorGuard: js.Any, signed: Boolean, width: Double, decimals: Double) = this()
  }
  
  @js.native
  class FixedNumber protected ()
    extends typings.ethersprojectBignumber.fixednumberMod.FixedNumber {
    def this(constructorGuard: js.Any, hex: String, value: String) = this()
    def this(
      constructorGuard: js.Any,
      hex: String,
      value: String,
      format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat
    ) = this()
  }
  
  def formatFixed(value: BigNumberish): String = js.native
  def formatFixed(value: BigNumberish, decimals: String): String = js.native
  def formatFixed(value: BigNumberish, decimals: BigNumberish): String = js.native
  def parseFixed(value: String): typings.ethersprojectBignumber.bignumberMod.BigNumber = js.native
  def parseFixed(value: String, decimals: BigNumberish): typings.ethersprojectBignumber.bignumberMod.BigNumber = js.native
  /* static members */
  @js.native
  object BigNumber extends js.Object {
    def from(value: js.Any): typings.ethersprojectBignumber.bignumberMod.BigNumber = js.native
    def isBigNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FixedFormat extends js.Object {
    def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedFormat = js.native
  }
  
  /* static members */
  @js.native
  object FixedNumber extends js.Object {
    def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def from(value: js.Any, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def from(value: js.Any, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromBytes(value: BytesLike): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromBytes(value: BytesLike, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromBytes(value: BytesLike, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromString(value: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromString(value: String, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromString(value: String, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber, decimals: BigNumberish): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(
      value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: BigNumberish,
      format: String
    ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(
      value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: BigNumberish,
      format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat
    ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
  }
  
}

