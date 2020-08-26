package typings.ethersprojectBignumber

import typings.ethersprojectBignumber.bignumberMod.BigNumber
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/bignumber/lib/fixednumber", JSImport.Namespace)
@js.native
object fixednumberMod extends js.Object {
  @js.native
  class FixedFormat protected () extends js.Object {
    def this(constructorGuard: js.Any, signed: Boolean, width: Double, decimals: Double) = this()
    val _multiplier: String = js.native
    val decimals: Double = js.native
    val name: String = js.native
    val signed: Boolean = js.native
    val width: Double = js.native
  }
  
  @js.native
  class FixedNumber protected () extends js.Object {
    def this(constructorGuard: js.Any, hex: String, value: String) = this()
    def this(constructorGuard: js.Any, hex: String, value: String, format: FixedFormat) = this()
    val _hex: String = js.native
    val _isFixedNumber: Boolean = js.native
    val _value: String = js.native
    val format: FixedFormat = js.native
    def _checkFormat(other: FixedNumber): Unit = js.native
    def addUnsafe(other: FixedNumber): FixedNumber = js.native
    def divUnsafe(other: FixedNumber): FixedNumber = js.native
    def isZero(): Boolean = js.native
    def mulUnsafe(other: FixedNumber): FixedNumber = js.native
    def round(): FixedNumber = js.native
    def round(decimals: Double): FixedNumber = js.native
    def subUnsafe(other: FixedNumber): FixedNumber = js.native
    def toFormat(format: String): FixedNumber = js.native
    def toFormat(format: FixedFormat): FixedNumber = js.native
    def toHexString(): String = js.native
    def toHexString(width: Double): String = js.native
    def toUnsafeFloat(): Double = js.native
  }
  
  def formatFixed(value: BigNumberish): String = js.native
  def formatFixed(value: BigNumberish, decimals: String): String = js.native
  def formatFixed(value: BigNumberish, decimals: BigNumberish): String = js.native
  def parseFixed(value: String): BigNumber = js.native
  def parseFixed(value: String, decimals: BigNumberish): BigNumber = js.native
  /* static members */
  @js.native
  object FixedFormat extends js.Object {
    def from(value: js.Any): FixedFormat = js.native
  }
  
  /* static members */
  @js.native
  object FixedNumber extends js.Object {
    def from(value: js.Any): FixedNumber = js.native
    def from(value: js.Any, format: String): FixedNumber = js.native
    def from(value: js.Any, format: FixedFormat): FixedNumber = js.native
    def fromBytes(value: BytesLike): FixedNumber = js.native
    def fromBytes(value: BytesLike, format: String): FixedNumber = js.native
    def fromBytes(value: BytesLike, format: FixedFormat): FixedNumber = js.native
    def fromString(value: String): FixedNumber = js.native
    def fromString(value: String, format: String): FixedNumber = js.native
    def fromString(value: String, format: FixedFormat): FixedNumber = js.native
    def fromValue(value: BigNumber): FixedNumber = js.native
    def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: String): FixedNumber = js.native
    def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: FixedFormat): FixedNumber = js.native
    def fromValue(value: BigNumber, decimals: BigNumberish): FixedNumber = js.native
    def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
  }
  
}

